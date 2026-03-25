import React from 'react';
import './App.css';
import { BrowserRouter } from 'react-router-dom';
import Header from './Diagnosis/Header/Header';
import QuestionCard from './Diagnosis/QuestionCard/QuestionCard';
import DiagnosisBody from './Diagnosis/Body/Body';

function App() {
    return (
        <BrowserRouter>
            <div className={"App"}>
                <Header />
                <DiagnosisBody />
                <footer>
                </footer>
            </div>
        </BrowserRouter>
    );
}

export default App;
