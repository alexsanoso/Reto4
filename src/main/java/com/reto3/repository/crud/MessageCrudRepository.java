package com.reto3.repository.crud;

// importaciones
import com.reto3.modelo.Message;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Alexander Sánchez Osorio
 */
public interface MessageCrudRepository extends CrudRepository<Message,Integer> {

}