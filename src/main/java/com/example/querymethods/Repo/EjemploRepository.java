package com.example.querymethods.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.querymethods.Entidades.Ejemplo;

@Repository
public interface EjemploRepository extends JpaRepository<Ejemplo, Integer>{
     Ejemplo findByNombre(String nombre);
}
