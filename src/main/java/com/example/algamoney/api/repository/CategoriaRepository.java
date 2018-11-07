package com.example.algamoney.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.algamoney.api.model.Categoria;

											//interface com varios metodos para consultas e saves
public interface CategoriaRepository extends JpaRepository<Categoria, Long>{

}
