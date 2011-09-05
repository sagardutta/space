package com.space.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value="/")
public class IndexController {
    @RequestMapping(method= RequestMethod.GET)
    public ModelAndView index() {
        String message = "Space";
        return new ModelAndView("index","message",message);
    }
}
