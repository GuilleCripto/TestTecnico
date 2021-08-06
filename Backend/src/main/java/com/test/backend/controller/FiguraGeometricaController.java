/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.backend.controller;

import com.test.backend.dto.FiguraDto;
import com.test.backend.entity.FiguraGeometrica;
import com.test.backend.util.Message;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.test.backend.service.FiguraGeometricaService;
import java.util.Optional;
import org.springframework.dao.DataAccessException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


/**
 *
 * @author Jose Guillermo Yanez
 */
@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class FiguraGeometricaController {
    

    
    @Autowired
    private FiguraGeometricaService figuraGeometricaService;
	
    @GetMapping("/getAll")
    public ResponseEntity<Message> getAll(){
	List<FiguraGeometrica> datos = null;
	try {
		datos = figuraGeometricaService.getFiguraGeometrica();
        } catch (DataAccessException e) {
			return new ResponseEntity<Message>(new Message(true,"Error al consultar la base de datos: "+e.getMessage()+" --- Causado por: "+e.getMostSpecificCause().getMessage(),null), HttpStatus.INTERNAL_SERVER_ERROR);
	} catch (Exception e) {
			return new ResponseEntity<Message>(new Message(true,"Error Desconocido: "+e.getMessage(),null), HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	if(datos == null || datos.size() == 0) {
			return new ResponseEntity<Message>(new Message(true,"listados vacio",null), HttpStatus.OK);
	}
	return new ResponseEntity<Message>(new Message(false,"",datos), HttpStatus.OK);
    }
    @GetMapping("/getFigurasResumen")
    public ResponseEntity<Message> getFigurasResumen(){
	List<FiguraGeometrica> datos = null;
	try {
		datos = figuraGeometricaService.getFigurasResumen();
        } catch (DataAccessException e) {
			return new ResponseEntity<Message>(new Message(true,"Error al consultar la base de datos: "+e.getMessage()+" --- Causado por: "+e.getMostSpecificCause().getMessage(),null), HttpStatus.INTERNAL_SERVER_ERROR);
	} catch (Exception e) {
			return new ResponseEntity<Message>(new Message(true,"Error Desconocido: "+e.getMessage(),null), HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	if(datos == null || datos.size() == 0) {
			return new ResponseEntity<Message>(new Message(true,"listados vacio",null), HttpStatus.OK);
	}
      //   System.out.println("Inicio Post === "+datos.get(0).getTotal());
	return new ResponseEntity<Message>(new Message(false,"",datos), HttpStatus.OK);
    }
    
    
    @PostMapping("/post")
    public ResponseEntity<Message> insert(@RequestBody FiguraGeometrica dato){
	Optional<FiguraGeometrica> datoExist = null;
        
       
        
        String message = evaluateFigura(dato);
        if (!message.equals("")){
            return new ResponseEntity<Message>(new Message(true,message,dato), HttpStatus.BAD_REQUEST);
        }
            
	try {
		datoExist = figuraGeometricaService.findById(dato.getId());
	} catch (DataAccessException e) {
			return new ResponseEntity<Message>(new Message(true,"Error al insertar la base de datos: "+e.getMessage()+" --- Causado por: "+e.getMostSpecificCause().getMessage(),null), HttpStatus.INTERNAL_SERVER_ERROR);
	} catch (Exception e) {
			return new ResponseEntity<Message>(new Message(true,"Error Desconocido: "+e.getMessage(),null), HttpStatus.INTERNAL_SERVER_ERROR);
	}
	if(datoExist.isPresent()) {
			return new ResponseEntity<Message>(new Message(true,"Registro ya existe",null), HttpStatus.CONFLICT);
	}
	FiguraGeometrica datoInsert = null;
         
	try {
			datoInsert = figuraGeometricaService.createFiguraGeometrica(dato);
	} catch (DataAccessException e) {
			return new ResponseEntity<Message>(new Message(true,"Error al insertar la base de datos: "+e.getMessage()+" --- Causado por: "+e.getMostSpecificCause().getMessage(),null), HttpStatus.INTERNAL_SERVER_ERROR);
	} catch (Exception e) {
			return new ResponseEntity<Message>(new Message(true,"Error Desconocido: "+e.getMessage(),null), HttpStatus.INTERNAL_SERVER_ERROR);
	}
			
 	return new ResponseEntity<Message>(new Message(false,"Creado satisfactorio",datoInsert), HttpStatus.CREATED);
    }
    
    private String evaluateFigura(FiguraGeometrica dato) {
        String message = "";
        boolean flag =  false;
        if (dato.getTipoFigura().equalsIgnoreCase("Cuadrado")  && dato.getBase()!= null) {
			//dato.setAltura(null);
                        dato.setSuperficie(dato.getBase() * dato.getAltura());
			dato.setDiametro(Float.valueOf("0"));
			flag =true;
	}
		
	if (dato.getTipoFigura().equalsIgnoreCase("Triangulo") && dato.getAltura() != null && dato.getBase() != null) {
			dato.setDiametro(null);
			flag = true;
	} 
		
	if (dato.getTipoFigura().equalsIgnoreCase("Circulo") && dato.getDiametro() != null) {
			dato.setAltura(null);
			dato.setBase(null);
			flag = true;
	} 
        if (!flag) {
            message = "Error en la figura";
        }
        return message;
    }
    

    
}