import React, { Component } from 'react'

import { Link } from 'react-router-dom'

class WizardCharacter extends Component{
    render(){
        return(
            <div>
                <Link to="/">Home</Link>
                <Link to="/wizard-character">Wizard Characters</Link>
            </div>
        )
    }
}

export default WizardCharacter