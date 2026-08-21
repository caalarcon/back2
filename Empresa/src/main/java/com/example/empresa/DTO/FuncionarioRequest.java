package com.example.empresa.DTO;

import java.time.LocalDate;

public class FuncionarioRequest {

    private String nome;
    private String cargo;
    private LocalDate dtAdimicao;
    private Double salario;

    // Construtor vazio que cria o objeto.
    public FuncionarioRequest() {
    }

    // Retorna o nome informado no cadastro.
    public String getNome() {
        return nome;
    }

    // Define o nome informado no cadastro.
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Retorna o cargo informado no cadastro.
    public String getCargo() {
        return cargo;
    }

    // Define o cargo informado no cadastro.
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    // Retorna a data de admissão informada.
    public LocalDate getDtAdimicao() {
        return dtAdimicao;
    }

    // Define a data de admissão informada.
    public void setDtAdimicao(LocalDate dtAdimicao) {
        this.dtAdimicao = dtAdimicao;
    }

    // Retorna o salário informado.
    public Double getSalario() {
        return salario;
    }

    // Define o salário informado.
    public void setSalario(Double salario) {
        this.salario = salario;
    }
}
