package pqr.pqrapp.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pqr.pqrapp.persistence.entity.DetailResponse;

/**
 * DetailResponseRepository
 */
public interface DetailResponseRepository extends JpaRepository<DetailResponse, Long> {

    
}