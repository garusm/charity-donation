package pl.garusm.charitydonation.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;
import pl.garusm.charitydonation.entity.Donation;
import pl.garusm.charitydonation.repository.DonationRepository;

import java.util.List;
import java.util.Optional;

@Repository
@Primary
public class JpaDonationService implements DonationService{

    private final DonationRepository donationRepository;

    public JpaDonationService(DonationRepository donationRepository) {
        this.donationRepository = donationRepository;
    }

    @Override
    public List<Donation> getDonations() {
        return donationRepository.findAll();
    }

    @Override
    public void addDonation(Donation donation) {
        donationRepository.save(donation);
    }

    @Override
    public Optional<Donation> getDonation(Long id) {
        return donationRepository.findById(id);
    }

    @Override
    public void deleteDonation(Long id) {
        donationRepository.deleteById(id);
    }

    @Override
    public Integer sumOfDonations() {
        return donationRepository.sumOfDonations();
    }

    @Override
    public Integer sumOfQuantity() {
        return donationRepository.sumOfQuantity();
    }
}
