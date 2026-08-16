package com.example.cadastrousuario.infrastructure.repository;

import com.example.cadastrousuario.infrastructure.entitys.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

    Optional <Usuario> findByEmail(String email);

    @Transactional
    void deleteByEmail(String email);
}
