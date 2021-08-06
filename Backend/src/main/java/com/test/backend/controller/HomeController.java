/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.backend.controller;

/**
 *
 * @author Jose Guillermo Yanez
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 *
 * @author Jose Guillermo Yanez
 */

@RestController
@RequestMapping("/apiRest")
@CrossOrigin("*")
public class HomeController {
    
    @GetMapping("/home")
    public String home(){
          return "Test de Inicio Aplicación Test Tecnico. ";
    }
    
 
}
