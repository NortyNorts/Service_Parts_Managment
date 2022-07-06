import React from "react"
import {Link} from 'react-router-dom'

const Unit = ({unit})=>{


    const handleOnClick = function(value){
        const chosenUnit = value
        onUnitSelect(chosenUnit)
    }

    

    return(
        <>
            <Link to ='/units' onClick={()=>handleOnClick(unit)}>
                Serial Number: {unit.serialNumber} 
                Hours Run: {unit.hoursRun} 
                Date Installed: {unit.dateInstalled} 
                Expected Running Hours per Year: {unit.expectedRunHoursPerYear}
                Next Service Date: {unit.nextServiceDate}
                Next Service Hours: {unit.nextServiceHours}
                Increased Run Hours: {unit.increasedRunHours}
            </Link>
        </>
    )
}

export default Unit