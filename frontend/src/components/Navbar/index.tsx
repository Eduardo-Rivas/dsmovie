import {ReactComponent as GithubIcon} from 'assets/img/github.svg';
import './styles.css';

function Navbar()
{ 
    return(
        <header>
            <nav className='container'>
                <div className='dsmovie-nav-content'>
                    <h1>DSMovie</h1>

                        <a href="https://github.com/Eduardo-Rivas">
                            <div className= 'dsmovie-contat-content'>
                                <GithubIcon />
                                <p className='dsmovie-contat-link'>/devsuperior</p>
                            </div>
                        </a>
                </div>
            </nav>
      </header>    
    );
}
export default Navbar;