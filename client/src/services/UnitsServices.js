
const baseURL = 'http://localhost:8080/units';

const UnitServices = {
    
    getUnits() {
        return fetch(baseURL)
            .then(res => res.json());
    },

    getUnitParts(){
        return
    },

    addUnit(newUnit){
        console.log("NewUnitData", newUnit)
        return fetch(baseURL,{
        method:'POST',
        body: JSON.stringify(newUnit),
        headers:{'Content-Type':'application/json'}
        })
        .then(res => res.json());
      },

      serviceUnit(unit){
        console.log("NewUnitData", unit)
        return fetch(baseURL + '/updaterunhours',{
        method:'POST',
        body: JSON.stringify(unit),
        headers:{'Content-Type':'application/json'}
        })
        .then(res => res.json());
      },

}

export default UnitServices;