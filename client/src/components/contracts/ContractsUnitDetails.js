import React from "react"

const ContractsUnitDetails = ({currentUnit})=>{
    
    return(
        <>
            <h2>{currentUnit.unitType}</h2>
            <h3>{currentUnit.serialNumber}</h3>
            <p> Hours Run: {currentUnit.hoursRun}</p> 
            <p>Date Installed: {currentUnit.dateInstalled}</p> 
            <p>Expected Running Hours per Year: {currentUnit.expectedRunHoursPerYear}</p>
            <p>Next Service Date: {currentUnit.nextServiceDate}</p>
        </>
    )
}

export default ContractsUnitDetails