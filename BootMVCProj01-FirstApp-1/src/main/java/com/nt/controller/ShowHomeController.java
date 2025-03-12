package com.nt.controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ShowHomeController {

    @RequestMapping("/Home")
    public String showHomePage() {
        return "welcome";  // Make sure the string matches the JSP filename without the extension
    }
}
