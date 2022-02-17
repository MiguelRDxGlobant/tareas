package com.topic2.impresora.service;

import com.topic2.impresora.models.Impresora;
import com.topic2.impresora.repository.ImpresoraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PrinterService {

    @Autowired
    private ImpresoraRepository impresoraRepository;

    public List<Impresora> list (){
        return impresoraRepository.findAll();
    }


    public Impresora create(Impresora impresora) {
        return impresoraRepository.save(impresora);
    }
}
