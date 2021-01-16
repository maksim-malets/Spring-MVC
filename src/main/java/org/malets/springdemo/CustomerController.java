package org.malets.springdemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import javax.validation.Valid;


@Controller
@EnableWebMvc
public class CustomerController {

    @RequestMapping("/showForm")
    public String showForm(Model model){
        model.addAttribute("customer", new Customer());
        return "customer-form";
    }


    @RequestMapping("/processForm")
    public String processForm(@Valid @ModelAttribute Customer customer, BindingResult bindingResult){
        System.out.println(customer.getLastName().getBytes().length);
        System.out.println(customer.getLastName().length());
        if (bindingResult.hasErrors()){
            return "customer-form";
        }
        else {
            return "customer-confirmation";
        }
    }
}
