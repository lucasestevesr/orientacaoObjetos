/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufjf.dcc025.monitoramentoru.utils;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import ufjf.dcc025.monitoramentoru.model.*;
import java.util.ArrayList;
import java.util.List;
import ufjf.dcc025.monitoramentoru.controller.UsuarioController;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import ufjf.dcc025.monitoramentoru.dao.BancoDeDadosUsuario;

/**
 *
 * @author Your Name <lucas.esteves@engenharia.ufjf.br>
 */
public class Arquivo {

    private static Gson SERIALIZADOR;

    public static final void getJSONFromUsuario() {
        SERIALIZADOR = new Gson();
        String filePath = new File("").getAbsolutePath();
        try ( FileWriter writer = new FileWriter(filePath + "\\bd.json")) {
            SERIALIZADOR.toJson(BancoDeDadosUsuario.getUsuarios(), writer);

        } catch (IOException e) {
            e.printStackTrace();

        }

    }

    public static <T> List<T> getList(BufferedReader jsonArray, Class<T> clazz) {
        Type typeOfT = TypeToken.getParameterized(List.class, clazz).getType();
        return new Gson().fromJson(jsonArray, typeOfT);
    }

    public static final void setFromJsonUsuario() {
        List<AuxUsuario> retornaUsuarios = new ArrayList<>();
        String filePath = new File("").getAbsolutePath();

        try {

            Gson gson = new Gson();
            FileReader arq = new FileReader(filePath + "\\bd.json"); //classe para leitura
            BufferedReader lerArq = new BufferedReader(arq);
            retornaUsuarios = Arquivo.getList(lerArq, AuxUsuario.class);
            lerArq.close();

        } catch (Exception ex) {

            ex.printStackTrace();
        }
        if (retornaUsuarios != null) {
            for (AuxUsuario user : retornaUsuarios) {
                Horarios dia = new Horarios();
                SemanaHorarios horariosUsuario = new SemanaHorarios("id", dia, dia, dia, dia, dia, dia);
                UsuarioController uc = new UsuarioController();

                uc.cadastrarUsuarioaux(user.getTipo(), user.getNome(), user.getIdentificador(), user.getEmail(), user.getEmail(), user.getSenha(), user.getConfirmarSenha(), horariosUsuario);
            }
        }
    }
}
