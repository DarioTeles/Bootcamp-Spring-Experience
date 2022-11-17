package com.outlook.teles.dario.academiadigital.service;

import com.outlook.teles.dario.academiadigital.model.Aluno;
import com.outlook.teles.dario.academiadigital.model.AvaliacaoFisica;
import com.outlook.teles.dario.academiadigital.model.dto.AlunoDTO;
import com.outlook.teles.dario.academiadigital.model.dto.AlunoUpdateDTO;

import java.util.List;

public interface IAlunoService {
    /**
     * Cria um Aluno e salva no banco de dados.
     * @param dto - formulário referente aos dados para criação de um Aluno no banco de dados.
     * @return - Aluno recém-criado.
     */
    Aluno create(AlunoDTO dto);

    /**
     * Retorna um Aluno que está no banco de dados de acordo com seu Id.
     * @param id - id do Aluno que será exibido.
     * @return - Aluno de acordo com o Id fornecido.
     */
    Aluno get(Long id);

    /**
     * Retorna todos os Alunos que estão no banco de dados.
     * @return - Uma lista os Alunos que estão salvas no DB.
     */
    List<Aluno> getAll();

    /**
     * Atualiza o Aluno.
     * @param id - id do Aluno que será atualizado.
     * @param alunoUpdateDTO - formulário referente aos dados necessários para atualização do Aluno
     * no banco de dados.
     * @return - Aluno recém-atualizado.
     */
    Aluno update(Long id, AlunoUpdateDTO alunoUpdateDTO);

    /**
     * Deleta um Aluno específico.
     * @param id - id do Aluno que será removido.
     */
    void delete(Long id);

    List<AvaliacaoFisica> getAllAvaliacaoFisicaId(Long id);

    List<Aluno> getAll(String dataDeNascimento);

}
