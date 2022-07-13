import React, {useState} from "react";
import CustomersServices from "../../services/CustomersServices";

const UnitPartsForecast = ({currentCustomer, currentUnit})=>{

    const [forecastParts, setForecastParts] = useState([])

    const handleClick = ()=>{
        CustomersServices.getForecastParts(currentCustomer.id, currentUnit.id)
        .then(parts => setForecastParts(parts))
    }
    
    const handleClick2 = ()=>{
        console.log(forecastParts)
    }
    
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
            <td>{part.part_id}</td>
            <td>{part.nextservicedate}</td>
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

                <button onClick={handleClick}>Get data</button>

                <button onClick={handleClick2}>Print data</button>
            </section>

            
        </>
    )
}

export default UnitPartsForecast