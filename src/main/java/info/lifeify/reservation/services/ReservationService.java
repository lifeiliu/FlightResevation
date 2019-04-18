package info.lifeify.reservation.services;

import info.lifeify.reservation.dto.ReservationRequest;
import info.lifeify.reservation.entities.Reservation;

public interface ReservationService {
	public Reservation bookFlight(ReservationRequest request);
}
