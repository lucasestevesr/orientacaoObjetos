/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Your Name <lucas.esteves@engenharia.ufjf.br>
 */
public class Arquivo {

    public static String Read(String caminho) { //passa o caminho do arquivo que vc quer ler
        String conteudo = "";
        try { // tentar
            FileReader arq = new FileReader(caminho); //classe para leitura
            BufferedReader lerArq = new BufferedReader(arq); // dessa classe utiliza o BufferedReader - Uma classe encapsulando a outra;
            String linha = "";
            try {
                linha = lerArq.readLine();
                while (linha != null) {
                    conteudo += linha + "\n";
                    linha = lerArq.readLine();
                }
                arq.close();
                return conteudo;
            } catch (IOException ex) {
                System.out.println("Erro: não foi possível ler o arquivo.");
                return "";
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Erro: arquivo não encontrado.");
            return "";
        }
    }

    public static boolean Write(String caminho, String texto) {
        try {
            FileWriter arq = new FileWriter(caminho);
            PrintWriter gravarArq = new PrintWriter(arq);
            gravarArq.println(texto);
            gravarArq.close();
            return true;
        } catch (IOException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
}
