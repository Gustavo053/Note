package com.note.note.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class LoginController {

    @RequestMapping(value = "/login")
    public String loginPage(HttpServletRequest request) {

        if (request.getUserPrincipal() != null) {
            return "redirect:/dashboard";
        }

        return "login";
    }
}
