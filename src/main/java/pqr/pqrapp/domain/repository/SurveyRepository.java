package pqr.pqrapp.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pqr.pqrapp.persistence.entity.Survey;

/**
 * SurveyRepository
 */
public interface SurveyRepository extends JpaRepository<Survey, Long> {

    
}