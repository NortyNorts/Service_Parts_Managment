import React from "react";
import { Link } from "react-router-dom";

const ServiceCustomerDetails = ({currentCustomer})=>{
    
    return(
        <>
            {currentCustomer.companyName}
            <Link to ='/units'> <h2>  Customers </h2>  </Link>
        </>
    )
}

export default ServiceCustomerDetails