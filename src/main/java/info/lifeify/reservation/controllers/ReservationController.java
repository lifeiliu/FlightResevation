package info.lifeify.reservation.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import info.lifeify.reservation.dto.ReservationRequest;
import info.lifeify.reservation.entities.Flight;
import info.lifeify.reservation.entities.Reservation;
import info.lifeify.reservation.repos.FlightRepository;
import info.lifeify.reservation.services.ReservationService;

@Controller
public class ReservationController {
	
	@Autowired
	FlightRepository FlightRepository;
	@Autowired
	ReservationService reservationService;
	
	@RequestMapping("/showCompleteReservation")
	public String showCompleteReservation(@RequestParam("flightId") Long flightId,
			ModelMap modelMap) {
		Flight flight = FlightRepository.findById(flightId).get();
		modelMap.addAttribute("flight", flight);
		return "completeReservation";
	}
	
	@RequestMapping(value = "/completeReservation", method = RequestMethod.POST)
	public String completeReservation(ReservationRequest request, ModelMap modelMap) {
		Reservation reservation = reservationService.bookFlight(request);
		modelMap.addAttribute("msg", "Reservation create sucessfully and the id is "+ reservation.getId());
		return "reservationConfirmation";
	}
}
