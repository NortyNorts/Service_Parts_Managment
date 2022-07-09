import React, {useState} from "react";

const AddUnit = (currentCustomer)=>{
    
    const [unitType, setUnitType] = useState("")
    const [serialNumber, setSerialNumber] = useState("")
    const [hoursRun, setHoursRun] = useState(0)
    const [dateInstalled, setDateInstalled] = useState("")
    const [expectedRunHoursPerYear, setExpectedRunHoursPerYear] = useState(0)
    const [nextServiceDate, setNextServiceDate] = useState("")


    const handleUnitTypeChange = (event) =>{
        setUnitType(event.target.value)
    };

    const handleSerialNumberChange = (event) =>{
        setSerialNumber(event.target.value)
    };

    const handleHoursRunChange = (event) =>{
        setHoursRun(event.target.value)
    };

    const handleDateInstalledChange = (event) =>{
        setDateInstalled(event.target.value)
    };

    const handleExpectedRunHoursPerYearChange = (event) =>{
        setExpectedRunHoursPerYear(event.target.value)
    };

    const handleNextServiceDateChange = (event) =>{
        setNextServiceDate(event.target.value)
    };

    const handleCustomerSubmit = (event) => {
        event.preventDefault();
        const serialNumberToSubmit = serialNumber.trim();

        if (!serialNumberToSubmit){
          return
        }
        const newUnitObject = {
            unitType: unitType,
            serialNumber: serialNumberToSubmit,
            hoursRun: hoursRun,
            dateInstalled: dateInstalled,
            expectedRunHoursPerYear: expectedRunHoursPerYear,
            nextServiceDate: nextServiceDate,
            customer: currentCustomer.currentCustomer.id //
          }
        setUnitType("");
        setSerialNumber("");
        setHoursRun(0);
        setDateInstalled("");
        setExpectedRunHoursPerYear(0);
        setNextServiceDate("");
    }

    return(
        <>
            <h1>Add Unit</h1>

            <form onSubmit={handleCustomerSubmit}>

                <div className="dropdown">
                    <p>Select Unit Type</p>
                    <select 
                        placeholder="Search.."
                        value={unitType}
                        onChange={handleUnitTypeChange}
                        required
                    >
                        <option>RS5-10Kg</option>
                        <option>RS16-20Kg</option>
                        <option>RS24-30kg</option>
                        <option>RS40kg</option>
                        <option>RS50kg</option>
                        <option>RS60kg</option>
                        <option>RS80kg</option>
                    </select>
                </div>

                <div className="field">
                    <label htmlFor="serialNumber">Serial Number:</label>
                    <input 
                        type="text" 
                        placeholder="Serial Number"
                        value={serialNumber}
                        onChange={handleSerialNumberChange}
                        required
                    />
                </div>

                <div className="field">
                    <label htmlFor="hoursRun">Hours Run:</label>
                    <input 
                        type="number" 
                        placeholder=""
                        value={hoursRun}
                        onChange={handleHoursRunChange}
                        required
                    />
                </div>

                <div className="field">
                    <label htmlFor="expectedRunningHoursPerYear">Expected Running Hours Per Year:</label>
                    <input 
                        type="number" 
                        placeholder=""
                        value={expectedRunHoursPerYear}
                        onChange={handleExpectedRunHoursPerYearChange}
                        required
                    />
                </div>

                <div className="field">
                    <label htmlFor="dateInstalled">Date Installed:</label>
                    <input 
                        type="date" 
                        value={dateInstalled}
                        onChange={handleDateInstalledChange}
                        required
                    />
                </div>

                <div className="field">
                    <label htmlFor="nextServiceDate">Next Service Date:</label>
                    <input 
                        type="date" 
                        value={nextServiceDate}
                        onChange={handleNextServiceDateChange}
                        required
                    />
                </div>

                <input type="submit" value={"Add Unit"}/>

            </form>

        </>
    )
}

export default AddUnit