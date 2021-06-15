package pl.garusm.charitydonation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.garusm.charitydonation.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
