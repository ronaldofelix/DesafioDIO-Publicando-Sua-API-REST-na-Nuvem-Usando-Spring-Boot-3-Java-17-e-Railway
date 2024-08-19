package me.dio.school_management_api.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import me.dio.school_management_api.domain.model.Professor;

@Repository
public interface ProfessorRepository extends JpaRepository<Professor, Long> {

}
