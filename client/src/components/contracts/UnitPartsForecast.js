import React, {useState} from "react";
import CustomersServices from "../../services/CustomersServices";

const UnitPartsForecast = ({forecastParts})=>{

    
    const filteredCustomersArray = forecastParts.filter(part=>{
        if (part.changebyhourslapsed === true || part.servicetimeLapsed === true) {
            return true;
        }
        else if(part.changebyhourslapsed === false || part.servicetimeLapsed === false){
            return false;
        } 
    })

    const tableData = filteredCustomersArray.map((part)=>{
        return(
        <tr className="styled-table">
            <td>{part.part_name}</td>
            <td>{part.part_number}</td>
        </tr>
    )
    })


    return(
        <>
            <h1>Unit parts required for the next 12 months:</h1>

            <section>
                <table className="styled-table">
                    <tr>
                        <th>Part Id</th>
                        <th>Next Service Date</th>
                    </tr>

                    {tableData}
                    
                </table>
            </section>

            
        </>
    )
}

export default UnitPartsForecast