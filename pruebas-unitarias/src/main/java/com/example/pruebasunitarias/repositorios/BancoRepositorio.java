package com.example.pruebasunitarias.repositorios;

import com.example.pruebasunitarias.entidades.Banco;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BancoRepositorio  extends JpaRepository<Banco, Long> {

}
