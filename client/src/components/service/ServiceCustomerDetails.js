import React, {useState} from "react";
import { Link } from "react-router-dom";
import CustomersServices from "../../services/CustomersServices";
import ServiceUnitListItem from "./ServiceUnitListItem";
import '../../css/main.css'

const ServiceCustomerDetails = ({currentCustomer, changeUnit, changePartFunction, changeCustomer})=>{
    
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
            return <ServiceUnitListItem value={index} unit={unit} changeUnit={changeUnit} key={index}/>
        })

        const handleBookServiceClick = ()=>{
            changePartFunction(currentCustomer)
            changeCustomer(currentCustomer)
        }

    return(
        <>

            <div className="bluebox4">
                <h2>{currentCustomer.companyName}</h2>
                <h3>{currentCustomer.siteName}</h3>
                <br></br> 
                <h4>{currentCustomer.siteAddress}</h4>
                <h4>{currentCustomer.sitePostCode}</h4>
                <h4>Next service date: {currentCustomer.nextServiceDate}</h4>
                <h4>Visits per year: {currentCustomer.engineerVisitsPerYear}</h4>
            </div>

        <div className="link-buttons">       
            <div className="link-button">
              <li>
                    <Link to ='/serviceupdatecustomer' style={{ color: 'inherit', textDecoration: 'inherit'}}>
                        Update Next Service Date
                    </Link>
                </li>
            </div>

            <div className="link-button">
              <li>
                    <Link to ='/nextserviceparts' style={{ color: 'inherit', textDecoration: 'inherit'}}>
                        Next Service Parts
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

export default ServiceCustomerDetails