import { useState } from 'react';
import './App.css';
import logo from './logo.png';

function App() {
  // permite adicionar estado ao componente (monitorar mudanças no conteúdo)
const[usuario, setUsuario] = useState('');
const[usuarios, setUsuarios] = useState(['Pikachu', 'Mew', 'Darkrai']);

const adicionarUsuario = () => {
  // Verificando se o novo usuário já existe na lista
  if (usuarios.includes(usuario)){
    alert('esse Pokémon já existe na lista.');
    return;
  }

  // Adiciona novo usuário na lista, mantendo os anteriores
  setUsuarios([...usuarios, usuario]); 
  //Limpar campo de entrada
  setUsuario(''); 
}

  return (
    <div className='App'>
      <img src={logo} className='logo'/>
      <hr/>
      <h2>Adicionar Pokémon</h2>
      <input
        type='text'
        placeholder='Digite o nome do Pokémon'
        value={usuario}
        onChange={(e) => setUsuario(e.target.value)}
      />
      <button onClick={adicionarUsuario}>Adicionar</button>
      <hr/>
      <h2>Lista de Pokémons cadastrados</h2>

      <ol>
        {usuarios.map((usuario, index) => (
        <li key={index}>{usuario}</li>
      ))}
      </ol>
    </div>
  );
}

export default App;
