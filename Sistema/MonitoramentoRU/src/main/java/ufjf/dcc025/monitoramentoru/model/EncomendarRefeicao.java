/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufjf.dcc025.monitoramentoru.model;

/**
 *
 * @author tawan
 */
public class EncomendarRefeicao extends Refeicao{
    public EncomendarRefeicao(String tipo, String diaSemana, String turnoRefeicao, String horario){
        super(tipo, diaSemana, turnoRefeicao, horario);
        super.tipo = "Encomenda";
    }
}
