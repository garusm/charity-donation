package pl.garusm.charitydonation.service;

import pl.garusm.charitydonation.entity.User;

public interface UserService {

    User findByUsername(String username);
    void saveUser(User user);
}
