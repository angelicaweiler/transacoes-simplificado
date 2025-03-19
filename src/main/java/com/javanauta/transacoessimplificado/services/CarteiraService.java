package com.javanauta.transacoessimplificado.services;

import com.javanauta.transacoessimplificado.infrastructure.entity.Carteira;
import com.javanauta.transacoessimplificado.infrastructure.entity.Usuario;
import com.javanauta.transacoessimplificado.infrastructure.exceptions.UserNotFound;
import com.javanauta.transacoessimplificado.infrastructure.repository.CarteiraRepository;
import com.javanauta.transacoessimplificado.infrastructure.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CarteiraService {

    private final CarteiraRepository repository;

    public void salvar(Carteira carteira){
       repository.save(carteira);
    }
}
