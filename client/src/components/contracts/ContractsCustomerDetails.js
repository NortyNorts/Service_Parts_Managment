import React, {useState} from "react";
import { Link } from "react-router-dom";
import ContractsUnitListItem from "./ContractUnitListItem";

const ContractsCustomerDetails = ({currentCustomer, changeUnit})=>{

    const [query, setQuery] = useState("")

    const filteredUnitsArray = currentCustomer.units.filter(unit=>{
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
            return <ContractsUnitListItem value={index} unit={unit} changeUnit={changeUnit} key={index}/>
        })


    return(
        <>
            <div className="link-button">
              <Link to ='/customerpartsforecast'>
                  <h3>Customer Parts Forecast</h3>
              </Link>
            </div>

            <div className="link-button">
            <Link to ='/nextserviceparts'>
                <h3>Next Service Parts</h3>
            </Link>
            </div>

            <div className="link-button">
            <Link to ='/addunit'>
                <h3>Add Unit</h3>
            </Link>
            </div>

            <div className="search-bar">
            <input placeholder="Unit Search" onChange={event => setQuery(event.target.value)} />
            </div>

            <div className="list">
            {unitsComponents}
            </div>
        </>
    )
}

export default ContractsCustomerDetails