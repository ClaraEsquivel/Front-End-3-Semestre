package com.senai.api_frontend.model;

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
    @NotBlank(message = "E-mail é obrigatorio")
    @Email(message = "Deve ser um e-mail válido.")
    private String email;

    @Column(nullable = false)
    @NotBlank(message = "Senha é obrigatoria")
    @Size(min = 3, message = "A senha deve ter no minimo 3 caracteres.")
    private String senha;

    public Usuario() {
    }

    public Usuario(Long id, @NotBlank(message = "Nome é obrigatorio") String nome,
                   @NotBlank(message = "E-mail é obrigatorio") @Email(message = "Deve ser um e-mail válido.") String email,
                   @NotBlank(message = "Senha é obrigatoria") @Size(min = 3, message = "A senha deve ter no minimo 3 caracteres.") String senha) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "Usuario [id=" + id + ", nome=" + nome + ", email=" + email + ", senha=" + senha + "]";
    }
}
