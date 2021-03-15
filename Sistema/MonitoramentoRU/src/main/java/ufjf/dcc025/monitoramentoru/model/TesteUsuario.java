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
public class TesteUsuario {

    public static void main(String[] args) {

        Usuario arthur = new Docente("arthur", "identificador", "email", "telefone", "senha", "senha");        
        System.out.println(arthur.autenticaLogin("identificador", "senha"));
        arthur.editaCadastro("Lucas", "201369130A", "lucas@gmail.com", "32984406363", "123456");
        arthur.toString();
        System.out.println(arthur.getSenha());
        System.out.println(arthur.getTipo());
    }
}
