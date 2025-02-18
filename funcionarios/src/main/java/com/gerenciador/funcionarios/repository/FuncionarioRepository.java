package com.gerenciador.funcionarios.repository;

import com.gerenciador.funcionarios.entities.Funcionario;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface FuncionarioRepository extends MongoRepository<Funcionario, String> {
    Optional<Funcionario> findByFuncionarioId(int funcionarioId);
}
