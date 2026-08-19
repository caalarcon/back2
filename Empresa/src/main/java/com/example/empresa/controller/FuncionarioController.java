package com.example.empresa.controller;

import com.example.empresa.entities.Funcionario;
import com.example.empresa.Services.FuncionarioService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/funcionarios")
public class FuncionarioController {

    private final FuncionarioService funcionarioService;

    // Construtor do Controller.
    public FuncionarioController(FuncionarioService funcionarioService) {
        this.funcionarioService = funcionarioService;
    }

    // Cadastra um funcionário.
    @PostMapping
    public Funcionario cadastrar(@RequestBody Funcionario funcionario) {
        return funcionarioService.cadastrar(funcionario);
    }

    // Lista todos os funcionários.
    @GetMapping
    public List<Funcionario> listar() {
        return funcionarioService.listar();
    }

    // Busca um funcionário pela matrícula.
    @GetMapping("/{matricula}")
    public Funcionario buscar(@PathVariable Long matricula) {
        return funcionarioService.buscar(matricula);
    }

    // Atualiza um funcionário.
    @PutMapping("/{matricula}")
    public Funcionario atualizar(
            @PathVariable Long matricula,
            @RequestBody Funcionario funcionario) {

        return funcionarioService.atualizar(matricula, funcionario);
    }

    // Exclui um funcionário.
    @DeleteMapping("/{matricula}")
    public String excluir(@PathVariable Long matricula) {

        funcionarioService.excluir(matricula);

        return "Funcionário excluído com sucesso!";
    }
}
