package com.example.demo.controllers;

import com.example.demo.models.CursoModel;
import com.example.demo.services.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/curso")
public class CursoController {
    @Autowired
    CursoService cursoService;

    @GetMapping()
    public ArrayList<CursoModel> obtenerCursos(){
        return cursoService.obtenerCursos();
    }

    @PostMapping()
    public CursoModel guardarCurso(@RequestBody CursoModel curso){
        return this.cursoService.guardarCurso(curso);
    }

    @GetMapping( path = "/{id}")
    public Optional<CursoModel> obtenerCursoPorId(@PathVariable("id") Long id){
        return this.cursoService.obtenerPorId(id);
    }

    @GetMapping("/query")
    public ArrayList<CursoModel> obtenerCursoPorProfesor(@RequestParam("profesor") String profesor){
        return this.cursoService.obtenerPorProfesor(profesor);
    }

    @DeleteMapping(path = "/{id}")
    public String eliminarPorId(@PathVariable("id") Long id){
        boolean ok = this.cursoService.eliminarCurso(id);
        if (ok){
            return "Se eliminó el usuario con id " + id;
        } else {
            return "No pudo eliminar el usuario con id " + id;
        }
    }
}
