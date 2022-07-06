import React from "react"
import Customers from "../components/Customers"
import {Link} from 'react-router-dom'



const Contracts = ({})=>{
    
    // customers, setCustomer

    return(
        <>
            <h2>
                This the the Contracts container.
            </h2>
            <Link to ='/customers'> <h1>  Customers </h1>  </Link>
            {/* <Customers customers={customers} setCustomer={setCustomer}/> */}
        </>
    )
}

export default Contracts