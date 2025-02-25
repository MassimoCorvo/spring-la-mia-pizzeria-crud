package com.springlamiapizzeria.spring_la_mia_pizzeria_crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;

import com.springlamiapizzeria.spring_la_mia_pizzeria_crud.model.Pizza;
import com.springlamiapizzeria.spring_la_mia_pizzeria_crud.repository.PizzaRepository;

@Controller
@RequestMapping("/")
public class HomeController {

    @Autowired
    private PizzaRepository repository;

    @GetMapping
    public String index(Model model){
        List<Pizza> pizze = repository.findAll();
        model.addAttribute("pizze", pizze);
        return "index";
    }
}