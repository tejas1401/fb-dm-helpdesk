package com.richpanel.fbhelpdesk.controller;

import com.richpanel.fbhelpdesk.dto.UserDTO;
import com.richpanel.fbhelpdesk.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
@Controller
@RequestMapping("/")
public class FBDMHelpdeskController {
    public FBDMHelpdeskController(){
        System.out.println("controller object is created");
    }
    @Autowired
    private Service service;
   @PostMapping("register")
    String registerUser(@ModelAttribute UserDTO dto, HttpSession session, BindingResult errors, Model model){
        service.validateRegisterUser(dto);
        return "login";
   }
   @PostMapping("login")
    String loginUser(@RequestParam String email,@RequestParam String password){
       UserDTO dto=service.validateLoginUser(email, password);
       if(dto!=null){
        return "connect-page";
       }
       else return "login";//wrong login credentials
   }
}
