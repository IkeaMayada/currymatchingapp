import React, { useState, useEffect } from 'react';
import { useNavigate } from 'react-router-dom';
import QuestionCard from '../QuestionCard/QuestionCard';

interface Question {
    questionnaireId: number;
    questionnaireType: number;
    question: string;
    reversedScore: boolean;
}

function DiagnosisBody() {

    const [questions, setQuestions] = useState<Question[]>([]);

    const [answers, setAnswers] = useState<number[]>([]);

    const handleAnswer = (score: number, index: number) => {
        const newAnswers = [...answers];
        newAnswers[index] = score;
        setAnswers(newAnswers);
    };

    const [currentPage, setCurrentPage] = useState(1);

    const handleNextPage = () => {
        setCurrentPage(currentPage + 1);
    };

    const handlePrevPage = () => {
        setCurrentPage(currentPage - 1);
    }

    const navigate = useNavigate();

    const diagnosis = () => {
        fetch('http://localhost:8080/api/diagnosis', {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json',
            },
            body: JSON.stringify({
                answers: answers,
                gender: "MALE",
                age: "20s",
            }),
        })
        .then(response => response.json())
            .then(data => navigate('/result', { state: data }))
            .catch(error => console.error('Error:', error));
    }

    useEffect(() => {
        fetch('http://localhost:8080/api/questionnaire')
            .then(response => response.json())
            .then(data => setQuestions(data))
            .catch(error => console.error('Error fetching questions:', error));
    }, []);

    return (
        <div>
            {questions.slice((currentPage - 1) * 10, currentPage * 10).map((question, index) => (
                <QuestionCard
                    key={index}
                    question={question.question}
                    onAnswer={(score) => handleAnswer(score, (currentPage - 1) * 10 + index)}
                />
            ))}

            <button onClick={handlePrevPage} disabled={currentPage === 1}>
                前のページ
            </button>
            {currentPage === Math.ceil(questions.length / 10)
                ? <button onClick={diagnosis}>診断する</button>
                : <button onClick={handleNextPage}>次のページ</button>
            }

            <p>{JSON.stringify(answers)}</p>
        </div>

    );
}

export default DiagnosisBody;