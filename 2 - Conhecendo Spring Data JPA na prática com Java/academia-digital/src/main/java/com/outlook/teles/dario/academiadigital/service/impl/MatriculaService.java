package com.outlook.teles.dario.academiadigital.service.impl;

import com.outlook.teles.dario.academiadigital.model.Matricula;
import com.outlook.teles.dario.academiadigital.model.dto.MatriculaDTO;
import com.outlook.teles.dario.academiadigital.repository.AlunoRepository;
import com.outlook.teles.dario.academiadigital.repository.MatriculaRepository;
import com.outlook.teles.dario.academiadigital.service.IMatriculaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class MatriculaService implements IMatriculaService {

    @Autowired
    private MatriculaRepository matriculaRepository;

    @Autowired
    private AlunoRepository alunoRepository;

    @Override
    public Matricula create(MatriculaDTO dto) {
        Matricula matricula = new Matricula();
        matricula.setAluno(alunoRepository.findById(dto.getAlunoId()).get());
        matricula.setDataDaMatricula(LocalDateTime.now());
        matriculaRepository.save(matricula);
        return matricula;
    }

    @Override
    public Matricula get(Long id) {
        return matriculaRepository.findById(id).get();
    }

    @Override
    public List<Matricula> getAll() {
        return matriculaRepository.findAll();
    }

    @Override
    public void delete(Long id) {
        Matricula matricula = matriculaRepository.findById(id).get();
        matriculaRepository.delete(matricula);
    }

    @Override
    public List<Matricula> getAll(String bairro) {
        if(bairro == null){
            return matriculaRepository.findAll();
        } else{
            return matriculaRepository.findByAlunoBairro("Itapevi");
        }
    }
}
