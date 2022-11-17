package com.outlook.teles.dario.academiadigital.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MatriculaDTO {

    @NotNull(message = "Preencha o campo corretamente.")
    @Positive(message = "O Id do aluno precisa ser positivo.")
    private Long alunoId;
}
