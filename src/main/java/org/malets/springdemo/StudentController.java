package org.malets.springdemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;


@Controller
public class StudentController {
/*
    @RequestMapping("/showForm")
    public String showForm(Model model){
        model.addAttribute("student", new Student());
        return "student-form";
    }

    @RequestMapping("/processForm")
    public String processForm(@Valid @ModelAttribute("student") Student student, BindingResult bindingResult){
        System.out.println(bindingResult.hasErrors());
        if (bindingResult.hasErrors()){
            return "student-form";
        }
        System.out.println(student.getLastName());
        return "student-confirmation";
    }*/
}
