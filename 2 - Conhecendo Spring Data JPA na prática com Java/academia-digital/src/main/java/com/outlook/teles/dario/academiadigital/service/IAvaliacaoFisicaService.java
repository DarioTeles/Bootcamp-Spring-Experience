package com.outlook.teles.dario.academiadigital.service;

import com.outlook.teles.dario.academiadigital.model.AvaliacaoFisica;
import com.outlook.teles.dario.academiadigital.model.dto.AvaliacaoFisicaDTO;
import com.outlook.teles.dario.academiadigital.model.dto.AvaliacaoFisicaUpdateDTO;

import java.util.List;

public interface IAvaliacaoFisicaService {
    /**
     * Cria uma Avaliação Física e salva no banco de dados.
     * @param dto - formulário referente aos dados para criação da Avaliação Física no banco de dados.
     * @return - Avaliação Física recém-criada.
     */
    AvaliacaoFisica create(AvaliacaoFisicaDTO dto);

    /**
     * Retorna uma Avaliação Física que está no banco de dados de acordo com seu Id.
     * @param id - id da Avaliação Física que será exibida.
     * @return - Avaliação Física de acordo com o Id fornecido.
     */
    AvaliacaoFisica get(Long id);

    /**
     * Retorna todas as Avaliações Física que estão no banco de dados.
     * @return - Uma lista com todas as Avaliações Física que estão salvas no DB.
     */
    List<AvaliacaoFisica> getAll();

    /**
     * Atualiza a avaliação física.
     * @param id - id da Avaliação Física que será atualizada.
     * @param avaliacaoFisicaUpdateDTO - formulário referente aos dados necessários para atualização da Avaliação
     * Física no banco de dados.
     * @return - Avaliação Física recém-atualizada.
     */
    AvaliacaoFisica update(Long id, AvaliacaoFisicaUpdateDTO avaliacaoFisicaUpdateDTO);

    /**
     * Deleta uma Avaliação Física específica.
     * @param id - id da Avaliação Física que será removida.
     */
    void delete(Long id);
}