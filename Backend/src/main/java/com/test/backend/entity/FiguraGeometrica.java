/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.backend.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

/**
 *
 * @author Jose Guillermo Yanez
 */
@Entity
@Table(name = "FiguraGeometrica",  schema = "public")
@EntityListeners(AuditingEntityListener.class)
public class FiguraGeometrica {
    @Id
    @SequenceGenerator(name = "FiguraGeometrica_id_seq", sequenceName = "FiguraGeometrica_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "FiguraGeometrica_id_seq")
    private Long id;
	
	@Column(nullable = true)
	private Float superficie;
	
	@Column(nullable = true)
	private Float base;
	
	@Column(nullable = true)
	private Float altura;
	
	@Column(nullable = true)
	private Float diametro; 
		
	@Column(name = "tipo_figura", nullable = false)
	private String tipoFigura;
	
	

	public FiguraGeometrica() {
	}

	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Float getSuperficie() {
		return superficie;
	}

	public void setSuperficie(Float superficie) {
		this.superficie = superficie;
	}

	public Float getBase() {
		return base;
	}

	public void setBase(Float base) {
		this.base = base;
	}

	public Float getAltura() {
		return altura;
	}

	public void setAltura(Float altura) {
		this.altura = altura;
	}

	public Float getDiametro() {
		return diametro;
	}
	

	public void setDiametro(Float diametro) {
		this.diametro = diametro;
	}

	public String getTipoFigura() {
		return tipoFigura;
	}

	public void setTipoFigura(String tipoFigura) {
		this.tipoFigura = tipoFigura;
	}
	
}

    

