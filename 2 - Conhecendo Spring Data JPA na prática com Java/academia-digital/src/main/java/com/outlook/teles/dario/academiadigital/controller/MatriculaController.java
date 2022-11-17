package com.outlook.teles.dario.academiadigital.controller;

import com.outlook.teles.dario.academiadigital.model.AvaliacaoFisica;
import com.outlook.teles.dario.academiadigital.model.Matricula;
import com.outlook.teles.dario.academiadigital.model.dto.AvaliacaoFisicaUpdateDTO;
import com.outlook.teles.dario.academiadigital.model.dto.MatriculaDTO;
import com.outlook.teles.dario.academiadigital.service.impl.MatriculaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/matriculas")
public class MatriculaController {

    @Autowired
    private MatriculaService service;

    @GetMapping
    public List<Matricula> getAll(){
        return service.getAll();
    }

    @PostMapping
    public Matricula create(@Valid @RequestBody MatriculaDTO dto){
        return service.create(dto);
    }

    @GetMapping("/alunosbairro")
    public List<Matricula> getAll(@RequestParam(value = "bairro", required = false) String bairro){
        return service.getAll(bairro);
    }

    @GetMapping("/{id}")
    public Matricula get(@PathVariable Long id){
        return service.get(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        service.delete(id);
    }

}
