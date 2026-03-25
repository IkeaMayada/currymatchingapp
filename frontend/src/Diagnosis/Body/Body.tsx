import { useState, useEffect } from 'react';

interface Question {
    questionnaireId: number;
    questionnaireType: number;
    question: string;
    reversedScore: boolean;
}

function DiagnosisBody() {

    const [questions, setQuestions] = useState<Question[]>([]);

    console.log(questions)
    useEffect(() => {
        fetch('http://localhost:8080/api/questionnaire')
            .then(response => response.json())
            .then(data => setQuestions(data))
            .catch(error => console.error('Error fetching questions:', error));
    }, []);

    console.log(questions)
    return (
        <div>
            {questions.map((question, index) => (
                <div key={index}>{question.questionnaireId}</div>
            ))}
        </div>
    );
}

export default DiagnosisBody;