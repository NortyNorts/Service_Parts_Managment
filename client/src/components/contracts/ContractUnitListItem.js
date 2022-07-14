import React from "react"
import {Link} from 'react-router-dom'

const ContractsUnitListItem = ({unit, changeUnit, getForecastParts})=>{

    

    const handleOnClick = function(value){
        const chosenUnit = value
        onUnitSelect(chosenUnit)
    }

    const onUnitSelect = function(theChosenUnit){
        changeUnit(theChosenUnit)
        console.log(theChosenUnit)
        getForecastParts()
    }

    return(
        <>
        <div className="bluebox">
            <Link to ='/contractsunitdetails' onClick={()=>handleOnClick(unit)} style={{ color: 'inherit', textDecoration: 'inherit'}}>
                <h2>{unit.unitType}</h2>
                <h3>Serial Number: {unit.serialNumber}</h3>
                <br></br>
                <h4> Hours Run: {unit.hoursRun}</h4> 
                <h4>Date Installed: {unit.dateInstalled}</h4> 
                <h4>Running Hours per Year: {unit.expectedRunHoursPerYear}</h4>
                <h4>Next Service Date: {unit.nextServiceDate}</h4>
            </Link>
        </div>
        </>
    )
}

export default ContractsUnitListItem