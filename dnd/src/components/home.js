import React, { Component} from 'react'

import { Link } from 'react-router-dom'

class Home extends Component{
    render(){
        return(
            <div>
                <p>Hullo</p>
                <Link to="/wizard">Wizard</Link>
            </div>
        )
    }

}

export default Home