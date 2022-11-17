package com.outlook.teles.dario.academiadigital.service.impl;

import com.outlook.teles.dario.academiadigital.model.Aluno;
import com.outlook.teles.dario.academiadigital.model.AvaliacaoFisica;
import com.outlook.teles.dario.academiadigital.model.dto.AlunoDTO;
import com.outlook.teles.dario.academiadigital.model.dto.AlunoUpdateDTO;
import com.outlook.teles.dario.academiadigital.repository.AlunoRepository;
import com.outlook.teles.dario.academiadigital.service.IAlunoService;
import me.dio.academia.digital.infra.utils.JavaTimeUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class AlunoServiceImpl implements IAlunoService {

    @Autowired
    private AlunoRepository repository;

    @Override
    public Aluno create(AlunoDTO dto) {
        Aluno aluno = new Aluno();
        aluno.setNome(dto.getNome());
        aluno.setCpf(dto.getCpf());
        aluno.setBairro(dto.getBairro());
        aluno.setDataDeNascimento(dto.getDataDeNascimento());

        return repository.save(aluno);
    }

    @Override
    public Aluno get(Long id) {
        return repository.findById(id).get();
    }

    @Override
    public List<Aluno> getAll() {
        return repository.findAll();
    }

    @Override
    public Aluno update(Long id, AlunoUpdateDTO alunoUpdateDTO) {
        Aluno aluno = repository.findById(id).get();
        aluno.setNome(alunoUpdateDTO.getNome());
        aluno.setBairro(alunoUpdateDTO.getBairro());
        aluno.setDataDeNascimento(alunoUpdateDTO.getDataDeNascimento());
        repository.save(aluno);
        return aluno;
    }

    @Override
    public void delete(Long id) {
        Aluno aluno = repository.findById(id).get();
        repository.delete(aluno);
    }

    @Override
    public List<AvaliacaoFisica> getAllAvaliacaoFisicaId(Long id) {
        Aluno aluno = repository.findById(id).get();

        return aluno.getAvaliacoes();
    }

    @Override
    public List<Aluno> getAll(String dataDeNascimento) {
        if(dataDeNascimento == null){
            return repository.findAll();
        } else{
            LocalDate data = LocalDate.parse(dataDeNascimento, JavaTimeUtils.LOCAL_DATE_FORMATTER);
            return repository.findByDataDeNascimento(data);
        }
    }
}
