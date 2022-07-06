import React from "react"
import CustomerList from "./CustomerList"
import { Link } from "react-router-dom"

const Customers = ({customers, setCustomer})=>{
    
    
    return(
        <>
            <CustomerList customers={customers} setCustomer={setCustomer}/>
            {/* <Link to ='/Units'> <h1>  Units </h1>  </Link> */}
        </>
    )
}

export default Customers
