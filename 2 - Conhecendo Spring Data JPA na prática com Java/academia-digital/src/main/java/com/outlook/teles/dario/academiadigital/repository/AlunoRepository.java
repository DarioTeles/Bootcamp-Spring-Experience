package com.outlook.teles.dario.academiadigital.repository;

import com.outlook.teles.dario.academiadigital.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Long> {

    /**
     *
     * @param dataDeNascimento: data de nascimento dos alunos
     * @return lista com todos os alunos com a data de nascimento passado como parâmetro na função
     */
    List<Aluno> findByDataDeNascimento(LocalDate dataDeNascimento);
}
