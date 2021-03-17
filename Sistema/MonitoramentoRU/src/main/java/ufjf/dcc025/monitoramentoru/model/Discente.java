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
public class Discente extends Usuario implements InterfaceUsuario {

    private final String tipo = "Discente";

    public Discente(String nome, String identificador, String email, String telefone, String senha, String confirmarSenha) {
        super(nome, identificador, email, telefone, senha, confirmarSenha);
        setTipo(tipo);
        System.out.println("Foi criado  um cadastro do tipo" + tipo +".");
    }

    @Override
    public void editaCadastro(String nome, String identificador, String email, String telefone, String senha) {
        super.editaCadastro(nome, identificador, email, telefone, senha);
    }

    @Override
    public boolean autenticaLogin(String identificador, String senha) {
        return super.autenticaLogin(identificador, senha);
    }

    @Override
    public void pagarETicket(double valorCafe, double valorRefeicao, String tipo) {
        if(tipo == null ? this.tipo == null : tipo.equals(this.tipo)){
            valorCafe = 0.50;
            valorRefeicao = 1.4;
        }
    } 
    //Fica mais Elegante a sobreposição da Interface na classe mãe ou na filha? 
    //Caso seja na mãe, poderia ser um método ?

   

}
