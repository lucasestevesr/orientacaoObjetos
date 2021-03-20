/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufjf.dcc025.monitoramentoru.controller;
import ufjf.dcc025.monitoramentoru.dao.BancoDeDadosUsuario;
import ufjf.dcc025.monitoramentoru.model.*;

/**
 *
 * @author Your Name <lucas.esteves@engenharia.ufjf.br>
 */
public class MonitoramentoController {
   
    final int lotacaoMaxima = 10;
    int contPessoas;
    
    public int monitorar(String diaSemana, String hora){
        for (int i = 0; i < BancoDeDadosUsuario.getUsuarios().size(); i++) {
            if (BancoDeDadosUsuario.getRefeicao().get(i).getDiaSemana() == null ? diaSemana == null : BancoDeDadosUsuario.getRefeicao().get(i).getDiaSemana().equals(diaSemana)) {
                if (BancoDeDadosUsuario.getRefeicao().get(i).getHorario() == null ? hora == null : BancoDeDadosUsuario.getRefeicao().get(i).getHorario().equals(hora)) {
                    contPessoas++;
                }
            }
        }return contPessoas*100/lotacaoMaxima;
    } 
}
