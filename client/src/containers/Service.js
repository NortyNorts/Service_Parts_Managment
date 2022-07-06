import React from "react"
import {Link} from 'react-router-dom'
import CustomerList from "../components/CustomerList"

const Service = (()=>{
    return(
        <>
            <h2>
                This the the Service container.
            </h2>
            <Link to ='/Units'> <h1>  Units </h1>  </Link>
            <CustomerList/>
        </>
    )
})

export default Service