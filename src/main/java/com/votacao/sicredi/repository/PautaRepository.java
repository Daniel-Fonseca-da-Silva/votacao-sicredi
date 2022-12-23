package com.votacao.sicredi.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.votacao.sicredi.model.Pauta;

@Repository
public interface PautaRepository extends JpaRepository<Pauta, Long> {
	
}
