package pqr.pqrapp.persistence.crud;

import org.springframework.data.jpa.repository.JpaRepository;

import pqr.pqrapp.persistence.entity.ResponseCatalog;

/**
 * ResponseCatalogRepository
 */
public interface ResponseCatalogRepository extends JpaRepository<ResponseCatalog, Long>{

    
}