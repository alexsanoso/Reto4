package com.reto4.service;

import com.reto4.modelo.Category;
import com.reto4.modelo.Reservation;
import com.reto4.repository.ReservationRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Alexander
 */
@Service
public class ReservationApi {
    /**
     * atributo para autowired reservation
     */
    @Autowired
    private ReservationRepository reservationRepository;

    /**
     * método para obtener todos los reservation
     * @return
     */
    public List<Reservation> getAll(){
        return  reservationRepository.getAll();
    }

    /**
     * método para obtener reservation por id
     * @param id
     * @return
     */
    public Optional<Reservation> getReservation(int id){
        return reservationRepository.getReservation(id);
    }

    /**
     * método save para reservation
     * @param reservation
     * @return
     */
    public Reservation save(Reservation reservation){
        if (reservation.getIdReservation() == null){
            return reservationRepository.save(reservation);
        }else{
            Optional<Reservation> evt = reservationRepository.getReservation(reservation.getIdReservation());
            if (evt.isEmpty()){
                return reservationRepository.save(reservation);
            }else{
                return reservation;
            }
        }
    }

    /**
     * método para actualizar una reservación
     * @param reservation
     * @return
     */
    public Reservation update(Reservation reservation){
        if(reservation.getIdReservation()!=null){
            Optional<Reservation> actualizar= reservationRepository.getReservation(reservation.getIdReservation());
            if(!actualizar.isEmpty()){

                if(reservation.getStartDate()!=null){
                    actualizar.get().setStartDate(reservation.getStartDate());
                }
                if(reservation.getDevolutionDate()!=null){
                    actualizar.get().setDevolutionDate(reservation.getDevolutionDate());
                }
                if(reservation.getStatus()!=null){
                    actualizar.get().setStatus(reservation.getStatus());
                }
                reservationRepository.save(actualizar.get());
                return actualizar.get();
            }else{
                return reservation;
            }
        }else{
            return reservation;
        }
    }

    /**
     * método para borrar una reservación
     * @param reservationId
     * @return
     */
    public boolean deleteReservation(int reservationId) {
        Boolean aBoolean = getReservation(reservationId).map(reservation -> {
            reservationRepository.delete(reservation);
            return true;
        }).orElse(false);
        return aBoolean;
    }
}

