const baseURL = 'http://localhost:8080/customers';

const CustomersServices = {
    
  getCustomers() {
      return fetch(baseURL)
        .then(res => res.json());
    },

  addCustomer(newCustomer){
    return fetch(baseURL,{
    method:'POST',
    body: newCustomer,
    headers:{
      'Content-Type':'applcations/json'
      }
    })
    .then(res => res.json());
  }

}

export default CustomersServices;