package me.dio.school_management_api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.dio.school_management_api.domain.model.Turma;
import me.dio.school_management_api.domain.repository.TurmaRepository;

import java.util.List;
import java.util.Optional;

@Service
public class TurmaService {

    @Autowired
    private TurmaRepository turmaRepository;

    public List<Turma> listarTodas() {
        return turmaRepository.findAll();
    }

    public Optional<Turma> buscarPorId(Long id) {
        return turmaRepository.findById(id);
    }

    public Turma cadastrar(Turma turma) {
        return turmaRepository.save(turma);
    }

    public Turma atualizar(Long id, Turma turma) {
        Optional<Turma> turmaExistente = turmaRepository.findById(id);
        if (turmaExistente.isPresent()) {
            turma.setId(id);
            return turmaRepository.save(turma);
        }
        return null;
    }

    public void excluir(Long id) {
        turmaRepository.deleteById(id);
    }
}