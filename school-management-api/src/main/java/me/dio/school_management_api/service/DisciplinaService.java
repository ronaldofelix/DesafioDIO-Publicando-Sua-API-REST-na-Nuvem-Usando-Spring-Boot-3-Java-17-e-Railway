package me.dio.school_management_api.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.dio.school_management_api.domain.model.Disciplina;
import me.dio.school_management_api.domain.repository.DisciplinaRepository;

@Service
public class DisciplinaService {
    @Autowired
    private DisciplinaRepository disciplinaRepository;

    public List<Disciplina> listarTodas() {
        return disciplinaRepository.findAll();
    }

    public Optional<Disciplina> buscarPorId(Long id) {
        return disciplinaRepository.findById(id);
    }

    public Disciplina cadastrar(Disciplina disciplina) {
        return disciplinaRepository.save(disciplina);
    }

    public Disciplina atualizar(Long id, Disciplina disciplina) {
        Optional<Disciplina> disciplinaExistente = disciplinaRepository.findById(id);
        if (disciplinaExistente.isPresent()) {
            disciplina.setId(id);
            return disciplinaRepository.save(disciplina);
        }
        return null;
    }

    public void excluir(Long id) {
        disciplinaRepository.deleteById(id);
    }
}
