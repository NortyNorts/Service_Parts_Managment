import React from "react";

const AddCustomer = ()=>{
    return(
        <>
            <form id="addCustomer">
                <h1>Add Customer</h1>
                <div class="field">
                    <label for="companyName">Company Name:</label>
                    <input type="text" id="customerName" name="customerName" placeholder="" />
                </div>
                <div class="field">
                    <label for="siteName">Site Name:</label>
                    <input type="text" id="siteName" name="siteName" placeholder="" />
                </div>
                <div class="field">
                    <label for="Address">Address:</label>
                    <input type="text" id="Address" name="Address" placeholder="" />
                </div>
                <div class="field">
                    <label for="postCode">Postcode:</label>
                    <input type="text" id="postCode" name="postCode" placeholder="" />
                </div>
                <div class="field">
                    <label for="visitsPerYear">Visits per year:</label>
                    <input type="text" id="visitsPerYear" name="visitsPerYear" placeholder="" />
                </div>
                <button type="submit">Add Customer</button>
            </form>
        </>
    )
}

export default AddCustomer