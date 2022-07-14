import React, {useState} from "react";
import PartsServices from "../../services/PartsServices";
import { useHistory } from "react-router-dom";


const NextServicePartsUnit = ({currentUnitParts, currentCustomer, changeCustomer})=>{

    const history = useHistory();

    const handleChangePart = (part)=>{
        PartsServices.changePart(part.id)
        .then(()=>{
            changeCustomer(currentCustomer)
        })
        history.goBack();
        history.goBack();
    }

    const filteredCustomersArray = currentUnitParts.filter(part=>{
        if (part.changePart === true) {
            return true;
        }
        else if(part.changePart === false){
            return false;
        }
        

    })

    const tableData = filteredCustomersArray.map((part)=>{
        return(
        <tr className="styled-table">
            <td>{part.part.partName}</td>
            <td>{part.part.partNumber}</td>
            <td>{part.hoursRun}</td>
            <td>{part.part.changeByHour}</td>
            <td>{part.lastChangedDate}</td>
            <td>{part.part.changeByNumberOfMonths}</td>
            <td><button onClick={() => handleChangePart(part)}>Change Part</button></td>
        </tr>
    )
    })

    return(
        <>

            <br/>
            <br/>

            <section>
                <table className="styled-table">
                    <tr>
                        <th>Part Name</th>
                        <th>Part Number</th>
                        <th>Hours Run</th>
                        <th>Change By Hour</th>
                        <th>Last Changed</th>
                        <th>Change by Months</th>
                    </tr>

                    {tableData}
                    
                </table>
            </section>

            <br/>
            <br/>

        </>
    )
}

export default NextServicePartsUnit