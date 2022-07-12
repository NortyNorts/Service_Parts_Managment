import React from "react";
import '../../css/bookservice.css'
import PartsServices from "../../services/PartsServices";

const BookService = ({currentCustomer, currentUserParts, changePartFunction})=>{

    const handleChangePart = (part)=>{
        PartsServices.changePart(part.id)
        .then(()=>{
            changePartFunction(currentCustomer)
        })
    }

    const filteredCustomersArray = currentUserParts.filter(part=>{
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
            <td>{part.part.hoursRun}</td>
            <td>{part.part.changeByHour}</td>
            <td>{part.part.lastChangedDate}</td>
            <td>{part.part.changeByNumberOfMonths}</td>
            <td><button onClick={() => handleChangePart(part)}>Change Part</button></td>
        </tr>
    )
    })

    const confirmService = ()=>{
        
    }

    return(
        <>
                <ul>
                    {/* <button>Additional parts</button> */}
                
                    <button onClick={confirmService}>Complete Service</button>

                </ul>

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
        </>
    )
}

export default BookService