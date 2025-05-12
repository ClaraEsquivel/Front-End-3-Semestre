import { useState } from 'react';
import logo from './assets/images/logo.png';
import UserInput from './components/UserInput';
import UserList from './components/UserList';
import './App.css';

function App() {

const[usuarios, setUsuarios] = useState(['Pikachu', 'Mew', 'Darkrai']);

const adicionarUsuarios = (novoUsuario) => {
  if (usuarios.includes(novoUsuario)) {
    alert('O Pokémon já existe na lista!')
    return;
  }
  setUsuarios([...usuarios, novoUsuario])
}

return (
  <div className='App'>
      <img src={logo} alt='Logo da empresa'/>
      <h1>Cadastro de Pokémons</h1>
      <hr/>
      <UserInput onAddUser={adicionarUsuarios}/>
      <hr/>
      <UserList usuarios={usuarios}/>
  </div>
);
}

export default App;
