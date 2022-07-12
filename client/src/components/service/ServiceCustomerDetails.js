import React, {useState} from "react";
import { Link } from "react-router-dom";
import CustomersServices from "../../services/CustomersServices";
import ServiceUnitListItem from "./ServiceUnitListItem";
import '../../css/main.css'

const ServiceCustomerDetails = ({currentCustomer, changeUnit, changePartFunction})=>{
    
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
        }

    return(
        <>
            <div className="link-button">
              <li>
                    <Link to ='/nextserviceparts' style={{ color: 'inherit', textDecoration: 'inherit'}}>
                        Next Service Parts
                    </Link>
                </li>
            </div>

            <div className="link-button">
                <li>
                    <Link to ='/bookservice' onClick={handleBookServiceClick} style={{ color: 'inherit', textDecoration: 'inherit'}}>
                        Book Service
                    </Link>
                </li>
            </div>

            <div className="link-button">
                <li>
                    <Link to ='/addunit' style={{ color: 'inherit', textDecoration: 'inherit'}}>
                        Add Unit
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

export default ServiceCustomerDetails