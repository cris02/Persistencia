/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bitlab.controladores;

import com.bitlab.conexion.FabricaConexion;
import com.bitlab.entidades.DetAluActseleccion;
import javax.persistence.EntityManager;

/**
 *
 * @author Aguilar
 */
public class DetAluActseleccionControlador extends FabricaControladorAbstracto<DetAluActseleccion>{

    public DetAluActseleccionControlador() {
        super(DetAluActseleccion.class);
    }

    @Override
    protected EntityManager obtenerManejadorEntidades() {
        return FabricaConexion.getInstancia().getManejadorEntidades().createEntityManager();
    }
    
}
