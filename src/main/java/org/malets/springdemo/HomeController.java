package org.malets.springdemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/funny")
public class HomeController {
/*
    @RequestMapping("/home")
    public String showMyPage(){
        return "main-menu";
    }

    @RequestMapping("/showForm")
    public String showForm(){
        return "helloworld-form";
    }

    @RequestMapping("/processForm")
    public String processForm(){
        return "helloworld";
    }
    @RequestMapping("/processForm")
    public String processForm(@RequestParam("studentName") String name, Model model){
        name = name.toUpperCase();
        model.addAttribute("message", "Yo! " + name);
        return "helloworld";
    }
*/

}
