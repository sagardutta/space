package com.space.configuration.init;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.ArrayList;
import java.util.List;
import com.space.security.services.UserDetailsService;


@Repository
@Transactional
public class Init {
    protected static Logger logger = LoggerFactory.getLogger(Init.class);
    @Inject
    @Named("securityUserDetailService")
    UserDetailsService userDetailsService;
    private void init() {
        List<String> roles = new ArrayList<String>();
        roles.add("ROLE_ADMIN");
        try {
            userDetailsService.createUser("admin","admin",roles);
        }
        catch(DuplicateKeyException dke) {
            logger.debug("Init Service : ", dke);
        }
    }
}
