package com.example.empresa.DTO;

import com.example.empresa.entities.Funcionario;

import java.time.LocalDate;

public class FuncionarioResponse {

    private Long matricula;
    private String nome;
    private String cargo;
    private LocalDate dtAdimicao;
    private Double salario;

    // Construtor vazio.
    public FuncionarioResponse() {
    }

    // Construtor que transforma o Funcionario em uma resposta.
    public FuncionarioResponse(Funcionario funcionario) {
        this.matricula = funcionario.getMatricula();
        this.nome = funcionario.getNome();
        this.cargo = funcionario.getCargo();
        this.dtAdimicao = funcionario.getDtAdimicao();
        this.salario = funcionario.getSalario();
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
