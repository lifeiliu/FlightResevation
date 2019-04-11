package info.lifeify.reservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import info.lifeify.reservation.entities.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger, Long> {

}
