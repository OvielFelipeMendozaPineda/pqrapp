package pqr.pqrapp.persistence.crud;

import org.springframework.data.jpa.repository.JpaRepository;

import pqr.pqrapp.persistence.entity.Catalog;

/**
 * CatalogRepository
 */
public interface CatalogRepository extends JpaRepository<Catalog, Long> {

    
}