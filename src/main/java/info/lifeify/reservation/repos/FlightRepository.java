package info.lifeify.reservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import info.lifeify.reservation.entities.Flight;

public interface FlightRepository extends JpaRepository<Flight, Long> {

}
