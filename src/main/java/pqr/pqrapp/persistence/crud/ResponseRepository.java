package pqr.pqrapp.persistence.crud;

import org.springframework.data.jpa.repository.JpaRepository;

import pqr.pqrapp.persistence.entity.Response;

/**
 * ResponseRepository
 */
public interface ResponseRepository extends JpaRepository<Response, Long> {

    
}