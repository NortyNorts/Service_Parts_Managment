import React, {useState} from "react"


const ContractsCustomerList = ({customers, changeCustomer})=>{

    const [query, setQuery] = useState("")

    const filteredCustomersArray = customers.filter(customer=>{
        if (query === '') {
            return true;
          } 
          
          else if (customer.companyName.toLowerCase().includes(query.toLowerCase())) {
            return true;
          } 
          
          else if (customer.siteAddress.toLowerCase().includes(query.toLowerCase())) {
            return true;
          }

          else if (customer.siteName.toLowerCase().includes(query.toLowerCase())) {
            return true;
          } 

          else {
            return false
          }
        })
      

        const customersComponents = filteredCustomersArray.map((customer, index)=>{
            return <ContractsCustomerList value={index} customer={customer} changeCustomer={changeCustomer} key={index}/>
        })


    return(
        <>
            <input placeholder="Customer Search" onChange={event => setQuery(event.target.value)} />
            {customersComponents}
        </>
    )

}

export default ContractsCustomerList