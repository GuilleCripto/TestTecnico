/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.backend.repository;

import com.test.backend.dto.FiguraDto;
import com.test.backend.entity.FiguraGeometrica;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Jose Guillermo Yanez
 */
@Repository
public interface  FiguraGeometricaRepository extends CrudRepository<FiguraGeometrica, Long>{
	public abstract List<FiguraGeometrica> findByTipoFigura(String tipoFigura);
	public abstract List<FiguraGeometrica> findAll();
        @Query(value = "SELECT max(id) id , max(altura) altura ,max(base) base, max(diametro) diametro, count(*) superficie, tipo_figura  FROM figura_geometrica group by tipo_figura order by superficie desc", nativeQuery = true)
	List<FiguraGeometrica> getFigurasResumen();
        
}


