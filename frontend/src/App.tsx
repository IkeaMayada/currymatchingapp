import { BrowserRouter, Routes, Route } from 'react-router-dom';
import './App.css';
import Header from './Diagnosis/Header/Header';
import QuestionCard from './Diagnosis/QuestionCard/QuestionCard';
import DiagnosisBody from './Diagnosis/Body/Body';
import Result from './Diagnosis/Result/Result';
import Body from "./Diagnosis/Body/Body";


function App() {

    return (
        <BrowserRouter>
            <div className={"App"}>
                <Header />
                <Routes>
                    <Route path="/" element={<Body />} />
                    <Route path="/result" element={<Result />} />
                </Routes>
                <footer>
                </footer>
            </div>

        </BrowserRouter>
    );
}

export default App;
