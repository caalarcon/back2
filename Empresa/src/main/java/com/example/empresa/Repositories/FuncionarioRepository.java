package com.example.empresa.Repositories;

import com.example.empresa.entities.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;

// Repository responsável por realizar as operações de acesso ao banco de dados.
public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {
}
