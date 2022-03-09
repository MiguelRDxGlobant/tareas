package com.example.demo.repositories;

import com.example.demo.models.CursoModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface CursoRepository extends CrudRepository<CursoModel, Long> {
    public abstract ArrayList<CursoModel> findByProfesor(String profesor);
}
