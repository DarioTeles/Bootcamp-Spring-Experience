package com.outlook.teles.dario.academiadigital.service.impl;

import com.outlook.teles.dario.academiadigital.model.Aluno;
import com.outlook.teles.dario.academiadigital.model.AvaliacaoFisica;
import com.outlook.teles.dario.academiadigital.model.dto.AvaliacaoFisicaDTO;
import com.outlook.teles.dario.academiadigital.model.dto.AvaliacaoFisicaUpdateDTO;
import com.outlook.teles.dario.academiadigital.repository.AlunoRepository;
import com.outlook.teles.dario.academiadigital.repository.AvaliacaoFisicaRepository;
import com.outlook.teles.dario.academiadigital.service.IAvaliacaoFisicaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AvaliacaoFisicaService implements IAvaliacaoFisicaService {

    @Autowired
    private AvaliacaoFisicaRepository avaliacaoFisicaRepository;

    @Autowired
    private AlunoRepository alunoRepository;

    @Override
    public AvaliacaoFisica create(AvaliacaoFisicaDTO dto) {
        AvaliacaoFisica avaliacaoFisica = new AvaliacaoFisica();
        avaliacaoFisica.setAluno(alunoRepository.findById(dto.getAlunoId()).get());
        avaliacaoFisica.setAltura(dto.getAltura());
        avaliacaoFisica.setPeso(dto.getPeso());
        return avaliacaoFisicaRepository.save(avaliacaoFisica);
    }

    @Override
    public AvaliacaoFisica get(Long id) {
        return avaliacaoFisicaRepository.findById(id).get();
    }

    @Override
    public List<AvaliacaoFisica> getAll() {
        return avaliacaoFisicaRepository.findAll();
    }

    @Override
    public AvaliacaoFisica update(Long id, AvaliacaoFisicaUpdateDTO avaliacaoFisicaUpdateDTO) {

        AvaliacaoFisica avaliacaoFisica = avaliacaoFisicaRepository.findById(id).get();
        avaliacaoFisica.setAltura(avaliacaoFisicaUpdateDTO.getAltura());
        avaliacaoFisica.setPeso(avaliacaoFisicaUpdateDTO.getPeso());
        avaliacaoFisicaRepository.save(avaliacaoFisica);
        return avaliacaoFisica;
    }

    @Override
    public void delete(Long id) {
        AvaliacaoFisica avaliacaoFisica = avaliacaoFisicaRepository.findById(id).get();
        avaliacaoFisicaRepository.delete(avaliacaoFisica);
    }
}
