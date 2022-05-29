import React from "react";
import Products from "./Products";

const Home = () => {
    return (
        <div className="hero">
            <div className="card bg-dark text-white">
                <img src="/image/newnik.jpg" className="card-img" alt="Background" />
                <div className="card-img-overlay d-flex flex-column">
                    <div className="container">
                    <h5 className="card-title display-3 fw-bolder mb-0">Nike Shop</h5>
                    <p className="card-text lead fs-2">Buy your favourite Shoes</p>
                    </div>
                </div>
            </div>
        <Products />
        </div>
    )
}

export default Home;