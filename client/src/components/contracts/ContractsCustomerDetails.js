import React, {useState} from "react";
import { Link } from "react-router-dom";
import ContractsUnitListItem from "./ContractUnitListItem";
import '../../css/main.css'
import CustomersServices from "../../services/CustomersServices";

const ContractsCustomerDetails = ({currentCustomer, changeUnit, getForecastParts})=>{

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
            return <ContractsUnitListItem value={index} unit={unit} changeUnit={changeUnit} key={index} getForecastParts={getForecastParts}/>
        })

    return(
        <>


          <div className="link-buttons">
          <div className="link-button">
              <li>
                    <Link to ='/contractsupdatecustomer' style={{ color: 'inherit', textDecoration: 'inherit'}}>
                        Update Customer Details
                    </Link>
                </li>
            </div>
            </div>


            <div className="bluebox4">
                <h2>{currentCustomer.companyName}</h2>
                <h3>{currentCustomer.siteName}</h3> 
                <h4>{currentCustomer.siteAddress}</h4>
                <h4>{currentCustomer.sitePostCode}</h4>
                <br></br>
                <h4>Next service date</h4>
                <h4>{currentCustomer.nextServiceDate}</h4>
                <h4>Visits per year: {currentCustomer.engineerVisitsPerYear}</h4>
            </div>


            <div className="link-buttons">
            <div className="link-button">
              <li>
                <Link to ='/addunit' style={{ color: 'inherit', textDecoration: 'inherit'}}>
                    Add Unit
                </Link>
              </li>
            </div>

          </div>

            <input className="searchbar" placeholder="Unit Search" onChange={event => setQuery(event.target.value)} />


            <div className="flex">
            {unitsComponents}
            </div>
        </>
    )
}

export default ContractsCustomerDetails