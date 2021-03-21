/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufjf.dcc025.monitoramentoru.model;

/**
 *
 * @author arthu
 */
public class SemanaHorarios {
    
    private String id;
    private Horarios segundafeira;
    private Horarios tercafeira;
    private Horarios quartafeira;
    private Horarios quintafeira;
    private Horarios sextafeira;
    private Horarios sabado;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public SemanaHorarios(String id, Horarios segundafeira, Horarios tercafeira, Horarios quartafeira, Horarios quintafeira, Horarios sextafeira, Horarios sabado) {
        this.id = id;
        this.segundafeira = segundafeira;
        this.tercafeira = tercafeira;
        this.quartafeira = quartafeira;
        this.quintafeira = quintafeira;
        this.sextafeira = sextafeira;
        this.sabado = sabado;
    }
    
    public Horarios getSegundafeira() {
        return segundafeira;
    }

    public void setSegundafeira(Horarios segundafeira) {
        this.segundafeira = segundafeira;
    }

    public Horarios getTercafeira() {
        return tercafeira;
    }

    public void setTercafeira(Horarios tercafeira) {
        this.tercafeira = tercafeira;
    }

    public Horarios getQuartafeira() {
        return quartafeira;
    }

    public void setQuartafeira(Horarios quartafeira) {
        this.quartafeira = quartafeira;
    }

    public Horarios getQuintafeira() {
        return quintafeira;
    }

    public void setQuintafeira(Horarios quintafeira) {
        this.quintafeira = quintafeira;
    }

    public Horarios getSextafeira() {
        return sextafeira;
    }

    public void setSextafeira(Horarios sextafeira) {
        this.sextafeira = sextafeira;
    }

    public Horarios getSabado() {
        return sabado;
    }

    public void setSabado(Horarios sabado) {
        this.sabado = sabado;
    }
    
    
}
