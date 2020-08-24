import React, { Component } from 'react'

class wizard extends Component{
    render(){

    let characterName = "Mathias the Keeper"

    let classAndLevel = "Wizard 1"

    let race = "Human"

    let background = "Sage - Wizard's Apprentice"

    let alignment = "Chaotic Neutral"

    let playerName = "Casey"

    let experiencePoints = 0

    let age = 23

    let height = "5'10"

    let weight = 145

    let eyes = "Brown"

    let skin = "Olive"

    let hair = "Graying"


    let personalityTraits = "Used to helping out those not as smart, patiently explained anything and everything to others. There's nothing like a good mystery."

    let ideals = "Nothing should fetter the infinite possibility inherent in all existence."

    let bonds = "Life's work is a series of tomes related to specific field of lore (spirit alchemy)."

    let flaws = "Easily distracted by the promise of new information."

    let featuresAndTraits1 = "Arcane Recovery - Once per day after a short rest, can choose spell slots to recover. The combined  spell slots must have a combined level equal to or less than half your wizard level (rounded up) and none can be level 6 or higher."

    let featuresAndTraits2 = "Sage Feature: Researcher - When attempting to learn or recall a piece of lore, if the information is unknown, the Sage often knows where and from whom it can be obtained. Usually this comes from a library, scriptorium, university, or sage or other learned creature. The DM might rule that the knowledge is secreted away in an almost inaccessible place, or that is simply cannot be found."

    let proficiencies = "Daggers, darts, slings, quarter staffs, light crossbows"

    let languages = "Common, Elvish, Dwarvish"

    let treasure = "Spellbook - Prepare a list of wizard spells available to cast equal to your INT modifier + Wizard Level (minimum: 1). The spells must be of a level for which the owner of the spellbook has spell slots. Can change the prepared list after a long rest. Each spell prepared takes at least one minute per spell level."

    let armorClass = 12

    let initiative = "+" + 2

    let speed = "30 ft"

    let mainStrength = "0"

    let mainDexterity = "+2"

    let mainConstitution = "-1"

    let mainIntelligence = "+3"

    let mainWisdom = "+2"

    let mainCharisma = "+1"


        return(
            <div>
                <h3>Character Name</h3>
                    <p>{characterName}</p>
            <div>

             <table>
                    <thead>
                           <tr>
                                <th>Initiative</th>
                                <th>Armor Class</th>
                                <th>Speed</th>
                           </tr>
                    </thead>
                    <tbody>
                           <tr>
                                 <td>{initiative}</td>
                                 <td>{armorClass}</td>
                                 <td>{speed}</td>
                           </tr>
                    </tbody>
             </table>

             <table>
                    <thead>
                            <tr>
                                <th>Strength</th>
                                <th>Dexterity</th>
                                <th>Constitution</th>
                                <th>Intelligence</th>
                                <th>Wisdom</th>
                                <th>Charisma</th>
                            </tr>
                    </thead>
                    <tbody>
                            <tr>
                                <td>{mainStrength}</td>
                                <td>{mainDexterity}</td>
                                <td>{mainConstitution}</td>
                                <td>{mainIntelligence}</td>
                                <td>{mainWisdom}</td>
                                <td>{mainCharisma}</td>
                            </tr>
                    </tbody>
             </table>





                <table cellpadding="5px" cellspacing="5px">
                    <thead>
                        <tr>
                            <th width={100} height={50}>Class Level</th>
                            <th width={100} height={50}>Race</th>
                            <th width={100} height={50}>Background</th>
                            <th width={100} height={50}>Alignment</th>
                            <th width={100} height={50}>Player Name</th>
                            <th width={100} height={50}>Experience Points</th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr>
                            <td width={100} height={50}>{classAndLevel}</td>
                            <td width={100} height={50}>{race}</td>
                            <td width={100} height={50}>{background}</td>
                            <td width={100} height={50}>{alignment}</td>
                            <td width={100} height={50}>{playerName}</td>
                            <td width={100} height={50}>{experiencePoints}</td>
                        </tr>
                    </tbody>
                </table>
            </div>

                <table cellpadding="5px" cellspacing="5px">
                    <thead>
                        <tr>
                            <th width={100} height={50}>Age</th>
                            <th width={100} height={50}>Height</th>
                            <th width={100} height={50}>Weight</th>
                            <th width={100} height={50}>Eyes</th>
                            <th width={100} height={50}>Skin</th>
                            <th width={100} height={50}>Hair</th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr>
                            <td width={100} height={50}>{age}</td>
                            <td width={100} height={50}>{height}</td>
                            <td width={100} height={50}>{weight}</td>
                            <td width={100} height={50}>{eyes}</td>
                            <td width={100} height={50}>{skin}</td>
                            <td width={100} height={50}>{hair}</td>
                        </tr>
                    </tbody>
                </table>







                <table cellpadding="5px" cellspacing="5px">
                    <thead>
                        <tr>
                            <th>Personality Traits</th>
                            <th>Ideals</th>
                            <th>Bonds</th>
                            <th>Flaws</th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr>
                            <td>{personalityTraits}</td>
                            <td>{ideals}</td>
                            <td>{bonds}</td>
                            <td>{flaws}</td>
                        </tr>
                    </tbody>
                </table>
                <h3>Features and Traits</h3> <p>{featuresAndTraits1}</p> <p>{featuresAndTraits2}</p>

                <table cellpadding="5px" cellspacing="5px">
                    <thead>
                        <tr>
                            <th>Proficiencies</th>
                            <th>Languages</th>
                            <th>Treasures</th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr>
                            <td>{proficiencies}</td>
                            <td>{languages}</td>
                            <td>{treasure}</td>
                        </tr>
                    </tbody>
                </table>


            </div>
        )
    }
}

export default wizard