/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bitlab.controladores;

import com.bitlab.conexion.FabricaConexion;
import com.bitlab.entidades.EstActividad;
import javax.persistence.EntityManager;

/**
 *
 * @author Aguilar
 */
public class EstActividadControlador extends FabricaControladorAbstracto<EstActividad>{

    public EstActividadControlador() {
        super(EstActividad.class);
    }

    @Override
    protected EntityManager obtenerManejadorEntidades() {
        return FabricaConexion.getInstancia().getManejadorEntidades().createEntityManager();
    }
    
}
