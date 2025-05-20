package com.example.aula.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

@Entity
@Table(name = "tab_jogador")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Nome é obrigatório.")
    private String nome;

    @NotBlank(message = "Sexo é obrigatório.")
    private String sexo;

    @Min(1)
    @NotNull
    private int idade;

    @DecimalMin(value = "0.1", inclusive = true)
    @NotNull
    private double altura;

    @DecimalMin(value = "0.1", inclusive = true)
    @NotNull
    private double peso;

    @NotBlank(message = "Posição é obrigatória.")
    private String posicao;

    @Min(1)
    @NotNull
    private int numeroCamisa;

    public Usuario() {
    }

    public Usuario(Long id, String nome, String sexo, int idade, double altura, double peso, String posicao, int numeroCamisa) {
        this.id = id;
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
        this.posicao = posicao;
        this.numeroCamisa = numeroCamisa;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public @NotBlank(message = "Nome é obrigatório.") String getNome() {
        return nome;
    }

    public void setNome(@NotBlank(message = "Nome é obrigatório.") String nome) {
        this.nome = nome;
    }

    public @NotBlank(message = "Sexo é obrigatório.") String getSexo() {
        return sexo;
    }

    public void setSexo(@NotBlank(message = "Sexo é obrigatório.") String sexo) {
        this.sexo = sexo;
    }

    @Min(1)
    @NotNull
    public int getIdade() {
        return idade;
    }

    public void setIdade(@Min(1) @NotNull int idade) {
        this.idade = idade;
    }

    @DecimalMin(value = "0.1", inclusive = true)
    @NotNull
    public double getAltura() {
        return altura;
    }

    public void setAltura(@DecimalMin(value = "0.1", inclusive = true) @NotNull double altura) {
        this.altura = altura;
    }

    @DecimalMin(value = "0.1", inclusive = true)
    @NotNull
    public double getPeso() {
        return peso;
    }

    public void setPeso(@DecimalMin(value = "0.1", inclusive = true) @NotNull double peso) {
        this.peso = peso;
    }

    public @NotBlank(message = "Posição é obrigatória.") String getPosicao() {
        return posicao;
    }

    public void setPosicao(@NotBlank(message = "Posição é obrigatória.") String posicao) {
        this.posicao = posicao;
    }

    @Min(1)
    @NotNull
    public int getNumeroCamisa() {
        return numeroCamisa;
    }

    public void setNumeroCamisa(@Min(1) @NotNull int numeroCamisa) {
        this.numeroCamisa = numeroCamisa;
    }

}
