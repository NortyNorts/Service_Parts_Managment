import React, {useState} from "react";
import { Link } from "react-router-dom";
import ContractsUnitListItem from "./ContractUnitListItem";
import '../../css/main.css'

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
              <li>
                <Link to ='/customerpartsforecast'>
                    Customer Parts Forecast
                </Link>
              </li>
            </div>

            <div className="link-button">
              <li>
                <Link to ='/addunit' style={{ color: 'inherit', textDecoration: 'inherit'}}>
                    <h3>Add Unit</h3>
                </Link>
              </li>
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