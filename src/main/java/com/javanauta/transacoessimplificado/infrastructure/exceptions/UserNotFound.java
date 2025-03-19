package com.javanauta.transacoessimplificado.infrastructure.exceptions;

public class UserNotFound extends RuntimeException {

    public UserNotFound(String mensagem){
        super(mensagem);
    }
}
