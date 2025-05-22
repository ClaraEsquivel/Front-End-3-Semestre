import React from 'react';
import { useNavigate } from 'react-router-dom';

const PaginaInicial = () => {
    const navigate = useNavigate(); // Hook para navegação

    const irParaCadastro = () => {
        navigate('/formulario-cadastro'); // Redireciona para a rota do formulário
    };

    return (
        <div style={{ textAlign: 'center', marginTop: '50px' }}>
            <h1>Bem-vindo à Página Inicial</h1>
            <button 
                onClick={irParaCadastro} 
            >
                Clique aqui para se cadastrar
            </button>
        </div>
    );
};

export default PaginaInicial;