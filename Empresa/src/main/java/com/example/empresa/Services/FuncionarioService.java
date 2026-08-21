package com.example.empresa.Services;

import com.example.empresa.entities.Funcionario;
import com.example.empresa.Repositories.FuncionarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FuncionarioService {

    private final FuncionarioRepository funcionarioRepository;

    // Construtor do Service.
    public FuncionarioService(FuncionarioRepository funcionarioRepository) {
        this.funcionarioRepository = funcionarioRepository;
    }

    // Cadastra um funcionário.
    public Funcionario cadastrar(Funcionario funcionario) {
        return funcionarioRepository.save(funcionario);
    }

    // Lista todos os funcionários.
    public List<Funcionario> listar() {
        return funcionarioRepository.findAll();
    }

    // Busca um funcionário pela matrícula.
    public Funcionario buscar(Long matricula) {
        return funcionarioRepository.findById(matricula).orElse(null);
    }

    // Atualiza um funcionário.
    public Funcionario atualizar(Long matricula, Funcionario funcionario) {

        Funcionario funcionarioExistente =
                funcionarioRepository.findById(matricula).orElse(null);

        if (funcionarioExistente == null) {
            return null;
        }

        funcionarioExistente.setNome(funcionario.getNome());
        funcionarioExistente.setCargo(funcionario.getCargo());
        funcionarioExistente.setDtAdimicao(funcionario.getDtAdimicao());
        funcionarioExistente.setSalario(funcionario.getSalario());

        return funcionarioRepository.save(funcionarioExistente);
    }

    // Exclui um funcionário.
    public void excluir(Long matricula) {
        funcionarioRepository.deleteById(matricula);
    }
}