/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufjf.dcc025.monitoramentoru.model;

/**
 *
 * @author Your Name <lucas.esteves@engenharia.ufjf.br>
 */
public class Discente extends Usuario {

    private final int tipo;

    public Discente(String nome, String identificador, String email, String telefone, String senha, String confirmarSenha) {
        super(nome, identificador, email, telefone, senha, confirmarSenha);
        this.tipo = 2;
        super.tipo = this.tipo;
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
