/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufjf.dcc025.monitoramentoru.controller;
import java.util.LinkedList;
import javax.swing.JOptionPane;
import ufjf.dcc025.monitoramentoru.model.Horarios;

/**
 *
 * @author arthu
 */
public class HorariosController {
    
        public static LinkedList<Horarios> horarios = new LinkedList();
        
        public void cadastrarHorarios(Horarios grade, String DiaSemana, String id, boolean h7, boolean h8, boolean h9, boolean h10, boolean h11, boolean h12, boolean h13, boolean h14, boolean h15, boolean h16, boolean h17, boolean h18, boolean h19, boolean h20){
            
            
            int dia = ConverteDia(DiaSemana);
            grade.getHorariosUsuario()[dia][0] = h7;
            grade.getHorariosUsuario()[dia][1] = h8;
            grade.getHorariosUsuario()[dia][2] = h9;
            grade.getHorariosUsuario()[dia][3] = h10;
            grade.getHorariosUsuario()[dia][4] = h11;
            grade.getHorariosUsuario()[dia][5] = h12;
            grade.getHorariosUsuario()[dia][6] = h13;
            grade.getHorariosUsuario()[dia][7] = h14;
            grade.getHorariosUsuario()[dia][8] = h15;
            grade.getHorariosUsuario()[dia][9] = h16;
            grade.getHorariosUsuario()[dia][10] = h17;
            grade.getHorariosUsuario()[dia][11] = h18;
            grade.getHorariosUsuario()[dia][12] = h19;
            grade.getHorariosUsuario()[dia][13] = h20;
            
//            horarios.add(grade);
            
            JOptionPane.showMessageDialog(null, "Horários de " + DiaSemana + " registrados com sucesso!");
            
        }
        
    public Integer ConverteDia(String diaSemana){
        int dia = 0 ;
        if ("Segunda-feira".equals(diaSemana))
            dia = 0;
        if ("Terça-feira".equals(diaSemana))
            dia = 1;   
        if ("Quarta-feira".equals(diaSemana))
            dia = 2;
        if ("Quinta-feira".equals(diaSemana))
            dia = 3;
        if ("Sexta-feira".equals(diaSemana))
            dia = 4;
        if ("Sábado-feira".equals(diaSemana))
            dia = 5;
        return dia;
    }
    
    public void ConcluirCadastro(Horarios grade){
        horarios.add(grade);
    }
    
    public void cadastrarHorarios(String diaSemana, String id, boolean h7, boolean h8, boolean h9, boolean h10, boolean h11, boolean h12, boolean h13, boolean h14, boolean h15, boolean h16, int i, boolean h18, int i0, boolean h20, boolean h21, boolean h22) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
