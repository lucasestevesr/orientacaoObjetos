/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufjf.dcc025.monitoramentoru.model;
import ufjf.dcc025.monitoramentoru.controller.UsuarioController;

/**
 *
 * @author Your Name <lucas.esteves@engenharia.ufjf.br>
 */
public class TesteUsuario {

    public static void main(String[] args) {
        
        Usuario arthur = new Docente("arthur", "identificador", "email", "telefone", "senha", "senha");        
        System.out.println(arthur.autenticaLogin("identificador", "senha"));
        arthur.editaCadastro("Lucas", "201369130A", "lucas@gmail.com", "32984406363", "123456");
        
        System.out.println(arthur);//chama o toString.
        System.out.println(arthur.getSenha());
        System.out.println(arthur.getTipo());
        
        UsuarioController usuarioController = new UsuarioController();
        usuarioController.cadastrarUsuario(5,"Lucas", "201366547AB", "lucas@gmail.com.br", "32984406363", "x9w9q7s6", "x9w9q7s6");
        System.out.println(usuarioController); //chama o toString.
        // Está CADASTRANDO OS 3 TIPOS: DOCENTE, DISCENTE, TAE;                
    }
}
