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

public class TestBasico {public static void main(String[] args) {
    FiguraFactory factory = new FiguraFactory();
    Figura cuadrado = factory.CreateFigura(1F, 2F, 5F, 9F, "cuadrado");
	Figura triangulo = factory.CreateFigura(1F, 2F, 4F, 3F, "triangulo");
	Figura circulo = factory.CreateFigura(1F, 2F, 3F, 9F, "circulo");
	System.out.println(cuadrado.toString());
	System.out.println(triangulo.toString());
	System.out.println(circulo.toString());
		

}

}
