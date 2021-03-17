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
public class UsuarioLogin {

    private String identificador;
    private String senha;

    public UsuarioLogin(String identificador, String senha) {
        this.identificador = identificador;
        this.senha = senha;
    }     

    public boolean autenticaLogin(String identificador, String senha) {
        System.out.println("Autenticando o Login.");
        return ((this.senha == null ? senha == null : this.senha.equals(senha)) && this.identificador.equals(identificador));
    }

    public String getIdentificador() {
        return identificador;
    }

    public String getSenha() {
        return senha;
    }

}
