package com.javanauta.transacoessimplificado.infrastructure.repository;

import com.javanauta.transacoessimplificado.infrastructure.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
