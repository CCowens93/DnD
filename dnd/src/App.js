import React from 'react';
import { BrowserRouter, Switch, Route} from 'react-router-dom'
import Home from './components/home.js'
import Wizard from './components/wizard.js'
import CreateWizard from './components/createWizard.js'
import WizardCharacter from './components/wizardCharacter.js'
import './App.css';

function App() {
  return (
    <div className="App">
            <BrowserRouter>
                  <Switch>
                        <Route exact path="/" component={Home}/>


                  </Switch>

                  <Switch>

                        <Route path="/wizard" component={Wizard}/>

                        <Route path="/create" component={CreateWizard}/>

                        <Route path="/wizard-character" component={WizardCharacter}/>
                  </Switch>

            </BrowserRouter>



    </div>
  );
}

export default App;
