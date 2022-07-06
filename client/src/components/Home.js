import { Link } from 'react-router-dom'

const Home = (() => {
    return (
        <>
            <div className="links">

                <Link to='/contracts'><h1>   Contracts Section  </h1>  </Link>


                <Link to='/service'> <h1>  Service Section </h1>  </Link>



            </div>
        </>
    )

})

export default Home