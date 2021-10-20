package com.reto4.repository.crud;

// importaciones
import com.reto4.modelo.Message;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Alexander Sánchez Osorio
 */
public interface MessageCrudRepository extends CrudRepository<Message,Integer> {

}