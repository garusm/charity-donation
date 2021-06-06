package pl.garusm.charitydonation.service;

import pl.garusm.charitydonation.entity.Role;

public interface RoleSevice {
    Role findByName(String name);
}
