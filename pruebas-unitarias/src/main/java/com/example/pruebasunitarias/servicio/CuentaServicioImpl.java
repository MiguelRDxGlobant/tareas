package com.example.pruebasunitarias.servicio;


import com.example.pruebasunitarias.entidades.Banco;
import com.example.pruebasunitarias.entidades.Cuenta;
import com.example.pruebasunitarias.repositorios.BancoRepositorio;
import com.example.pruebasunitarias.repositorios.CuentaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.List;

@Service
public class CuentaServicioImpl implements CuentaServicio {

    @Autowired
    private CuentaRepositorio cuentaRepositorio;

    @Autowired
    private BancoRepositorio bancoRepositorio;

    @Override
    @Transactional(readOnly = true)
    public List<Cuenta> listAll(){

        return cuentaRepositorio.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Cuenta findById(Long id){
        return  cuentaRepositorio.findById(id).orElseThrow();
    }

    @Override
    @Transactional
    public Cuenta save(Cuenta cuenta){
        // TODO Auto-generated method stub
        return cuentaRepositorio.save(cuenta);
    }

    @Override
    public  int revisarTotalDeTransferencias(Long bancoId){
        Banco banco = bancoRepositorio.findById(bancoId).orElseThrow();
        return  banco.getTotalTransferencias();
    }

    @Override
    public BigDecimal revisarSaldo(long cuentaId){
        Cuenta cuenta = cuentaRepositorio.findById(cuentaId).orElseThrow();
        return cuenta.getSaldo();
    }

    @Override
    public void transferirDinero(Long numeroCuentaOrigen, Long numeroCuentaDestino, BigDecimal monto, Long bancoId) {
        Cuenta cuentaOrigen = cuentaRepositorio.findById(numeroCuentaOrigen).orElseThrow();
        cuentaOrigen.realizarDebito(monto);
        cuentaRepositorio.save(cuentaOrigen);

        Cuenta cuentaDestino = cuentaRepositorio.findById(numeroCuentaDestino).orElseThrow();
        cuentaDestino.realizarCredito(monto);
        cuentaRepositorio.save(cuentaDestino);

        Banco banco = bancoRepositorio.findById(bancoId).orElseThrow();
        int totalTransferencias = banco.getTotalTransferencias();
        banco.setTotalTransferencias(++totalTransferencias);
        bancoRepositorio.save(banco);
    }
}
