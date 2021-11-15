package com.UserLoginDemo.Controller;

import com.UserLoginDemo.Service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;

import java.util.Locale;

@Controller
public class MainController {
    private UserService userService;

    public MainController(UserService userService) {
        super();
        this.userService = userService;
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/loginCoin")
    public String getData(/*@RequestHeader(name = "Accept-Language", required = false) Locale locale*/) {
        return userService.ConsumeAPI();
    }
}