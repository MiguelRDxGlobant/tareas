package com.example.demo.repositories;

import com.example.demo.models.ComentarioModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface ComentarioRepository extends CrudRepository<ComentarioModel, Long> {
    public abstract ArrayList<ComentarioModel> findByRating(Integer rating);
}
