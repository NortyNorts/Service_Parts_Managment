import React from "react"
import {Link} from 'react-router-dom'

const ServiceUnitDetailsListItem = ({unit, changeUnit})=>{


    const handleOnClick = function(value){
        const chosenUnit = value
        onUnitSelect(chosenUnit)
    }

    const onUnitSelect = function(theChosenUnit){
        changeUnit(theChosenUnit)
    }

    return(
        <>
        <div className="bluebox">
            <Link to ='/serviceunitdetails' onClick={()=>handleOnClick(unit)} className = "removeUnderline" style={{ color: 'inherit', textDecoration: 'inherit'}}>
                <h2>{unit.serialNumber}</h2>
                <h3>{unit.unitType}</h3>
                <br></br>
                <h4> Hours Run:{unit.hoursRun}</h4>
                <h4>Expected Running Hours:{unit.expectedRunHoursPerYear}</h4>
                <br></br>
                <h4>Date Installed: {unit.dateInstalled}</h4> 
                <h4>Next Service Date: {unit.nextServiceDate}</h4>
            </Link>
        </div>
        </>
    )
}

export default ServiceUnitDetailsListItem