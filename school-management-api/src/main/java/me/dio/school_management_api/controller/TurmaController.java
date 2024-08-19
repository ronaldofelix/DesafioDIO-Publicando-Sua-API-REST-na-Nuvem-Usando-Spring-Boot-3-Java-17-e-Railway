package me.dio.school_management_api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import me.dio.school_management_api.domain.model.Turma;
import me.dio.school_management_api.service.TurmaService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/turmas")
public class TurmaController {

    @Autowired
    private TurmaService turmaService;

    @GetMapping
    public List<Turma> listarTodas() {
        return turmaService.listarTodas();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Turma> buscarPorId(@PathVariable Long id) {
        Optional<Turma> turma = turmaService.buscarPorId(id);
        return turma.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Turma> cadastrar(@RequestBody Turma turma) {
        Turma novaTurma = turmaService.cadastrar(turma);
        return ResponseEntity.status(HttpStatus.CREATED).body(novaTurma);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Turma> atualizar(@PathVariable Long id, @RequestBody Turma turma) {
        Turma turmaAtualizada = turmaService.atualizar(id, turma);
        return turmaAtualizada != null ? ResponseEntity.ok(turmaAtualizada) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluir(@PathVariable Long id) {
        turmaService.excluir(id);
        return ResponseEntity.noContent().build();
    }
}