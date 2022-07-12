import React from "react"
import '../../css/table.css'

const ContractsUnitDetails = ({currentUnit, currentUnitParts})=>{


    const tableData = currentUnitParts.map((part)=>{
        return(
        <tr className="styled-table">
            <td>{part.part.partName}</td>
            <td>{part.part.partNumber}</td>
            <td>{part.hoursRun}</td>
            <td>{part.lastChangedDate}</td>
            <td>{part.part.changeByHour}</td>
            <td>{part.part.changeByNumberOfMonths}</td>
        </tr>
    )
    })

    return(
        <>
            <div>
                <p>{currentUnit.unitType}</p>
                <p>{currentUnit.serialNumber}</p>
                <p> Hours Run: {currentUnit.hoursRun}</p> 
                <p>Date Installed: {currentUnit.dateInstalled}</p> 
                <p>Expected Running Hours per Year: {currentUnit.expectedRunHoursPerYear}</p>
                <p>Next Service Date: {currentUnit.nextServiceDate}</p>
            </div>

            <section>
                <table className="styled-table">
                    <tr>
                        <th>Part Name</th>
                        <th>Part Number</th>
                        <th>Hours Run</th>
                        <th>Last Changed</th>
                        <th>Change By Hour</th>
                        <th>Change by Months</th>
                    </tr>

                    {tableData}

                </table>
            </section>
        </>
    )
}

export default ContractsUnitDetails