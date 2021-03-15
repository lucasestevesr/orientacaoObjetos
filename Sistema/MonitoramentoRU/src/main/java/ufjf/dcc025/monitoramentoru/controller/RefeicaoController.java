/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufjf.dcc025.monitoramentoru.controller;

import java.util.LinkedList;
import ufjf.dcc025.monitoramentoru.model.AgendarRefeicao;
import ufjf.dcc025.monitoramentoru.model.EncomendarRefeicao;
import ufjf.dcc025.monitoramentoru.model.Refeicao;

/**
 *
 * @author tawan
 */
public class RefeicaoController {
    public static LinkedList<Refeicao> refeicoes = new LinkedList();

    public void agendamentoRefeicao(String tipo, String diaSemana, String turnoRefeicao, String horario) {
        if (diaSemana != null && turnoRefeicao != null && horario != null) {
            Refeicao agendarRefeicao = new AgendarRefeicao("Agendamento", diaSemana, turnoRefeicao, horario);
            refeicoes.add(agendarRefeicao);
            Refeicao encomendarRefeicao = new EncomendarRefeicao("Encomenda", diaSemana, turnoRefeicao, horario);
            refeicoes.add(encomendarRefeicao);
        }
    }
}
