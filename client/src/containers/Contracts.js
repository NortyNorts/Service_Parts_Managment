import React from "react"
import {Link} from 'react-router-dom'



const Contracts = ({})=>{
    
    // customers, setCustomer

    return(
        <>
            <h2>
                This the the Contracts container.
            </h2>
            <Link to ='/contractscustomerssection'> <h1>  Customers </h1>  </Link>
            <Link to ='/addcustomer'> <h1> Add Customer </h1></Link>
        </>
    )
}

export default Contracts