package com.example.demo.controller;

import com.example.demo.Model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String homeModel(Model model) {
        model.addAttribute("formData", new User());
        return "index";
 }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public String processFormData(@ModelAttribute("user") User user) {
        return "result";
    }

}
