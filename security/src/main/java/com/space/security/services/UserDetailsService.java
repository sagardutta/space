package com.space.security.services;

import com.space.domain.User;
import com.space.repository.mongo.UserRepository;
import com.space.security.domain.UserDetails;
import org.bson.types.ObjectId;
import org.springframework.security.authentication.encoding.PasswordEncoder;
import org.springframework.security.core.authority.GrantedAuthorityImpl;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;


@Service("securityUserDetailService")
public class UserDetailsService implements org.springframework.security.core.userdetails.UserDetailsService{

    @Inject
    PasswordEncoder passwordEncoder;
    @Inject
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username)
            throws UsernameNotFoundException {
        User user = userRepository.findByUsername(username);
        if(user != null) {
            Collection<GrantedAuthorityImpl> authorities = new HashSet<GrantedAuthorityImpl>();
            List<String> roles = user.getRoles();
            for(String roleName: roles) {
                authorities.add(new GrantedAuthorityImpl(roleName));
            }
            ObjectId userId = user.getId();
            UserDetails userDetails = new UserDetails(
                    userId,user.getSalt(),user.getUsername(),user.getPassword(),user.getActive(),true,true,true,authorities);
            return userDetails;
        }
        else {
            throw new UsernameNotFoundException(username);
        }
    }

     public User createUser(String username, String password, List<String> roles) {
        User user = new User();
        user.setUsername(username);
        String ecodedPassword = passwordEncoder.encodePassword(password,user.getSalt());
        user.setPassword(ecodedPassword);
        user.setActive(true);
        user.setRoles(roles);
        return userRepository.save(user);
    }
}
