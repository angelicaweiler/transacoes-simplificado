package com.javanauta.transacoessimplificado.infrastructure.repository;

import com.javanauta.transacoessimplificado.infrastructure.entity.Transacoes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransacaoRepository extends JpaRepository<Transacoes, Long> {
}
