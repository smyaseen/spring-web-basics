package com.example.demo.controller;

import com.example.demo.Model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String homeModel(Model model) {
        model.addAttribute("formData", new User());
        return "index";
 }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public String processFormData(@ModelAttribute("user") User user, RedirectAttributes attr) {
        attr.addFlashAttribute("user",user);
        return "redirect:/display";
    }

    @RequestMapping(value = "/display")
    public String displayResult(@ModelAttribute("user") User user) {
        return "result";
    }

}
