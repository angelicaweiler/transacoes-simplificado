package com.javanauta.transacoessimplificado.services;

import com.javanauta.transacoessimplificado.infrastructure.entity.Usuario;
import com.javanauta.transacoessimplificado.infrastructure.exceptions.UserNotFound;
import com.javanauta.transacoessimplificado.infrastructure.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UsuarioService {

    private final UsuarioRepository repository;

    public Usuario buscarUsuario(Long id){
       return repository.findById(id)
               .orElseThrow(() ->
                       new UserNotFound("Usuário não encontrado"));
    }
}
