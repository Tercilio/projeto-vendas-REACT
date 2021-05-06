package com.tercilio.vendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tercilio.vendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long>{

}
