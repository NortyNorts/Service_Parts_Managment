import React, {useState} from "react";
import CustomersServices from "../services/CustomersServices";

const AddCustomer = ()=>{

    // const [newCustomer, setNewCustomer] = useState("")
    
    const [companyName, setCompanyName] = useState("")
    const [siteName, setSiteName] = useState("")
    const [address, setAddress] = useState("")
    const [postCode, setPostCode] = useState("")
    const [visitsPerYear, setVisitsPerYear] = useState(0)

    const handleCompanyNameChange = (event) =>{
        setCompanyName(event.target.value)
    };

    const handleSiteNameChange = (event) =>{
        setSiteName(event.target.value)
    };

    const handleAddressChange = (event) =>{
        setAddress(event.target.value)
    };

    const handlePostCodeChange = (event) =>{
        setPostCode(event.target.value)
    };

    const handleVisitsPerYearChange = (event) =>{
        setVisitsPerYear(event.target.value)
    };

    const handleCustomerSubmit = (event) => {
        event.preventDefault();
        const companyNameToSubmit = companyName.trim();
        const siteNameToSubmit = siteName.trim();
        const addressToSubmit = address.trim();
        const postCodeToSubmit = postCode.trim();
        const visitsPerYearToSubmit = visitsPerYear;

        if (!companyNameToSubmit){
          return
        }
        const newCustomerObject = {
            companyName: companyNameToSubmit,
            siteName: siteNameToSubmit,
            siteAddress: addressToSubmit,
            sitePostCode: postCodeToSubmit,
            engineerVisitsPerYear: visitsPerYearToSubmit
          }
        // setNewCustomer(newCustomerObject);
        setCompanyName("");
        setSiteName("");
        setAddress("");
        setPostCode("");
        setVisitsPerYear(0);
        CustomersServices.addCustomer(newCustomerObject);
    }

    return(
        <>
            <h1>Add Customer</h1>

            <form onSubmit={handleCustomerSubmit}>

                <div className="field">
                    <label htmlFor="companyName">Company Name:</label>
                    <input 
                        type="text"
                        placeholder="Company Name"
                        value={companyName}
                        onChange={handleCompanyNameChange}
                        required
                    />
                </div>

                <div className="field">
                    <label htmlFor="siteName">Site Name:</label>
                    <input 
                        type="text" 
                        placeholder="Site Name"
                        value={siteName}
                        onChange={handleSiteNameChange}
                        required
                    />
                </div>

                <div className="field">
                    <label htmlFor="address">Address:</label>
                    <input 
                        type="text" 
                        placeholder="Site Address"
                        value={address}
                        onChange={handleAddressChange}
                        required
                    />
                </div>

                <div className="field">
                    <label htmlFor="postCode">Postcode:</label>
                    <input 
                        type="text"
                        placeholder="Site PostCode" 
                        value={postCode}
                        onChange={handlePostCodeChange}
                        required
                    />
                </div>

                <div className="field">
                    <label htmlFor="visitsPerYear">Visits per year:</label>
                    <input 
                        type="number" 
                        placeholder=""
                        value={visitsPerYear}
                        onChange={handleVisitsPerYearChange} 
                        required
                        />
                </div>

                <input type="submit" value={"Add Customer"}/>

            </form>
        </>
    )
}

export default AddCustomer