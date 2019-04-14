package info.lifeify.reservation.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import info.lifeify.reservation.entities.User;
import info.lifeify.reservation.repos.UserRepository;

@Controller
public class UserController {
	@Autowired
	private UserRepository userRepo;
	
	@RequestMapping("/showRegister")
	public String showRegister() {
		return "userRegister";
	}
	@RequestMapping(value="/registerUser", method = RequestMethod.POST)
	public String registerUser(@ModelAttribute("user")User user) {
		userRepo.save(user);
		return "login";
	} 	
	
	@RequestMapping("/showLogin")
	public String showLogin() {
		return "login";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(@RequestParam("email") String email, @RequestParam("password") String password,ModelMap map) {
		User user = userRepo.findByEmail(email);
		if (user.getPassword().equals(password)) {
			return "findFlights";
		}else {
			map.addAttribute("msg", "Invalid email or password, please try again");
			return "login";
		}
		
	}
}
