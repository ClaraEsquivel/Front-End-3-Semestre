//src\App.js

import { useState } from 'react';
import logo from './assets/images/logo.png'
import UserInput from './components/UserInput'
import UserList from './components/UserList'
import './App.css';

function App() {

  const [usuarios, setusuarios] = useState(['Marta', 'Maria', 'José'])

  const adicionarUsuarios = (novoUsuario) => {
    if (usuarios.includes(novoUsuario)) {
      alert('Usuário já existe na lista!')
      return;
    }
    setusuarios([...usuarios, novoUsuario])
  }

  return (
    <div className='App'> 
        <img src={logo} alt='Logo da Empresa'/>
        <h1>Meu App</h1>
        <hr>
        { <UserInput onAddUser={adicionarUsuarios}/> }
        </hr>
        { <UserList usuarios={usuarios}/> }
    </div>
  );
}

export default App;
