package com.javanauta.transacoessimplificado.services;

import com.javanauta.transacoessimplificado.infrastructure.clients.AutorizacaoClient;
import com.javanauta.transacoessimplificado.infrastructure.clients.NotificacaoClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
@RequiredArgsConstructor
public class NotificacaoService {

    private final NotificacaoClient client;

    public void enviarNotificacao(){
      client.enviarNotificacao();
    }
}
