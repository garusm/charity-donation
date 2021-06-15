package pl.garusm.charitydonation.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;
import pl.garusm.charitydonation.repository.RoleRepository;

@Repository
@Primary
public class JpaRoleService implements RoleService {

    private final RoleRepository roleRepository;

    public JpaRoleService(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

}
