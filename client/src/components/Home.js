import React from 'react'
import { Link } from 'react-router-dom'
import '../css/main.css'

const Home = (() => {

    return (
        <>
            <div className='main-links'>
                <ul>
                    <li><Link to='/contracts'><h1>   Contracts  </h1>  </Link></li>

                    <li><Link to='/service'> <h1>  Service </h1>  </Link></li>
                </ul>
            </div>
        </>
    )

})

export default Home