/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufjf.dcc025.monitoramentoru.model;

import javax.swing.JOptionPane;
import ufjf.dcc025.monitoramentoru.dao.BancoDeDadosUsuario;

/**
 *
 * @author Your Name <lucas.esteves@engenharia.ufjf.br>
 */
public class Discente extends Usuario implements Eticket {

    private final String tipo = "Discente";
    private static int id;

    public Discente(String nome, String identificador, String email, String telefone, String senha, String confirmarSenha, SemanaHorarios horariosUsuario) {
        super(nome, identificador, email, telefone, senha, confirmarSenha, horariosUsuario);
        setTipo(tipo);
        id = getId();
        System.out.println("Foi criado  um cadastro do tipo" + tipo + ".");
    }

//    @Override
//    public void editaCadastro(String nome, String identificador, String email, String telefone, String senha) {
//        super.editaCadastro(nome, identificador, email, telefone, senha);
//    }
//
//    @Override
//    public boolean autenticaLogin(String identificador, String senha) {
//        return super.autenticaLogin(identificador, senha);
//    }
    @Override
    public void pagar(double valorCafe, double valorRefeicao, String tipo) {
        if (tipo == null ? this.tipo == null : tipo.equals(this.tipo)) {
            valorCafe = 0.50;
            valorRefeicao = 1.4;
        }
    }
    //Fica mais Elegante a sobreposição da Interface na classe mãe ou na filha? 
    //Caso seja na mãe, poderia ser um método ?

}
   


