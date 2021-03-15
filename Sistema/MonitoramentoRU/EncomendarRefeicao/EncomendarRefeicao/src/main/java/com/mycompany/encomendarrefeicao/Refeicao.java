/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.encomendarrefeicao;

/**
 *
 * @author Lucas
 */
public class Refeicao {
    private String diaSemana;
    private String turnoRefeicao;
    private String horario;
    private String tipoRefeicao;
    
    public Refeicao(String tipoRefeicao, String turnoRefeicao, String horario, String diaSemana){
        this.diaSemana = diaSemana;
        this.turnoRefeicao = turnoRefeicao;
        this.horario = horario;
        this.tipoRefeicao = tipoRefeicao;
    }
    
}
