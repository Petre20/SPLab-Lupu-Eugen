package com.example.splablupueugen.persistence;

import java.util.List;
import java.util.Optional;

public interface CrudRepository<T> {
    T save(T entity);
    List<T> findAll();
    Optional<T> findById(Integer id);
    void deleteById(Integer id);
}