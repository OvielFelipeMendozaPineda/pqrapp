package pqr.pqrapp.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pqr.pqrapp.persistence.entity.Question;

/**
 * QuestionRepository
 */
public interface QuestionRepository extends JpaRepository<Question, Long> {

    
}