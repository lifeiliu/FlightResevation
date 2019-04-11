package info.lifeify.reservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import info.lifeify.reservation.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	public User findByEmail(String email);
}
