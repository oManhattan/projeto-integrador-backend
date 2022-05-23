package com.example.pdvsystem.dataAccess;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.pdvsystem.businessLogic.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer> {

}