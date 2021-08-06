/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.backend.modelado;

/**
 *
 * @author Jose Guillermo Yanez
 */
public class FiguraFactory {
	
	public Figura CreateFigura (Float superficie, Float base, Float alto, Float diametro, String tipoFigura) {
		if (tipoFigura.equalsIgnoreCase("cuadrado")) {
			return new Cuadrado(superficie, base, tipoFigura);
		} else if (tipoFigura.equalsIgnoreCase("triangulo")) {
			return new Triangulo(superficie, base, alto, tipoFigura);
		} else if (tipoFigura.equalsIgnoreCase("circulo")) {
			return new Circulo(superficie, diametro, tipoFigura);
		}
		return null;
	}
}

