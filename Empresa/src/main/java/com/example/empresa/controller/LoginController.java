package com.example.empresa.controller;

import com.example.empresa.DTO.LoginDTO;
import com.example.empresa.Services.LoginService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class LoginController {

    private final LoginService loginService;

    // Construtor do Controller.
    public LoginController(LoginService loginService) {
        this.loginService = loginService;
    }

    // Realiza o login.
    @PostMapping
    public String login(@RequestBody LoginDTO loginDTO) {
        return loginService.login(loginDTO);
    }
}