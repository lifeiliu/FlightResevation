package info.lifeify.reservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import info.lifeify.reservation.entities.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {

}
