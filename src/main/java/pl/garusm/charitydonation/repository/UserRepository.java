package pl.garusm.charitydonation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.garusm.charitydonation.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
