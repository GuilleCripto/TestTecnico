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
public class Cuadrado  implements Figura {
	private Float superfice;
	private Float base;
	private String tipoFigura;


	public Cuadrado() {
	}

	public Cuadrado(Float superfice, Float base, String tipoFigura) {
		this.superfice = superfice;
		this.base = base;
		this.tipoFigura = tipoFigura;
	}

	@Override
	public Float getBase() {
		return this.base;
	}

	@Override
	public Float getAlto() {
		return null;
	}

	public void setBase(Float base) {
		this.base=base;
		
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
		return "Cuadrado [superfice=" + superfice + ", base=" + base + ", tipoFigura=" + tipoFigura + "]";
	}	
	
	

}

