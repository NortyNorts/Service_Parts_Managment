import {BrowserRouter as Router, Route, Switch} from 'react-router-dom'
import React, {useEffect, useState} from 'react'
import Home from './components/Home';
import NavBar from './components/NavBar';
import Contracts from './containers/Contracts';
import Service from './containers/Service';
import CustomersService from './services/CustomersServices';

import UnitServices from './services/UnitsServices';

import ContractsCustomerDetails from './components/contracts/ContractsCustomerDetails';
import AddCustomer from './components/AddCustomer';
import NewQuote from './components/contracts/NewQuote';
import SavedQuotes from './components/contracts/SavedQuotes';

import ServiceCustomer from './components/service/ServiceCustomerListItem';
import ServiceCustomerDetails from './components/service/ServiceCustomerDetails';
import ServiceCustomerList from './components/service/ServiceCustomersList';
import ServiceCustomers from './components/service/ServiceCustomersList';
import UnitDetails from './components/service/ServiceUnitDetails';
import ContractsCustomersSection from './components/contracts/ContractsCustomersSection';


function App() {

  const [customers, setCustomers] = useState([])
  const [currentCustomer, setCurrentCustomer] = useState(null)

  const [units, setUnits] = useState([])
  const [currentUnit, setCurentUnit] = useState(null)

  useEffect(()=>{
    CustomersService.getCustomers()
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

      <Route exact path="/"> <Home/></Route>

      <Route exact path="/contracts">
        <Contracts 
        />
      </Route>

      <Route exact path="/service">
        <Service
          customers={customers}
          changeCustomer={changeCustomer}
        />
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
        />
      </Route>

      <Route exact path ="/addcustomer">
          <AddCustomer/>
      </Route>

      <Route exact path ="/savedquotes">
          <SavedQuotes/>
      </Route>

      <Route exact path ="/newquote">
          <NewQuote/>
      </Route>

      <Route exact path ="/servicecustomerdetails">
        <ServiceCustomerDetails
          currentCustomer={currentCustomer}
          units={units}
          changeUnit={changeUnit}
        />
      </Route>



      <Route exact path="/units">
        <UnitDetails
          changeUnit={changeUnit}
          units={units}
          setUnits={setUnits}
        />
      </Route>



      </Switch>

      </Router>
    </>
  );
}

export default App;
