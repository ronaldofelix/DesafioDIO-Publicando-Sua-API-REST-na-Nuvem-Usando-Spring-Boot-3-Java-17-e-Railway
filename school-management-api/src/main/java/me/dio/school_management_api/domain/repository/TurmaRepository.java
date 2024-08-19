package me.dio.school_management_api.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import me.dio.school_management_api.domain.model.Turma;

public interface TurmaRepository extends JpaRepository<Turma, Long> {

}
