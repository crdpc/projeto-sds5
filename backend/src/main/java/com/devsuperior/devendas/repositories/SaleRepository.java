package com.devsuperior.devendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.devendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long>{
	

}
