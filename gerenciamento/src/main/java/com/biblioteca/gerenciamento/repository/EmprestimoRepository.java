package com.biblioteca.gerenciamento.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.biblioteca.gerenciamento.model.EmprestimoModel;

public interface EmprestimoRepository extends JpaRepository<EmprestimoModel, Integer>{

    

}
