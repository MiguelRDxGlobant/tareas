package com.example.demo.controllers;

import com.example.demo.models.ComentarioModel;
import com.example.demo.services.ComentarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/comentario")
public class ComentarioController {

    @Autowired
    ComentarioService comentarioService;

    @GetMapping
    public ArrayList<ComentarioModel> obtenerComentarios(){
        return comentarioService.obtenerComentarios();
    }

    @PostMapping()
    public ComentarioModel guardarComentario(@RequestBody ComentarioModel comentario){
        return this.comentarioService.guardarComentario(comentario);
    }

    @GetMapping(path = "/{id}")
    public Optional<ComentarioModel> obtenerComentarioPorId(@PathVariable("id") Long id){
        return this.comentarioService.obtenerPorId(id);
    }

    @GetMapping("/query")
    public ArrayList<ComentarioModel> obtenerComentarioPorRating(@RequestParam("rating") Integer rating){
        return this.comentarioService.obtenerPorRating(rating);
    }

    @DeleteMapping(path = "/{id}")
    public String eliminarPorId(@PathVariable("id") Long id){
        boolean ok = this.comentarioService.eliminarComentario(id);
        if(ok) {
            return "Se eliminó el comentario con id " + id;
        } else {
            return "No pudo eliminar el comentario con id " + id;
        }
    }
}
