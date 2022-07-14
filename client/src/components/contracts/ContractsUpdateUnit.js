import React, {useState} from "react";
import '../../css/form.css'
import UnitServices from "../../services/UnitsServices";


const ContractsUpdateUnit = ({currentCustomer, currentUnit, currentUnitParts})=>{
    
    const [unitType, setUnitType] = useState("")
    const [serialNumber, setSerialNumber] = useState("")
    const [hoursRun, setHoursRun] = useState("")
    const [expectedRunHoursPerYear, setExpectedRunHoursPerYear] = useState("")
    // const [nextServiceDate, setNextServiceDate] = useState("")


    const handleUnitTypeChange = (event) =>{
        setUnitType(event.target.value)
    };

    const handleSerialNumberChange = (event) =>{
        setSerialNumber(event.target.value)
    };

    const handleHoursRunChange = (event) =>{
        setHoursRun(event.target.value)
    };

    const handleExpectedRunHoursPerYearChange = (event) =>{
        setExpectedRunHoursPerYear(event.target.value)
    };

    // const handleNextServiceDateChange = (event) =>{
    //     setNextServiceDate(event.target.value)
    // };

    const handleCustomerSubmit = (event) => {
        event.preventDefault();
        const serialNumberToSubmit = serialNumber.trim();

        if (!serialNumberToSubmit){
          return
        }
        const newUnitObject = {
            id: currentUnit.id,
            unitType: unitType,
            serialNumber: serialNumberToSubmit,
            hoursRun: hoursRun,
            dateInstalled: currentUnit.dateInstalled,
            expectedRunHoursPerYear: expectedRunHoursPerYear,
            nextServiceDate: currentCustomer.nextServiceDate,
            customer: currentCustomer,
            nextServiceHours: (expectedRunHoursPerYear/currentCustomer.engineerVisitsPerYear),
            unitParts: currentUnitParts,
            increasedRunHours: 0

          }
        setUnitType("");
        setSerialNumber("");
        setHoursRun("");
        setExpectedRunHoursPerYear("");
        console.log(newUnitObject)
        UnitServices.addUnit(newUnitObject)
    }

    return(
        <>

            <div className="divform">
            <h1>Update Unit</h1>
            
            

            <form onSubmit={handleCustomerSubmit}>

                <div className="dropdown">

                    <select 
                        placeholder={currentUnit.unitType}
                        value={unitType}
                        onChange={handleUnitTypeChange}
                        required
                    >
                        <option value="" disabled selected>Select Unit</option>
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
                    <label htmlFor="serialNumber"></label>
                    <input 
                        type="text" 
                        placeholder="Serial Number"
                        value={serialNumber}
                        onChange={handleSerialNumberChange}
                        required
                    />
                </div>

                <div className="field">
                    <label htmlFor="hoursRun"></label>
                    <input 
                        type="number" 
                        placeholder="Hours Run"
                        value={hoursRun}
                        onChange={handleHoursRunChange}
                        required
                    />
                </div>

                <div className="field">
                    <label htmlFor="expectedRunningHoursPerYear"></label>
                    <input 
                        type="number" 
                        placeholder="Expected Running Hours"
                        value={expectedRunHoursPerYear}
                        onChange={handleExpectedRunHoursPerYearChange}
                        required
                    />
                </div>

                <input type="submit" value={"Add Unit"}/>

            </form>
            </div>

            <br></br>
            <br></br>
            <br></br>
        </>
    )
}

export default ContractsUpdateUnit