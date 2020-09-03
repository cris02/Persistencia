/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bitlab.pruebas;

import com.bitlab.controladores.UsuarioControlador;
import com.bitlab.entidades.Usuario;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Aguilar
 */
public class Main {
    private static List<Usuario> lisUser = new ArrayList<>();
    public static void main(String[] args) {
        
        UsuarioControlador usuarioControlador = new UsuarioControlador();
              
        lisUser = usuarioControlador.filtrarUsuariosPorRol(1, 3);
        
        for (Usuario usuario : lisUser) {
            System.out.println("El nombre del usario es : " + usuario.getUsuUser());
        }
    }
}
