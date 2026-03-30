import React, {useState} from 'react';
import {Link} from 'react-router-dom';
import './Header.css';


function Header() {

    const [isHovered, setIsHovered] = useState(false);

    const [isClicked, setIsClicked] = useState(false);

    return (
        <header>
            <button className="header-logo-button"
                    onMouseOver={() => setIsHovered(true)}
                    onMouseLeave={() => setIsHovered(false)}
                    onClick={() => { setIsClicked(true); }} >
                <img className="header-logo-button-display" src="/curryLogo.svg" />
            </button>
            <p className="header-text">
                あなたのカレーMBTIは?
            </p>
        </header>
    );
}

export default Header;