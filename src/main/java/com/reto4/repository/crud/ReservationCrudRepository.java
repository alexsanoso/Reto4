package com.reto4.repository.crud;

// importaciones
import com.reto4.modelo.Reservation;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Alexander Sánchez Osorio
 */
public interface ReservationCrudRepository extends CrudRepository <Reservation, Integer> {
}