import React from 'react';
import './App.css';
import { BrowserRouter } from 'react-router-dom';
import Header from './Diagnosis/Header/Header';
import QuestionCard from './Diagnosis/QuestionCard/QuestionCard';

function App() {
    return (
        <BrowserRouter>
            <div className={"App"}>
                <Header />
                <main>
                    <h1>Hello World</h1>
                </main>
                <footer>
                </footer>
            </div>
        </BrowserRouter>
    );
}

export default App;
