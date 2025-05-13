// aula-react\src\components\UserInput\index.js

import { useState } from 'react';
import './styles.css'
import detalhe from '../../assets/images/detalhe.png'

const UserInput = ({ onAddUser }) => {
    const [usuario, setUsuario] = useState('')

    const handleChange = (event) => {
        setUsuario(event.target.value)
    }
    
    const handleSubmit = () => {
        if (usuario.trim()) {
            onAddUser(usuario)
            setUsuario('')
        } else {
            alert('Digite um nome de Pokémon')
        }
    }
    
    return (
        <div className="user-input">
            <h2>Adicionar Pokémon</h2>
            <img src={detalhe} alt = 'Detalhe'/>
            <input
                type="text"
                placeholder="'Digite um nome de Pokémon'"
                value={usuario}
                onChange={handleChange}
            />
            <button onClick={handleSubmit}>Adicionar</button>
        </div>
    )
}

export default UserInput