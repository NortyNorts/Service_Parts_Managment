import { Link } from 'react-router-dom'

const Home = (() => {
    return (
        <>
            <div className="links">

                <Link to='/contracts'><h1>   Contracts  </h1>  </Link>

                <Link to='/service'> <h1>  Service </h1>  </Link>

                <Link to='/partsforecast'> <h1>  Parts Forecasting</h1>  </Link>

            </div>
        </>
    )

})

export default Home