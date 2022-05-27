package com.example.pdvsystem.dataAccess;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.pdvsystem.businessLogic.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{

}
