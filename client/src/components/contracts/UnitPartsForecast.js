import React, {useState} from "react";
import CustomersServices from "../../services/CustomersServices";

const UnitPartsForecast = ({forecastParts})=>{

    
    const filteredCustomersArray = forecastParts.filter(part=>{
        if (part.changebyhourslapsed === true){
            return true;
        }
        else if(part.servicetimeLapsed === true){
            return true;
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
            <h1>12 Months Parts Forecast:</h1>

            <section>
                <table className="styled-table">
                    <tr>
                        <th>Part Name</th>
                        <th>Part Number</th>
                    </tr>

                    {tableData}
                    
                </table>
            </section>

            
        </>
    )
}

export default UnitPartsForecast