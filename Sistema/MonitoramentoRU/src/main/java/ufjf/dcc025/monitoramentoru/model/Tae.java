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
public class Tae extends Usuario implements Eticket {

    private final String tipo = "Tae";
    private static int id;

    public Tae(String nome, String identificador, String email, String telefone, String senha, String confirmarSenha, SemanaHorarios horariosUsuario) {
        super(nome, identificador, email, telefone, senha, confirmarSenha, horariosUsuario);        
        setTipo(tipo);
        id = getId();
        System.out.println("Foi criado  um cadastro do tipo " + tipo + ".");
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
            valorCafe = 1.64;
            valorRefeicao = 8.4;
        }
    }

}
