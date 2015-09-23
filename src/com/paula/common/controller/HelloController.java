package com.paula.common.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ui.ModelMap; 

@Controller 
public class HelloController{ 
   @RequestMapping(value = "/hello1", method = RequestMethod.GET)
   public String printHello1(ModelMap model) {
      model.addAttribute("message", "Hello Spring MVC Framework 1!");

      return "hello";
   }

   @RequestMapping(value = "/hello2", method = RequestMethod.GET)
   public String printHello2(ModelMap model) {
      model.addAttribute("message", "Hello Spring MVC Framework 2!");

      return "hello";
   }
}
