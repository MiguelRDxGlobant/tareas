package com.topic2.impresora.dao;


import com.topic2.impresora.models.Impresora;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;


@Repository
@Transactional
public class ImpresoraDaoimp implements ImpresoraDao{

    @PersistenceContext
    EntityManager entityManager;

    @Override
    @Transactional
    public List<Impresora> getImpresoras() {
        String query = "FROM Impresoras";
        return entityManager.createQuery(query).getResultList();

    }

    @Override
    public void eliminar(Long id) {
        Impresora impresora = entityManager.find(Impresora.class, id);
        entityManager.remove(impresora);
    }

    @Override
    public void registrar(Impresora impresora) {
        entityManager.merge(impresora);
    }
}
