package com.outlook.teles.dario.academiadigital.controller;

import com.outlook.teles.dario.academiadigital.model.Aluno;
import com.outlook.teles.dario.academiadigital.model.AvaliacaoFisica;
import com.outlook.teles.dario.academiadigital.model.dto.AlunoUpdateDTO;
import com.outlook.teles.dario.academiadigital.model.dto.AvaliacaoFisicaDTO;
import com.outlook.teles.dario.academiadigital.model.dto.AvaliacaoFisicaUpdateDTO;
import com.outlook.teles.dario.academiadigital.service.impl.AvaliacaoFisicaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/avaliacoes")
public class AvaliacaoFisicaController {

    @Autowired
    private AvaliacaoFisicaService service;

    @GetMapping
    public List<AvaliacaoFisica> getAll(){
        return service.getAll();
    }

    @PostMapping
    public AvaliacaoFisica create(@Valid @RequestBody AvaliacaoFisicaDTO dto){
        return service.create(dto);
    }

    @GetMapping("/{id}")
    public AvaliacaoFisica get(@PathVariable Long id){
        return service.get(id);
    }

    @PutMapping("{id}")
    public AvaliacaoFisica update(@Valid @RequestBody AvaliacaoFisicaUpdateDTO dto, @PathVariable Long id){
        return service.update(id, dto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        service.delete(id);
    }
}
