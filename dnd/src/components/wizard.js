import React, { Component } from 'react'

class wizard extends Component{
    render(){

    let characterName = "Mathias the Keeper"

    let classAndLevel = "Wizard 1"

    let race = "Human"

    let background = "Sage - Wizard's Apprentice"

    let alignment = "Chaotic Neutral"

    let playerName = "Casey"


    let personalityTraits = "Used to helping out those not as smart, patiently explained anything and everything to others. There's nothing like a good mystery."

    let ideals = "Nothing should fetter the infinite possibility inherent in all existence."

    let bonds = "Life's work is a series of tomes related to specific field of lore (spirit alchemy)."

    let flaws = "Easily distracted by the promise of new information."


    let experiencePoints = 1
        return(
            <div>
                <h1>Character Name</h1>
                    <p>{characterName}</p>

                <table>
                    <thead>
                        <tr>
                            <th width={200}>Class Level</th>
                            <th width={200}>Race</th>
                            <th width={200}>Background</th>
                            <th width={200}>Alignment</th>
                            <th width={200}>Player Name</th>
                            <th width={200}>Experience Points</th>
                        </tr>
                    </thead>
                    <tbody>
                            <td>{classAndLevel}</td>
                            <td>{race}</td>
                            <td>{background}</td>
                            <td>{alignment}</td>
                            <td>{playerName}</td>
                            <td>{experiencePoints}</td>
                    </tbody>
                </table>


            </div>
        )
    }
}

export default wizard