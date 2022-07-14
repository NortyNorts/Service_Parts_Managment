import React from "react";
import { Link } from "react-router-dom";
import PartsServices from "../../services/PartsServices";

const ServiceUnitDetails = ({currentUnit, currentUnitParts})=>{

    // const handleChangePart = (part)=>{
    //     PartsServices.changePart(part.id)
    // }

    const tableData = currentUnitParts.map((part)=>{
        return(
        <tr className="styled-table">
           <td>{part.part.partName}</td>
            <td>{part.part.partNumber}</td>
            <td>{part.hoursRun}</td>
            <td>{part.lastChangedDate}</td>
            <td>{part.part.changeByHour}</td>
            <td>{part.part.changeByNumberOfMonths}</td>
            {/* <td><button onClick={() => handleChangePart(part)}>Change Part</button></td> */}
        </tr>
    )
    })

    return(
        <>
            
            <div className="link-buttons">

            <div className="link-button">
              <li>
                    <Link to ='/serviceupdateunit' style={{ color: 'inherit', textDecoration: 'inherit'}}>
                        Update Running Hours
                    </Link>
                </li>
            </div>

            <div className="link-button">
              <li>
                    <Link to ='/nextservicepartsunit' style={{ color: 'inherit', textDecoration: 'inherit'}}>
                        Next Service Parts
                    </Link>
                </li>
            </div>

            </div>

            <div className="bluebox">
                <h2>{currentUnit.serialNumber}</h2>
                <h3>{currentUnit.unitType}</h3>
                <br></br>
                <h4> Total Hours: {currentUnit.hoursRun}</h4>
                <h4>Expected Running: {currentUnit.expectedRunHoursPerYear}</h4>
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

export default ServiceUnitDetails