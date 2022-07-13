import React, {useState} from "react";
import { Link } from "react-router-dom";
import ContractsUnitListItem from "./ContractUnitListItem";
import '../../css/main.css'
import CustomersServices from "../../services/CustomersServices";

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
                <Link to ='/addunit' style={{ color: 'inherit', textDecoration: 'inherit'}}>
                    Add Unit
                </Link>
              </li>
            </div>

            <div>
                <h3>{currentCustomer.companyName}</h3>
                <p>{currentCustomer.siteName}</p> 
                <p>{currentCustomer.siteAddress}</p>
                <p>{currentCustomer.sitePostCode}</p>
                <p>Next service date: {currentCustomer.nextServiceDate}</p>
                <p>Visits per year: {currentCustomer.engineerVisitsPerYear}</p>
            </div>

            <h1>Customers Units</h1>

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