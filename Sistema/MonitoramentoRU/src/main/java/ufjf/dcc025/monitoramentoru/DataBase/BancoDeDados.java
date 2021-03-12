/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufjf.dcc025.monitoramentoru.DataBase;

import ufjf.dcc025.monitoramentoru.model.Usuario;
import java.util.ArrayList;
import java.util.List;

/**
 *
 *  @author Your Name <lucas.esteves@engenharia.ufjf.br>
 */
public class BancoDeDados {
    
    private static final List<Usuario> usuarios;
	
	static {
            usuarios = new ArrayList<>();
	}
			
	public static List<Usuario> getUsuarios(){
            return usuarios;
	}
    
}
