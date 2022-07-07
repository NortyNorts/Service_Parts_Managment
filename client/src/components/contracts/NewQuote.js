import React from "react";

const NewQuote = ()=>{
    return(

        <>
            <h1>This is the New Quote Page</h1>

            <form id="quote">
                <h1>Create Quote</h1>
                <div class="field">
                    <label for="customerName">Customer Name:</label>
                    <input type="text" id="customerName" name="customerName" placeholder="" />
                </div>
                <div class="field">
                    <label for="email">Site Name:</label>
                    <input type="text" id="siteName" name="siteName" placeholder="" />
                </div>
                <button type="submit">Generate Quote</button>
            </form>
        </>
    )
}

export default NewQuote