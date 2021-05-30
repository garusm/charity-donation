package pl.garusm.charitydonation.service;

import pl.garusm.charitydonation.entity.Donation;

import java.util.List;
import java.util.Optional;

public interface DonationService {

    List<Donation> getDonations();
    void addDonation(Donation donation);
    Optional<Donation> getDonation(Long id);
    void deleteDonation(Long id);
    Integer sumOfDonations();
    Integer sumOfQuantity();

}
