package com.example.demo.services;

import com.example.demo.models.CursoModel;
import com.example.demo.repositories.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class CursoService {

    @Autowired
    CursoRepository cursoRepository;

    public ArrayList<CursoModel> obtenerCursos(){
       return (ArrayList<CursoModel>)cursoRepository.findAll();
    }

    public CursoModel guardarCurso(CursoModel curso){
        return cursoRepository.save(curso);
    }


    public Optional<CursoModel> obtenerPorId(Long id){
        return cursoRepository.findById(id);
    }

    public ArrayList<CursoModel> obtenerPorProfesor(String profesor){
        return cursoRepository.findByProfesor(profesor);
    }

    public  boolean eliminarCurso(Long id){
        try{
            cursoRepository.deleteById(id);
            return true;
        }catch (Exception err){
            return false;
        }
    }
}
