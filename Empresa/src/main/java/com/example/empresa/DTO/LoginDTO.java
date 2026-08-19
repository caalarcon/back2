package com.example.empresa.DTO;

public class LoginDTO {

    private String email;
    private String senha;

    // Construtor vazio.
    public LoginDTO() {
    }

    // Retorna o e-mail.
    public String getEmail() {
        return email;
    }

    // Define o e-mail.
    public void setEmail(String email) {
        this.email = email;
    }

    // Retorna a senha.
    public String getSenha() {
        return senha;
    }

    // Define a senha.
    public void setSenha(String senha) {
        this.senha = senha;
    }
}