package com.space.web.controller;

import com.space.security.domain.UserDetails;
import org.bson.types.ObjectId;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value="/home")
public class HomeController {
    @RequestMapping(method= RequestMethod.GET)
    public ModelAndView home() {
        UserDetails userDetails = ((UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal());
        final ObjectId currentUserId = userDetails.getUserId();
        String roles = userDetails.getAuthorities().toString();
        StringBuffer message = new StringBuffer();
        message.append("User Id: " + currentUserId);
        message.append("<br/>");
        message.append("Roles: " + roles); 
        return new ModelAndView("home","message",message);
    }
}
