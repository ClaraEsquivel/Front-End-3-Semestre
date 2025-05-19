// src\components\ListaDeUsuarios\index.js

import React, { useEffect, useState } from 'react';
import axios from 'axios';
import './styles.css';

function ListaDeUsuarios() {
    const [usuarios, setUsuarios] = useState([]);

    useEffect(() => {
        const carregarUsuarios = async () => {
            try {
                const response = await axios.get('https://localhost:8080/usuarios');
                setUsuarios(response.data);
            } catch (erro) {
                alert('Erro ao carregar os usuários:', erro);
            }
        }
        carregarUsuarios();
    }, []);

    return (
        <ul id="listaUsuarios" className="lista-usuarios">
            {usuarios.length === 0 ? (
                <li>Nenhum usuário encontrado.</li>
            ) : (
                usuarios.map(usuario => (
                    <li key={usuario.id} >
                        <p><strong>Nome: </strong> {usuario.nome}</p>
                        <p><strong>Email: </strong> {usuario.email}</p>
                        <p><strong>Senha: </strong> {usuario.senha}</p>
                    </li>
                ))
            )}
        </ul>
    )
}

export default ListaDeUsuarios;