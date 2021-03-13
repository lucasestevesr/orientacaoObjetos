/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufjf.dcc025.monitoramentoru.controller;

import ufjf.dcc025.monitoramentoru.model.Usuario;

/**
 *
 * @author Your Name <lucas.esteves@engenharia.ufjf.br>
 * 
 * 
 * O Controller faz a ligação do "Banco de Dados" à Model, ou seja, 
 * conecta o "banco" a modelagem das classes.
 */
public class UsuarioController {
    
    public boolean cadastrarUsuario(String nome, String identificador, String email, String telefone, String senha, String confirmarSenha){
        if(telefone != null && nome != null && nome.length() > 0 && identificador != null && identificador.length() > 0 && email != null && email.length() > 0 && telefone.length() > 0 
                && senha != null && senha.length() > 0 && (senha == null ? confirmarSenha == null : senha.equals(confirmarSenha))) {
            Usuario usuario = new Usuario(nome, identificador, email, telefone, senha) {};
            usuario.cadastrarUsuario(usuario);
            return true;
        } else {
        }
        return false;
    }
    
}
