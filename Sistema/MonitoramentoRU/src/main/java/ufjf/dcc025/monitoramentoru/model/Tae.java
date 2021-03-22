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
public class Tae extends Usuario {

    private final String tipo = "Tae";

    public Tae(String nome, String identificador, String email, String telefone, String senha, String confirmarSenha, SemanaHorarios horariosUsuario) {
        super(nome, identificador, email, telefone, senha, confirmarSenha, horariosUsuario);
        setTipo(tipo);

        //System.out.println("Foi criado  um cadastro do tipo " + tipo + ".");
    }

}
