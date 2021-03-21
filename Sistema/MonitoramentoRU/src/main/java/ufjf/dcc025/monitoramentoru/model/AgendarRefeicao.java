/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufjf.dcc025.monitoramentoru.model;

import ufjf.dcc025.monitoramentoru.dao.BancoDeDadosUsuario;

/**
 *
 * @author tawan
 */
public class AgendarRefeicao extends Refeicao{
    
    private final String tipo = "Agendamento";
//    private String id;
    
    public AgendarRefeicao(String id, String diaSemana, String turnoRefeicao, String horario){
        super(id, diaSemana, turnoRefeicao, horario);
        super.tipo = this.tipo;
        
        System.out.println("Foi criado um agendamento de refeição");
    }
    
    @Override
    public void editaRefeicao(String tipo, String diaSemana, String turnoRefeicao, String horario) {
        super.editaRefeicao(this.tipo, diaSemana, turnoRefeicao, horario);
    }

    @Override
    public void adcLista(Refeicao refeicao) {
        
        super.adcLista(refeicao); 
        BancoDeDadosUsuario.getRefeicoes().add(refeicao);
        
    }
    
    
}
