import React from "react"
import {Link} from 'react-router-dom'

const ServiceUnitDetails = ({unit, changeUnit})=>{


    const handleOnClick = function(value){
        const chosenUnit = value
        onUnitSelect(chosenUnit)
    }

    const onUnitSelect = function(theChosenUnit){
        changeUnit(theChosenUnit)
    }

    return(
        <>
            <Link to ='/units' onClick={()=>handleOnClick(unit)}>
                <h3>Serial Number: {unit.serialNumber}</h3>
            </Link>
                <p> Hours Run: {unit.hoursRun}</p> 
                <p>Date Installed: {unit.dateInstalled}</p> 
                <p>Expected Running Hours per Year: {unit.expectedRunHoursPerYear}</p>
                <p>Next Service Date: {unit.nextServiceDate}</p>
        </>
    )
}

export default ServiceUnitDetails