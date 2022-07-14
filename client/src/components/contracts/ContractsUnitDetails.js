import React from "react"
import { Link } from "react-router-dom"
import '../../css/table.css'
import '../../css/main.css'


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
        
        <div className="link-buttons">

            <div className="link-button">
              <li>
                <Link to ='/unitpartsforecast' style={{ color: 'inherit', textDecoration: 'inherit'}}>
                    Unit Parts Forecast
                </Link>
              </li>
            </div>
            
            <div className="link-button">
              <li>
                <Link to ='/contractsupdateunit' style={{ color: 'inherit', textDecoration: 'inherit'}}>
                    Update Unit Details
                </Link>
              </li>
            </div>
            
        </div>

            <div className="bluebox">
                <h2>{currentUnit.serialNumber}</h2>
                <h3>{currentUnit.unitType}</h3>
                <br></br>
                <h4> Hours Run: {currentUnit.hoursRun}</h4>
                <h4>Expected Running Hours: {currentUnit.expectedRunHoursPerYear}</h4>
                <br></br>
                <h4>Date Installed: {currentUnit.dateInstalled}</h4> 
                <h4>Next Service Date: {currentUnit.nextServiceDate}</h4>
            </div>

            <br></br>

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