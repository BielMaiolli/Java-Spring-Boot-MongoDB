package com.gerenciador.funcionarios.service;

import com.gerenciador.funcionarios.entities.Funcionario;
import com.gerenciador.funcionarios.repository.FuncionarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FuncionarioService {

    private final FuncionarioRepository funcionarioRepository;

    public FuncionarioService(FuncionarioRepository funcionarioRepository) {
        this.funcionarioRepository = funcionarioRepository;
    }

    public List<Funcionario> getAllFuncionarios() {
        return funcionarioRepository.findAll();
    }

    public Optional<Funcionario> getFuncionarioById(String id) {
        return funcionarioRepository.findById(id);
    }

    public Funcionario createFuncionario(Funcionario funcionario) {
        return funcionarioRepository.save(funcionario);
    }

    public void deleteFuncionario(String id) {
        funcionarioRepository.deleteById(id);
    }

    public Optional<Funcionario> getFuncionarioByFuncionarioId(int funcionarioId) {
        return funcionarioRepository.findByFuncionarioId(funcionarioId);
    }

}
