import {BrowserRouter as Router, Route, Switch} from 'react-router-dom'
import React, {useEffect, useState} from 'react'
import Home from './components/Home';
import NavBar from './components/NavBar';
import Contracts from './containers/Contracts';
import Service from './containers/Service';
import UnitServices from './services/UnitsServices';
import ContractsCustomerDetails from './components/contracts/ContractsCustomerDetails';
import AddCustomer from './components/AddCustomer';
import ServiceCustomerDetails from './components/service/ServiceCustomerDetails';
import ContractsCustomersSection from './components/contracts/ContractsCustomersSection';
import CustomersServices from './services/CustomersServices';
import ServiceUnitDetails from './components/service/ServiceUnitDetails';
import ContractsUnitDetails from './components/contracts/ContractsUnitDetails';
import AddUnit from './components/AddUnit';
import PartsForecast from './containers/PartsForecast';
import CustomerPartsForecast from './components/contracts/CustomerPartsForecast';


function App() {

  const [customers, setCustomers] = useState([])
  const [currentCustomer, setCurrentCustomer] = useState(null)

  const [units, setUnits] = useState([])
  const [currentUnit, setCurentUnit] = useState(null)

  useEffect(()=>{
    CustomersServices.getCustomers()
    .then(customers => setCustomers(customers));
    UnitServices.getUnits()
    .then(units=> setUnits(units));
  }, []);

  const changeCustomer = function(chosenCustomer){
    setCurrentCustomer(chosenCustomer)
  }

  const changeUnit = function(selectedUnit){
    setCurentUnit(selectedUnit)
  }

  return (
    <>
      <Router>

        <NavBar/>

        <Switch>

          <Route exact path="/"> 
            <Home/>
          </Route>

          <Route exact path="/contracts">
            <Contracts />
          </Route>

          <Route exact path="/service">
            <Service
              customers={customers}
              changeCustomer={changeCustomer}
            />
          </Route>

          <Route exact path="/partsforecast">
            <PartsForecast />
          </Route>

          <Route exact path="/customerpartsforecast">
            <CustomerPartsForecast/>
          </Route>

          <Route exact path ="/addcustomer">
              <AddCustomer/>
          </Route>

          <Route exact path ="/addunit">
              <AddUnit/>
          </Route>

          <Route exact path ="/contractscustomerssection">
            <ContractsCustomersSection
              customers={customers}
              changeCustomer={changeCustomer}
            />
          </Route>

          <Route exact path ="/contractscustomerdetails">
            <ContractsCustomerDetails
              currentCustomer={currentCustomer}
              changeUnit={changeUnit}
            />
          </Route>

          <Route exact path ="/servicecustomerdetails">
            <ServiceCustomerDetails
              currentCustomer={currentCustomer}
              changeUnit={changeUnit}
            />
          </Route>

          <Route exact path="/serviceunitdetails">
            <ServiceUnitDetails
              currentUnit={currentUnit}
            />
          </Route>

          <Route exact path="/contractsunitdetails">
            <ContractsUnitDetails
              currentUnit={currentUnit}
            />
          </Route>

        </Switch>

      </Router>
    </>
  );
}

export default App;
