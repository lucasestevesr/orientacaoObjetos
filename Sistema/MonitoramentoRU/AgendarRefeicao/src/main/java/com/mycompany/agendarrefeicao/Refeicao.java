/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.agendarrefeicao;

/**
 *
 * @author tawan
 */
public class Refeicao {
    private String diaSemana;
    private String turnoRefeicao;
    private String horario;
    
    public Refeicao(String diaSemana, String turnoRefeicao, String horario){
        this.diaSemana = diaSemana;
        this.turnoRefeicao = turnoRefeicao;
        this.horario = horario;
    }

    public String getDiaSemana() {
        return diaSemana;
    }

    public void setDiaSemana(String diaSemana) {
        this.diaSemana = diaSemana;
    }

    public String getTurnoRefeicao() {
        return turnoRefeicao;
    }

    public void setTurnoRefeicao(String turnoRefeicao) {
        this.turnoRefeicao = turnoRefeicao;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
    
    
    
}
