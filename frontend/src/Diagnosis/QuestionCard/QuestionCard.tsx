import React from 'react';

type ButtonProps = {
    label: string;
    onClick: () => void;
};

function QuestionCard(props: { question: string; onAnswer: (score: number) => void; }) {

    return (
        <div>
            <p>{props.question}</p>
            <button onClick={() => props.onAnswer(1)}>そう思わない</button>
            <button onClick={() => props.onAnswer(2)}>どちらかと言えばそう思わない</button>
            <button onClick={() => props.onAnswer(3)}>どちらでもない</button>
            <button onClick={() => props.onAnswer(4)}>どちらかと言えばそう思う</button>
            <button onClick={() => props.onAnswer(5)}>そう思う</button>
        </div>
    )
}

export default QuestionCard;