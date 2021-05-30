package pl.garusm.charitydonation.service;

import pl.garusm.charitydonation.entity.Institution;

import java.util.List;
import java.util.Optional;

public interface InstitutionService {

    List<Institution> getInstitutions();
    void addInstitution(Institution institution);
    Optional<Institution> getInstitution(Long id);
    void deleteInstitution(Long id);
}
