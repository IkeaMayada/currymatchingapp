import React from 'react';
import { useLocation } from 'react-router-dom';

function Result() {
    const location = useLocation();

    const data = location.state;

    return (
        <div>
            <p>{data.mbtiType}</p>
            <p>{data.mbtiSubtype}</p>
        </div>
    );
}

export default Result;