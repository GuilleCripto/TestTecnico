/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.backend.service.impl;

import com.test.backend.dto.FiguraDto;
import com.test.backend.entity.FiguraGeometrica;
import com.test.backend.repository.FiguraGeometricaRepository;
import com.test.backend.service.FiguraGeometricaService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Jose Guillermo Yanez
 */
@Service
public class FiguraGeometricaServiceImpl implements FiguraGeometricaService {

    @Autowired
    private FiguraGeometricaRepository figuraGeometricaRepository;

    /**
     * GET all figuraGeometricas from DB
     * @return all figuraGeometricas from Database
     */
    @Override
    public List<FiguraGeometrica> getFiguraGeometrica() {
           System.out.println("este es el servicio");
           List<FiguraGeometrica> status = figuraGeometricaRepository.findAll();
           System.out.println("este es la cantidad..." + status.size());
           return figuraGeometricaRepository.findAll();
    }

    /**
     * finds a figuraGeometrica by its ID
     * @param id    Database ID of figuraGeometrica
     * @return          figuraGeometrica
     */
    @Override
    public Optional<FiguraGeometrica> findById(Long id) {
         return figuraGeometricaRepository.findById(id);
    

    }

    @Override
    public FiguraGeometrica createFiguraGeometrica(FiguraGeometrica figuraGeometrica) {
          return figuraGeometricaRepository.save(figuraGeometrica);
    }

    @Override
    public FiguraGeometrica updateFiguraGeometrica(FiguraGeometrica figuraGeometrica) {
         return figuraGeometricaRepository.save(figuraGeometrica);
    }

    @Override
    public void deleteFiguraGeometrica(Long id) {
        figuraGeometricaRepository.deleteById(id);
    }

    @Override
    public List<FiguraGeometrica> getFigurasResumen() {
          return figuraGeometricaRepository.getFigurasResumen();
       
    }
}

