package com.senai.api_atividade_senai.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    @NotBlank(message = "Nome é obrigatorio")
    private String nome;

    @Column(nullable = false)
    @NotBlank(message = "O telefone é obrigatório")
    @Size(min = 9, max = 11, message = "O telefone possui 11 digitos, não esqueça o DDD")
    private String telefone;

    @Column(nullable = false)
    @NotBlank(message = "O CEP é obrigatório")
    @Size(min = 8, max = 8, message = "O digite o CEP completo")
    private String cep;

    @Column(nullable = false)
    @NotBlank(message = "O CPF é obrigatório")
    @Size(min = 11, max = 11, message = "O CPF possui 11 digitos.")
    private String cpf;

    @Column(nullable = false)
    @NotBlank(message = "E-mail é obrigatorio")
    @Email(message = "Deve ser um e-mail válido.")
    private String email;

    @Column(nullable = false)
    @NotBlank(message = "Senha é obrigatoria")
    @Size(min = 3, message = "A senha deve ter no minimo 3 caracteres.")
    private String senha;

    public Usuario() {
    }

    public Usuario(Long id, String nome, String telefone, String cep, String cpf, String email, String senha) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.cep = cep;
        this.cpf = cpf;
        this.email = email;
        this.senha = senha;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public @NotBlank(message = "Nome é obrigatorio") String getNome() {
        return nome;
    }

    public void setNome(@NotBlank(message = "Nome é obrigatorio") String nome) {
        this.nome = nome;
    }

    public @NotBlank(message = "O telefone é obrigatório") @Size(min = 9, max = 11, message = "O telefone possui 11 digitos, não esqueça o DDD") String getTelefone() {
        return telefone;
    }

    public void setTelefone(@NotBlank(message = "O telefone é obrigatório") @Size(min = 9, max = 11, message = "O telefone possui 11 digitos, não esqueça o DDD") String telefone) {
        this.telefone = telefone;
    }

    public @NotBlank(message = "O CEP é obrigatório") @Size(min = 8, max = 8, message = "O digite o CEP completo") String getCep() {
        return cep;
    }

    public void setCep(@NotBlank(message = "O CEP é obrigatório") @Size(min = 8, max = 8, message = "O digite o CEP completo") String cep) {
        this.cep = cep;
    }

    public @NotBlank(message = "O CPF é obrigatório") @Size(min = 11, max = 11, message = "O CPF possui 11 digitos.") String getCpf() {
        return cpf;
    }

    public void setCpf(@NotBlank(message = "O CPF é obrigatório") @Size(min = 11, max = 11, message = "O CPF possui 11 digitos.") String cpf) {
        this.cpf = cpf;
    }

    public @NotBlank(message = "E-mail é obrigatorio") @Email(message = "Deve ser um e-mail válido.") String getEmail() {
        return email;
    }

    public void setEmail(@NotBlank(message = "E-mail é obrigatorio") @Email(message = "Deve ser um e-mail válido.") String email) {
        this.email = email;
    }

    public @NotBlank(message = "Senha é obrigatoria") @Size(min = 3, message = "A senha deve ter no minimo 3 caracteres.") String getSenha() {
        return senha;
    }

    public void setSenha(@NotBlank(message = "Senha é obrigatoria") @Size(min = 3, message = "A senha deve ter no minimo 3 caracteres.") String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", telefone='" + telefone + '\'' +
                ", cep='" + cep + '\'' +
                ", cpf='" + cpf + '\'' +
                ", email='" + email + '\'' +
                ", senha='" + senha + '\'' +
                '}';
    }
}