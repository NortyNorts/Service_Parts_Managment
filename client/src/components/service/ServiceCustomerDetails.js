import React, {useState} from "react";
import ServiceUnitDetails from "./ServiceUnitDetails";

const ServiceCustomerDetails = ({changeUnit, units})=>{
    
    const [query, setQuery] = useState("")

    const filteredUnitsArray = units.filter(unit=>{
        if (query === '') {
            return true;
          } 
          
          else if (unit.serialNumber.toLowerCase().includes(query.toLowerCase())) {
            return true;
          } 
          
          else if (unit.dateInstalled.toLowerCase().includes(query.toLowerCase())) {
            return true;
          }

          else {
            return false
          }
        })
      

        const unitsComponents = filteredUnitsArray.map((unit, index)=>{
            return <ServiceUnitDetails value={index} unit={unit} changeUnit={changeUnit} key={index}/>
        })


    return(
        <>
            <input placeholder="Unit Search" onChange={event => setQuery(event.target.value)} />
            {unitsComponents}
        </>
    )
}

export default ServiceCustomerDetails