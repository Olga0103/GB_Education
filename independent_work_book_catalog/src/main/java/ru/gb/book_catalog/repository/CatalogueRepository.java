package ru.gb.book_catalog.repository;



import org.springframework.stereotype.Repository;
import ru.gb.book_catalog.model.Catalogue;

/**
 * The interface Catalogue repository.
 *
 * @author Oluwatosin Akinyele
 */
@Repository
public interface CatalogueRepository extends JpaRepository<Catalogue, Long> {}