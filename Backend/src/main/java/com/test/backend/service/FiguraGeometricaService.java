/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.backend.service;

import com.test.backend.dto.FiguraDto;
import com.test.backend.entity.FiguraGeometrica;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;

/**
 *
 * @author Jose Guillermo Yanez
 */
@Service
public interface FiguraGeometricaService {  /**
     * GET all figuraGeometricas from DB
     * @return all figuraGeometricas from Database
     */
     List<FiguraGeometrica> getFiguraGeometrica();
     
      /**   * GET all figuraGeometricas Agrupadas from DB
     * @return all figuraGeometricas from Database
     */
     List<FiguraGeometrica> getFigurasResumen();

    /**
     * finds a figuraGeometrica by its ID
     * @param Id    Database ID of figuraGeometrica
     * @return          figuraGeometrica
     */
    Optional<FiguraGeometrica> findById(Long Id);

    /**
     * creates new FiguraGeometrica and saves it in Database
     * @param figuraGeometrica   field values
     * @return              new FiguraGeometrica
     */
    FiguraGeometrica createFiguraGeometrica(FiguraGeometrica figuraGeometrica);

    /**
     * updates FiguraGeometrica from Database with field values in figuraGeometrica
     * @param figuraGeometrica   field values
     * @return              updated FiguraGeometrica
     */
    FiguraGeometrica updateFiguraGeometrica(FiguraGeometrica figuraGeometrica);

    /**
     * deletes FiguraGeometrica from Database
     * @param id    Database ID of figuraGeometrica
     */
    void deleteFiguraGeometrica(Long id);


}
