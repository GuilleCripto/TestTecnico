/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.backend;

import com.test.backend.service.FiguraGeometricaService;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 *
 * @author Jose Guillermo Yanez
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class FigurasServiceImplIntegrationTes {
    
     @Autowired
    private FiguraGeometricaService figuraGeometricaService;
    
}
