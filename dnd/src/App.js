import React from 'react';
import { BrowserRouter, Switch, Route } from 'react-router-dom'
import Wizard from './components/wizard.js'
import './App.css';

function App() {
  return (
    <div className="App">
            <BrowserRouter>
                  <Switch>
                        <Route exact route="/" component={Wizard}/>
                  </Switch>
            </BrowserRouter>



    </div>
  );
}

export default App;
