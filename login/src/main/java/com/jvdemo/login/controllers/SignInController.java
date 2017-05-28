package com.jvdemo.login.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Controller
public class SignInController {

    @RequestMapping(value = "/sign_in", method = GET)
    public String signIn() {
        return "signIn.html";
    }
}