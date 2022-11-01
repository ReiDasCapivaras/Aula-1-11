package com.example.demoTania2.repository;

import com.example.demoTania2.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository
        extends JpaRepository <Aluno,Integer> {
}
