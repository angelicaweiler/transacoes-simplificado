package com.javanauta.transacoessimplificado.infrastructure.repository;

import com.javanauta.transacoessimplificado.infrastructure.entity.Carteira;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarteiraRepository extends JpaRepository<Carteira, Long> {
}
