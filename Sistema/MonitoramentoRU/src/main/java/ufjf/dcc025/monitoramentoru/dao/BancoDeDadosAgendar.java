/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufjf.dcc025.monitoramentoru.dao;

import java.util.ArrayList;
import java.util.List;
import ufjf.dcc025.monitoramentoru.model.Refeicao;

/**
 *
 * @author tawan
 */
public class BancoDeDadosAgendar {
    
    private static final List<Refeicao> refeicoes;
	
	static {
            refeicoes = new ArrayList<>();
	}
			
	public static List<Refeicao> getRefeicao(){
            return refeicoes;
	}
        
}
