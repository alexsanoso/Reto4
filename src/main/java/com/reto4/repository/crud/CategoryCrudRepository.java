package com.reto4.repository.crud;

// importaciones
import com.reto4.modelo.Category;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Alexander Sánchez Osorio
 */
public interface CategoryCrudRepository extends CrudRepository<Category, Integer> {
}
