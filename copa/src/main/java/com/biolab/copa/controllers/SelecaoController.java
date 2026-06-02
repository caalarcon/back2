package com.biolab.copa.controllers;

import com.biolab.copa.entities.Selecao;
import com.biolab.copa.repositories.SelecaoRepositories;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SelecaoController {

    private final SelecaoRepositories selecaoRepositories;

    public SelecaoController(SelecaoRepositories selecaoRepositories) {
        this.selecaoRepositories = selecaoRepositories;
    }

    @PostMapping
    public String criarSelecao(@RequestBody Selecao selecao) {
        Selecao s = new Selecao(selecao.getNome(), selecao.getUniforme(), selecao.getMascote());
        selecaoRepositories.save(s);

        return "Calvo com sucesso!!";
    }

    @PostMapping(value = "teste")
    public Selecao criarSelecao1(@RequestBody Selecao selecao) {
        Selecao s = new Selecao(selecao.getNome(), selecao.getUniforme(), selecao.getMascote());
        selecaoRepositories.save(s);

        return s;
    }

    @GetMapping
    public List<Selecao> mostrarSelecoes() {
        List<Selecao> listarSelecao = selecaoRepositories.findAll();
        return listarSelecao;
    }
}
