package com.gerenciador.funcionarios.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@Document(collation = "funcionarios")
public class Funcionario {

    @Id
    private String id;
    private int funcionarioId;
    private String name;
    private Double salario;

}
