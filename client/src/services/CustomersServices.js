const baseURL = 'http://localhost:8080/customers';

const CustomersService = {
    getCustomers() {
      return fetch(baseURL)
        .then(res => res.json());
    },

}

export default CustomersService;