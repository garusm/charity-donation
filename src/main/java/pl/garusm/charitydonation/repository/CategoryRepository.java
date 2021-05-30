package pl.garusm.charitydonation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.garusm.charitydonation.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
