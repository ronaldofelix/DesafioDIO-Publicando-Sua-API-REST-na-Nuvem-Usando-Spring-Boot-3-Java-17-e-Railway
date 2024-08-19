package me.dio.school_management_api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.dio.school_management_api.domain.model.Professor;
import me.dio.school_management_api.domain.repository.ProfessorRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ProfessorService {

    @Autowired
    private ProfessorRepository professorRepository;

    public List<Professor> listarTodos() {
        return professorRepository.findAll();
    }

    public Optional<Professor> buscarPorId(Long id) {
        return professorRepository.findById(id);
    }

    public Professor cadastrar(Professor professor) {
        return professorRepository.save(professor);
    }

    public Professor atualizar(Long id, Professor professor) {
        Optional<Professor> professorExistente = professorRepository.findById(id);
        if (professorExistente.isPresent()) {
            professor.setId(id);
            return professorRepository.save(professor);
        }
        return null;
    }

    public void excluir(Long id) {
        professorRepository.deleteById(id);
    }
}