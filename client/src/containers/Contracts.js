import React from "react"
import {Link} from 'react-router-dom'
import '../css/main.css'


const Contracts = ({})=>{
    
    // customers, setCustomer

    return(
        <>  
            <div className="main-links">
                <ul>
                    <li><Link to ='/contractscustomerssection'> <h1>  Customers </h1>  </Link></li>
                    
                    <li><Link to ='/addcustomer'> <h1> Add Customer </h1></Link></li>
                </ul>
            </div>
        </>
    )
}

export default Contracts