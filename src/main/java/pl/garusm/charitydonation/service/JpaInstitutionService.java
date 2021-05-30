package pl.garusm.charitydonation.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;
import pl.garusm.charitydonation.entity.Institution;
import pl.garusm.charitydonation.repository.InstitutionRepository;

import java.util.List;
import java.util.Optional;

@Repository
@Primary
public class JpaInstitutionService implements InstitutionService{

    private final InstitutionRepository institutionRepository;

    public JpaInstitutionService(InstitutionRepository institutionRepository) {
        this.institutionRepository = institutionRepository;
    }

    @Override
    public List<Institution> getInstitutions() {
        return institutionRepository.findAll();
    }

    @Override
    public void addInstitution(Institution institution) {
        institutionRepository.save(institution);
    }

    @Override
    public Optional<Institution> getInstitution(Long id) {
        return institutionRepository.findById(id);
    }

    @Override
    public void deleteInstitution(Long id) {
        institutionRepository.deleteById(id);
    }
}
