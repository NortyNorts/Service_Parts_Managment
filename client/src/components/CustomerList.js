import React, {useState, useEffect} from "react"
import Customer from "./Customer"


const CustomerList = ({customers, changeCustomer})=>{

    const customersArray = customers.map((customer, index)=>{
        return <Customer value={index} customer={customer} changeCustomer={changeCustomer} key={index}/>
    })

    return(
        <>
            <div>
                {customersArray}
            </div>
        </>
    )

}

export default CustomerList