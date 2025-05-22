import { BrowserRouter as Router, Routes, Route } from 'react-router-dom';
import PaginaCadastro from './pages/Cadastro';
import PaginaListaUsuarios from './pages/Lista';
import PaginaInicial from './pages/Inicial'; // Importando a página inicial
import './App.css'; // Para estilos globais, se necessário

function App() {
  return (
    <Router>
      <Routes>
        <Route path="/" element={<PaginaCadastro />} />
        <Route path="/usuarios" element={<PaginaListaUsuarios />} />
        <Route path ="/cadastro" element={<Pagina />} />
        <Route path="/pagina-inicial" element={<PaginaInicial />} />
      </Routes>
    </Router>
  );
}

export default App;