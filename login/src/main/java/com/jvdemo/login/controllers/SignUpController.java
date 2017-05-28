package com.jvdemo.login.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SignUpController {

    @RequestMapping(value = "/sign_up")
    public String signUp() {
        return "signUp.html";
    }
}