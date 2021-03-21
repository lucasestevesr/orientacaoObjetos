/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufjf.dcc025.monitoramentoru.controller;

import javax.swing.JOptionPane;
import ufjf.dcc025.monitoramentoru.dao.BancoDeDadosUsuario;
import static ufjf.dcc025.monitoramentoru.dao.BancoDeDadosUsuario.getUsuarioLogado;
import ufjf.dcc025.monitoramentoru.model.Horarios;
import ufjf.dcc025.monitoramentoru.model.SemanaHorarios;
import ufjf.dcc025.monitoramentoru.model.Usuario;

/**
 *
 * @author arthu
 */
public class HorariosController {

//    public static LinkedList<Horarios> horarios = new LinkedList();

//    public void cadastrarHorarios(Horarios grade, String DiaSemana, String id, boolean h7, boolean h8, boolean h9, boolean h10, boolean h11, boolean h12, boolean h13, boolean h14, boolean h15, boolean h16, boolean h17, boolean h18, boolean h19, boolean h20) {
    public void cadastrarHorarios(String diaSemana, boolean h7,boolean h8,boolean h9, boolean h10, boolean h11, boolean h12, boolean h13, boolean h14, boolean h15, boolean h16, boolean h17, boolean h18, boolean h19, boolean h20) {
        
        Horarios grade = new Horarios();
        
        grade.setDia(diaSemana);
        grade.setH7(h7);
        grade.setH8(h8);
        grade.setH9(h9);
        grade.setH10(h10);
        grade.setH11(h11);
        grade.setH12(h12);
        grade.setH13(h13);
        grade.setH14(h14);
        grade.setH15(h15);
        grade.setH16(h16);
        grade.setH17(h17);
        grade.setH18(h18);
        grade.setH19(h19);
        grade.setH20(h20);
        
        // Setando o id da grade de horarios do usuario
        getUsuarioLogado().getHorariosUsuario().setId(getUsuarioLogado().getIdentificador());
            
        // Setando os horarios de cada dia da semana do usuario logado
        if ("Segunda-feira".equals(diaSemana)) 
            getUsuarioLogado().getHorariosUsuario().setSegundafeira(grade);      
        if ("Terça-feira".equals(diaSemana)) 
            getUsuarioLogado().getHorariosUsuario().setTercafeira(grade);
        if ("Quarta-feira".equals(diaSemana)) 
            getUsuarioLogado().getHorariosUsuario().setQuartafeira(grade);
        if ("Quinta-feira".equals(diaSemana)) 
            getUsuarioLogado().getHorariosUsuario().setQuintafeira(grade);
        if ("Sexta-feira".equals(diaSemana)) 
            getUsuarioLogado().getHorariosUsuario().setSextafeira(grade);
        if ("Sábado".equals(diaSemana)) 
            getUsuarioLogado().getHorariosUsuario().setSabado(grade);

        JOptionPane.showMessageDialog(null, "Horários de " + diaSemana + " registrados com sucesso!");
        

    }

    public void ConcluirCadastro(SemanaHorarios semana) {
        
        BancoDeDadosUsuario.getHorarios().add(semana);
        JOptionPane.showMessageDialog(null, "Todos os horários foram registrados!");

    }

}
