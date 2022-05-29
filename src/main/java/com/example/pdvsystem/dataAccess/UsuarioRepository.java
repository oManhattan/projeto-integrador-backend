package com.example.pdvsystem.dataAccess;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.pdvsystem.businessLogic.model.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{

	Usuario findByDocumento(String documento);
	
	Usuario findByEmail(String email);
	
	List<Usuario> findByIdEmpresa(Integer idEmpresa);
}
