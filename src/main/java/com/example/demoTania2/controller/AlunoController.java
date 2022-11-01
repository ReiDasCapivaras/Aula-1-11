package com.example.demoTania2.controller;

import com.example.demoTania2.model.Aluno;
import com.example.demoTania2.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping (value="/apiAluno")
public class AlunoController {

    @Autowired
    AlunoRepository alRepo;

    @GetMapping (value="/todos")
    public List<Aluno> buscarTodos()
    {
        return  alRepo.findAll();
    }

    @GetMapping ("/aluno/{ra}")
    public Optional<Aluno> buscarPorRa
            (@PathVariable(value="ra") int ra)
    {
        return alRepo.findById(ra);
    }

    @PostMapping ("/inserir")
    public void inserirAluno(@RequestBody Aluno al)
    {
        alRepo.save(al);
    }

    @DeleteMapping("/remover")
    public void removerAluno(@RequestBody Aluno aluno)
    {
        alRepo.delete(aluno);
    }

    @PostMapping("/atualiza")
    public void atualizarAluno(@RequestBody Aluno aluno)
    {
        alRepo.save(aluno);
    }

}
