import React, {useState} from 'react';
import './QuestionCard.css';

type ButtonProps = {
    label: string;
    onClick: () => void;
};

function QuestionCard({ question, onAnswer }: { question: string; onAnswer: (score: number) => void; }) {

    const [isHovered, setIsHovered] = useState<number | null>(null);

    const [isAnswered, setIsAnswered] = useState<number | null>(null);

    const buttonStyle = {
        backgroundColor: 'transparent',
        width : '50px',
        height : '50px',
        border : 'none',
        cursor : 'pointer',
    }

    return (
    <div className="question-box">
        <p className="question-card-text">{question}</p>
            <div className="button-display">
                <span className="button-label-left">そう思わない</span>

                <button className="button"
                        onMouseOver={() => setIsHovered(1)}
                        onMouseLeave={() => setIsHovered(null)}
                        onClick={() => { onAnswer(1); setIsAnswered(1); }} >
                <img src={isAnswered === 1 ? "/answer1.svg" : isHovered === 1 ? "/answer1.svg" : "/answerDefault.svg"} alt="Answer" style={buttonStyle} />
                </button>
                <button className="button"
                        onMouseOver={() => setIsHovered(2)}
                        onMouseLeave={() => setIsHovered(null)}
                        onClick={() => { onAnswer(2); setIsAnswered(2); }} >
                    <img src={isAnswered === 2 ? "/answer2.svg" : isHovered === 2 ? "/answer1.svg" : "/answerDefault.svg"} alt="Answer" style={buttonStyle} />
                </button>
                <button className="button"
                        onMouseOver={() => setIsHovered(3)}
                        onMouseLeave={() => setIsHovered(null)}
                        onClick={() => { onAnswer(3); setIsAnswered(3); }} >
                    <img src={isAnswered === 3 ? "/answer3.svg" : isHovered === 3 ? "/answer1.svg" : "/answerDefault.svg"} alt="Answer" style={buttonStyle} />
                </button>
                <button className="button"
                        onMouseOver={() => setIsHovered(4)}
                        onMouseLeave={() => setIsHovered(null)}
                        onClick={() => { onAnswer(4); setIsAnswered(4); }} >
                    <img src={isAnswered === 4 ? "/answer4.svg" : isHovered === 4 ? "/answer1.svg" : "/answerDefault.svg"} alt="Answer" style={buttonStyle} />
                </button>
                <button className="button"
                        onMouseOver={() => setIsHovered(5)}
                        onMouseLeave={() => setIsHovered(null)}
                        onClick={() => { onAnswer(5); setIsAnswered(5); }} >
                    <img src={isAnswered === 5 ? "/answer5.svg" : isHovered === 5 ? "/answer1.svg" : "/answerDefault.svg"} alt="Answer" style={buttonStyle} />
                </button>
                <span className="button-label-right">そう思う</span>
            </div>
        </div>
    );
}

export default QuestionCard;