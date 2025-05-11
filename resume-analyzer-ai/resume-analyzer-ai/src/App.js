
import React, { useState } from 'react';
import './App.css';
import { Chart } from 'chart.js/auto';

function App() {
  const [resumeText, setResumeText] = useState('');
  const [jobDesc, setJobDesc] = useState('');
  const [score, setScore] = useState(null);

  const analyzeResume = () => {
    const resumeWords = resumeText.toLowerCase().split(/\s+/);
    const jdWords = jobDesc.toLowerCase().split(/\s+/);
    const matchCount = jdWords.filter(word => resumeWords.includes(word)).length;
    const matchScore = Math.round((matchCount / jdWords.length) * 100);
    setScore(matchScore);
  };

  return (
    <div className="App">
      <h1>AI-Powered Resume Analyzer</h1>
      <textarea placeholder="Paste your resume..." rows="10" onChange={e => setResumeText(e.target.value)} />
      <textarea placeholder="Paste job description..." rows="10" onChange={e => setJobDesc(e.target.value)} />
      <button onClick={analyzeResume}>Analyze</button>
      {score !== null && <h2>Match Score: {score}%</h2>}
    </div>
  );
}

export default App;
