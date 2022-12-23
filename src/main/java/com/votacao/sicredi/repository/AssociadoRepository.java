package com.votacao.sicredi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.votacao.sicredi.model.Associado;

@Repository
public interface AssociadoRepository extends JpaRepository<Associado, Long>{

}
