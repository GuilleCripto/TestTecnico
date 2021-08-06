/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.backend.dto;

/**
 *
 * @author Jose Guillermo Yanez
 */
public class FiguraDto {
       private Long id;
       private Float superficie;
       private Float base;
       private Float altura;
       private Float diametro; 
       private String tipoFigura;
       private Float total;

    public FiguraDto(Long id, Float superficie, Float base, Float altura, Float diametro, String tipoFigura, Float total) {
        this.id = id;
        this.superficie = superficie;
        this.base = base;
        this.altura = altura;
        this.diametro = diametro;
        this.tipoFigura = tipoFigura;
        this.total = total;
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

    public Float getTotal() {
        return total;
    }

    public void setTotal(Float total) {
        this.total = total;
    }

       
}
