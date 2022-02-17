package com.topic2.impresora.controllers;


import com.topic2.impresora.dao.ImpresoraDao;
import com.topic2.impresora.models.Impresora;
import com.topic2.impresora.service.PrinterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin
@RestController
public class ImpresoraController {

    @Autowired
    private ImpresoraDao impresoraDao;

    @Autowired
    private PrinterService printerService;


    @RequestMapping("impresora")
    public ResponseEntity<Impresora>  create(@RequestBody Impresora impresora){

        Impresora imp = printerService.create(impresora);

        try {
            return ResponseEntity.status(201).body(imp);
        } catch (Exception e){
            return  ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }

    }

    @RequestMapping(value = "impresora/{id}")
    public Impresora getImpresora(@PathVariable Long id){
        Impresora impresora = new Impresora();
        impresora.setId(id);
        impresora.setMarca("HP");
        impresora.setBlancoYnegro("Imprime blanco y negro");
        impresora.setColor("Imprime a color");
        return impresora;
    }

    @RequestMapping(value = "impresoras")
    public List<Impresora> getImpresoras(){
       System.out.println("Prueba");
       return printerService.list();
    }

    @RequestMapping(value = "impresoras", method = RequestMethod.POST)
    public void registrarImpresora(@RequestBody Impresora impresora){
        System.out.println("Prueba");
        impresoraDao.registrar(impresora);
    }


    @RequestMapping(value = "usuario123")
    public Impresora editar(){
        Impresora impresora = new Impresora();
        impresora.setMarca("HP");
        impresora.setBlancoYnegro("Imprime blanco y negro");
        impresora.setColor("Imprime a color");
        return impresora;
    }

    @RequestMapping(value = "impresora/{id}", method = RequestMethod.DELETE)
    public void eliminar(@PathVariable Long id){
        impresoraDao.eliminar(id);
    }

    @RequestMapping(value = "usuario789")
    public Impresora buscar(){
        Impresora impresora = new Impresora();
        impresora.setMarca("HP");
        impresora.setBlancoYnegro("Imprime blanco y negro");
        impresora.setColor("Imprime a color");
        return impresora;
    }
}
