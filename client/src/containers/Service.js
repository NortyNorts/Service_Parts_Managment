import React from "react"
import {Link} from 'react-router-dom'
import CustomerList from "../components/CustomerList"

const Service = (()=>{
    return(
        <>
            <h2>
                This the the Service container.
            </h2>
            <Link to ='/Customers'> <h1>  Customers </h1>  </Link>
            
        </>
    )
})

export default Service