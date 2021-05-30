package pl.garusm.charitydonation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pl.garusm.charitydonation.entity.Donation;

public interface DonationRepository extends JpaRepository<Donation, Long> {

    @Query(value = "SELECT COUNT(*) FROM donations", nativeQuery = true)
    Integer sumOfDonations();

    @Query(value = "select sum(quantity) from donations", nativeQuery = true)
    Integer sumOfQuantity();
}
