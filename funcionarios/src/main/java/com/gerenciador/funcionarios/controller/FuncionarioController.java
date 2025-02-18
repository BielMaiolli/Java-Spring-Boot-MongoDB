package com.gerenciador.funcionarios.controller;

import com.gerenciador.funcionarios.entities.Funcionario;
import com.gerenciador.funcionarios.service.FuncionarioService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/funcionarios")
public class FuncionarioController {

    private final FuncionarioService funcionarioService;

    @Autowired
    public FuncionarioController(FuncionarioService funcionarioService) {
        this.funcionarioService = funcionarioService;
    }

    @Operation(summary = "Lista todos os usuários.")
    @GetMapping("/todos-funcionarios")
    public List<Funcionario> getAllFuncionarios() {
        return funcionarioService.getAllFuncionarios();
    }

    @Operation(summary = "Busca funcionario por ID.")
    @GetMapping("/buscar-funcionario/{id}")
    public Optional<Funcionario> getFuncionarioById(@PathVariable String id) {
        return funcionarioService.getFuncionarioById(id);
    }

    @Operation(summary = "Busca funcionario por FuncionarioId.")
    @GetMapping("/buscar-funcionario/{funcionarioId}")
    public Optional<Funcionario> getFuncionarioByFuncionarioId(@PathVariable int funcionarioId) {
        return funcionarioService.getFuncionarioByFuncionarioId(funcionarioId);
    }

    @Operation(summary = "Cria um novo funcionario")
    @PostMapping("/novo-funcionario")
    public Funcionario createFuncionario(@RequestBody Funcionario funcionario) {
        return funcionarioService.createFuncionario(funcionario);
    }

    @Operation(summary = "Deleta um funcionario pelo Id")
    @DeleteMapping("/deletar-funcionario/{id}")
    public void deleteFuncionario(@PathVariable String id) {
        funcionarioService.deleteFuncionario(id);
    }
}
