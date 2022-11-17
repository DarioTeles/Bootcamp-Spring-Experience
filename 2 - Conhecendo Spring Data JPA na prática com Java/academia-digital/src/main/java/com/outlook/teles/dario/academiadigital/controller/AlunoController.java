package com.outlook.teles.dario.academiadigital.controller;

import com.outlook.teles.dario.academiadigital.model.Aluno;
import com.outlook.teles.dario.academiadigital.model.AvaliacaoFisica;
import com.outlook.teles.dario.academiadigital.model.dto.AlunoDTO;
import com.outlook.teles.dario.academiadigital.model.dto.AlunoUpdateDTO;
import com.outlook.teles.dario.academiadigital.service.impl.AlunoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/alunos")
public class AlunoController {
    @Autowired
    private AlunoServiceImpl service;

    @GetMapping
    public List<Aluno> getAll(){
        return service.getAll();
    }

    @PostMapping
    public Aluno create(@Valid @RequestBody AlunoDTO dto){
        return service.create(dto);
    }

    @GetMapping("/avaliacoes/{id}")
    public List<AvaliacaoFisica> getAllAvaliacaoFisica(@PathVariable Long id){
        return service.getAllAvaliacaoFisicaId(id);
    }

    @GetMapping("/aniversario")
    public List<Aluno> getAll(@RequestParam(value = "dataDeNascimento", required = false) String dataDeNascimento){
        return service.getAll(dataDeNascimento);
    }

    @GetMapping("/{id}")
    public Aluno get(@PathVariable Long id){
        return service.get(id);
    }

    @PutMapping("{id}")
    public Aluno update(@Valid @RequestBody AlunoUpdateDTO dto, @PathVariable Long id){
        return service.update(id, dto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        service.delete(id);
    }
}
