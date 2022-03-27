package com.example.demo.services;


import com.example.demo.models.ComentarioModel;
import com.example.demo.repositories.ComentarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Optional;

@Service
public class ComentarioService {

    @Autowired
    ComentarioRepository comentarioRepository;

    public ArrayList<ComentarioModel> obtenerComentarios(){
        return (ArrayList<ComentarioModel>) comentarioRepository.findAll();
    }

    public  ComentarioModel guardarComentario(ComentarioModel comentario){
        return comentarioRepository.save(comentario);
    }
    public Optional<ComentarioModel> obtenerPorId(Long id){
        return comentarioRepository.findById(id);
    }

    public  ArrayList<ComentarioModel> obtenerPorRating(Integer rating){
        return comentarioRepository.findByRating(rating);
    }

    public boolean eliminarComentario(Long id) {
        try {
            comentarioRepository.deleteById(id);
            return true;
        } catch (Exception err) {
            return false;
        }
    }
}
