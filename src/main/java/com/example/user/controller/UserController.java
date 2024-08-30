package com.example.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.user.model.User;

import jakarta.validation.Valid;



@Controller
public class UserController {

    //Cette fonction affiche la page register
    @GetMapping("/registration")
    public String getRegPage(@ModelAttribute("user") User user) {
        //User est le model
        //user de ModelAttribute va permet d'être recupérer dans la page html
        return "register";
    }

    //Cette fonction va permet de valider notre formulaire
    @PostMapping("/registration")
    public String saveUser(@Valid User user, Errors errors) {
        //@Valid pour valider notre formulaire
        // Errors pour afficher nos erreur
        if (errors.hasErrors()) {
            return "register";
        }
        return "successPage";
    }
    
}
