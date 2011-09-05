package com.space.security.domain;

import com.space.domain.User;
import org.bson.types.ObjectId;
import org.springframework.security.core.GrantedAuthority;

import java.util.Collection;


public class UserDetails extends org.springframework.security.core.userdetails.User {
    private ObjectId userId;
    private String salt;
    public UserDetails(ObjectId userId, String salt,String username, String password, boolean enabled, boolean accountNonExpired,
            boolean credentialsNonExpired, boolean accountNonLocked, Collection<? extends GrantedAuthority> authorities) {
        super(username, password, true, true, true, true, authorities);
        this.userId = userId;
        this.salt = salt;
    }

    public ObjectId getUserId() {
        return userId;
    }

    public void setUserId(ObjectId userId) {
        this.userId = userId;
    }

    public String getSalt(){
        return salt;
    }
}
