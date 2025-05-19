// src\pages\Lista\index.js

import ListaDeusuarios from '../../components/ListaDeUsuarios';
import { useNavigate } from "react-router-dom";
import './styles.css';

function PaginaListaUsuarios(){
    const navigate = useNavigate();

    return(
        <div className="pagina-lista-usuarios">
            <div className='container'>
                <h2>Lista de Usuários</h2>
                <ListaDeusuarios />
                <button className='link-voltar' onClick={() => navigate('/')} >
                    Cadastrar Usuário
                </button>
            </div>
        </div>
    )
}

export default PaginaListaUsuarios;