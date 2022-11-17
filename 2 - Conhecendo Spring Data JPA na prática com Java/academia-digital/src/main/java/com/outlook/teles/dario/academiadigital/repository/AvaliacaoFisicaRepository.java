package com.outlook.teles.dario.academiadigital.repository;

import com.outlook.teles.dario.academiadigital.model.AvaliacaoFisica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AvaliacaoFisicaRepository extends JpaRepository<AvaliacaoFisica, Long> {
}
