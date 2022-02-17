package com.topic2.impresora.dao;


import com.topic2.impresora.models.Impresora;

import java.util.List;

public interface ImpresoraDao {

    List<Impresora> getImpresoras();

    void eliminar(Long id);

    void registrar(Impresora impresora);
}
