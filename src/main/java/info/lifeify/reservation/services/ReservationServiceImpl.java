package info.lifeify.reservation.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import info.lifeify.reservation.dto.ReservationRequest;
import info.lifeify.reservation.entities.Flight;
import info.lifeify.reservation.entities.Passenger;
import info.lifeify.reservation.entities.Reservation;
import info.lifeify.reservation.repos.FlightRepository;
import info.lifeify.reservation.repos.PassengerRepository;
import info.lifeify.reservation.repos.ReservationRepository;

@Service
public class ReservationServiceImpl implements ReservationService {

	@Autowired
	FlightRepository flightRepo;
	@Autowired
	PassengerRepository passengerRepo;
	@Autowired
	ReservationRepository reservationRepo;
	@Override
	public Reservation bookFlight(ReservationRequest request) {
		
		//make Payment
		
		Long flightid = request.getFlightId();
		Flight flight = flightRepo.getOne(flightid);
		
		Passenger passenger = new Passenger();
		passenger.setFirstName(request.getPassengerFirstName());
		passenger.setLastName(request.getPassengerLastName());
		passenger.setEmail(request.getPassengerEmail());
		passenger.setPhone(request.getPassengerPhone());
		Passenger savedPassenger = passengerRepo.save(passenger);
		
		Reservation reservation = new Reservation();
		reservation.setFlight(flight);
		reservation.setPassenger(savedPassenger);
		reservation.setCheckedIn(false);
		Reservation savedReservation = reservationRepo.save(reservation);
		
		
		return savedReservation;
	}

}
