package com.ruan.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ruan.cursomc.domains.Estado;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Integer>{
	
}
