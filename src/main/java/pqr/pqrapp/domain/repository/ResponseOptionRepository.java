package pqr.pqrapp.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pqr.pqrapp.persistence.entity.ResponseOption;

/**
 * ResponseOptionRepository
 */
public interface ResponseOptionRepository extends JpaRepository<ResponseOption, Long> {

    
}