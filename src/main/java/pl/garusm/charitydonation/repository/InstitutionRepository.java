package pl.garusm.charitydonation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.garusm.charitydonation.entity.Institution;

public interface InstitutionRepository extends JpaRepository<Institution, Long> {
}
