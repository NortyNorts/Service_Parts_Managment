const baseURL = 'http://localhost:8080/customers';

const ServiceServices = {
    getCustomers() {
        return fetch(baseURL)
            .then(res => res.json());
    },

}

export default ServiceServices;