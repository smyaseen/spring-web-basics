package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/greeting")
public class RestController {

    @RequestMapping(value= "", method = RequestMethod.GET)
    public String sayHello() {
        System.out.println("hi");
        return "<h1>Hello<br>World</h1>";
    }

    @RequestMapping("/login")
    public String login() {
        return "<form action=\"/greeting/user_greeting\" method=\"GET\">\n" +
                "  <label for=\"fname\">First name:</label><br>\n" +
                "  <input type=\"text\" id=\"fname\" name=\"fname\"><br>\n" +
                "  <label for=\"lname\">Last name:</label><br>\n" +
                "  <input type=\"text\" id=\"lname\" name=\"lname\"><br><br>\n" +
                "  <input type=\"submit\" value=\"Submit\">\n" +
                "</form>";
    }

    @RequestMapping(value = "/user_greeting", method = RequestMethod.GET)
    public String sayHelloAgain(@RequestParam String fname, @RequestParam String lname) {
        return "Hey! " + fname + " " + lname ;
    }

    @RequestMapping(value = "/order/{id}", method = RequestMethod.GET)
    public String sayHelloAgain(@PathVariable String id) {
        return "Hey! " + id ;
    }



}
