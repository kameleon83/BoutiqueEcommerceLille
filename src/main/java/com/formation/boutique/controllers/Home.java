package com.formation.boutique.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Home {

    @GetMapping("/")
    public ModelAndView home(){
        return new ModelAndView("/pages/home")
                .addObject("fragments", "/fragments/index")
                .addObject("title", "Home");
    }

}
