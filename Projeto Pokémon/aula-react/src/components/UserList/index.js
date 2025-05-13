// aula-react\src\components\UserList\index.js

import './styles.css'
import pokemon from '../../assets/images/pokemon.png'


const UserList = ({ usuarios }) => {
    return (
        <div className='user-list'>
            <h2>Lista de Pokémons</h2>
            <img src={pokemon} alt='Pokemon' />
            <ol>
                {usuarios.map((usuario, index) => (
                    <li key={index}>{usuario}</li>
                ))}
            </ol>
        </div>
    )
}

export default UserList