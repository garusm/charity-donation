package pl.garusm.charitydonation.entity;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;


import java.util.Collection;

public class CurrentUser extends User {

    private final pl.garusm.charitydonation.entity.User user;

    public CurrentUser(String username, String password, Collection<? extends GrantedAuthority> authorities, pl.garusm.charitydonation.entity.User user) {
        super(username, password, authorities);
        this.user = user;
    }

    public pl.garusm.charitydonation.entity.User getUser() {
        return user;
    }
}
