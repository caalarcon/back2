package com.example.empresa.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public class Funcionario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long matricula;

    private String nome;
    private String cargo;
    private LocalDate dtAdimicao;
    private Double salario;

    // Construtor vazio que cria os objetos da entidade.
    public Funcionario() {
    }

    // Construtor utilizado para criar um funcionário.
    public Funcionario(String nome, String cargo, LocalDate dtAdimicao, Double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.dtAdimicao = dtAdimicao;
        this.salario = salario;
    }

    // Retorna a matrícula do funcionário.
    public Long getMatricula() {
        return matricula;
    }

    // Define a matrícula do funcionário.
    public void setMatricula(Long matricula) {
        this.matricula = matricula;
    }

    // Retorna o nome do funcionário.
    public String getNome() {
        return nome;
    }

    // Define o nome do funcionário.
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Retorna o cargo do funcionário.
    public String getCargo() {
        return cargo;
    }

    // Define o cargo do funcionário.
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    // Retorna a data de admissão do funcionário.
    public LocalDate getDtAdimicao() {
        return dtAdimicao;
    }

    // Define a data de admissão do funcionário.
    public void setDtAdimicao(LocalDate dtAdimicao) {
        this.dtAdimicao = dtAdimicao;
    }

    // Retorna o salário do funcionário.
    public Double getSalario() {
        return salario;
    }

    // Define o salário do funcionário.
    public void setSalario(Double salario) {
        this.salario = salario;
    }
}
