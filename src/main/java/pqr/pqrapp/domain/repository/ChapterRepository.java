package pqr.pqrapp.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pqr.pqrapp.persistence.entity.Chapter;

/**
 * ChapterRepository
 */
public interface ChapterRepository extends JpaRepository<Chapter, Long>{

    
}