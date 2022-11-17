package com.outlook.teles.dario.academiadigital.service;

import com.outlook.teles.dario.academiadigital.model.Matricula;
import com.outlook.teles.dario.academiadigital.model.dto.MatriculaDTO;

import java.util.List;

public interface IMatriculaService {
    /**
     * Cria uma Matrícula e salva no banco de dados.
     * @param dto - formulário referente aos dados para criação da Matrícula no banco de dados.
     * @return - Matrícula recém-criada.
     */
    Matricula create(MatriculaDTO dto);

    /**
     * Retorna uma Matrícula que está no banco de dados de acordo com seu Id.
     * @param id - id da Matrícula que será exibida.
     * @return - Matrícula de acordo com o Id fornecido.
     */
    Matricula get(Long id);

    /**
     * Retorna todas as Matrículas que estão no banco de dados.
     * @return - uma lista com todas as Matrículas que estão salvas no DB.
     */
    List<Matricula> getAll();

    /**
     * Deleta uma Matrícula específica.
     * @param id - id da Matrícula que será removida.
     */
    void delete(Long id);

    /**
     * Retorna todas as Matrículas que estão no banco de dados.
     * @param bairro - bairro a ser consultado.
     * @return - uma lista com todas as Matrículas que estão salvas no DB.
     */
    List<Matricula> getAll(String bairro);

}
