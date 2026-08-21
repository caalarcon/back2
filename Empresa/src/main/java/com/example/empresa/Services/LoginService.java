package com.example.empresa.Services;

import com.example.empresa.DTO.LoginDTO;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    // Realiza o login.
    public String login(LoginDTO loginDTO) {

        if (loginDTO.getEmail().equals("admin@gmail.com")
                && loginDTO.getSenha().equals("1234")) {

            return "Acesso liberado";
        }

        return "Senha ou e-mail incorretos";
    }
}
