import {BrowserRouter as Router, Route, Switch} from 'react-router-dom'
import React, {useEffect, useState} from 'react'
import Home from './components/Home';
import NavBar from './components/NavBar';
import Contracts from './containers/Contracts';
import Service from './containers/Service';
import CustomersService from './services/CustomersServices';
import Customers from './components/Customers';

function App() {

  const [customers, setCustomers] = useState([])
  const [customer, setCustomer] = useState(null)

  useEffect(()=>{
    CustomersService.getCustomers()
    .then(customers => setCustomers(customers));
  }, []);

  return (
    <>
      <h1>
        This is the main App.js
      </h1>

      <Router>

      <NavBar/>

      <Switch>

      <Route exact path="/"> <Home/></Route>

      <Route exact path="/contracts">
        <Contracts 
        />
      </Route>

      <Route exact path="/service">
        <Service/>
      </Route>

      <Route exact path="/customers">
        <Customers
          customers={customers}
          setCustomer={setCustomer}
        />
      </Route>

      </Switch>

      </Router>
    </>
  );
}

export default App;
