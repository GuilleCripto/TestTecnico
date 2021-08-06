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

public class Triangulo  implements Figura {
	
	private Float superfice;
	private Float base;
	private Float alto;
	private String tipoFigura;
	
	public Triangulo() {
	}
	
	public Triangulo(Float superfice, Float base, Float alto, String tipoFigura) {
		this.superfice = superfice;
		this.base = base;
		this.alto = alto;
		this.tipoFigura = tipoFigura;
	}

	@Override
	public Float getBase() {
           	return this.base;
	}

	@Override
	public Float getAlto() {
		return this.alto;
	}

	public void setBase(Float base) {
		this.base=base;
		
	}

	public void setAlto(Float alto) {
		this.alto = alto;	
	}

	@Override
	public Float getSuperfice() {
		
		return this.superfice;
	}

	@Override
	public String getTipoFigura() {
		return this.tipoFigura;
	}

	public void setSuperfice(Float superficie) {
		this.superfice = superficie;
		
	}

	public void setTipoFigura(String tipoFigura) {
		this.tipoFigura = tipoFigura;
		
	}

	@Override
	public Float getDiametro() {
		return null;
	}

	@Override
	public String toString() {
		return "Triangulo [superfice=" + superfice + ", base=" + base + ", alto=" + alto + ", tipoFigura=" + tipoFigura
				+ "]";
	}	
}
