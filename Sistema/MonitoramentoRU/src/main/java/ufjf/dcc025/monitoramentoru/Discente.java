/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufjf.dcc025.monitoramentoru;

/**
 *
 * @author Lucas
 */
public class Discente extends Usuario {

    public Discente(String nome, String identificador, String email, String telefone, String senha) {
        super(nome, identificador, email, telefone, senha);
        System.out.println("Foi criado  um cadastro do tipo discente.");
    }

    @Override
    public void editaCadastro(String nome, String identificador, String email, String telefone, String senha) {
        super.editaCadastro(nome, identificador, email, telefone, senha);
    }

    @Override
    public boolean autenticaLogin(String identificador, String senha) {
        return super.autenticaLogin(identificador, senha);
    }

}
