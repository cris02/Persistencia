/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bitlab.controladores;

import com.bitlab.conexion.FabricaConexion;
import com.bitlab.entidades.Perfil;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author Aguilar
 */
public class PerfilControlador extends FabricaControladorAbstracto<Perfil>{

    public PerfilControlador() {
        super(Perfil.class);
    }

    @Override
    protected EntityManager obtenerManejadorEntidades() {
        return FabricaConexion.getInstancia().getManejadorEntidades().createEntityManager();
    }
    
    //metodo para filtar por estados (idEstado = 3 para estado graduado, idEstado = 1 para estados de candidatos)
    public List<Perfil> filtrarPerfilPorEstado(Integer filtroId) {
        EntityManager em = obtenerManejadorEntidades();
        try {
            Query q = em.createQuery("SELECT p FROM Perfil p WHERE p.estPerIdFk.estPerIdPk = :filtroId");
            q.setParameter("filtroId", filtroId);
            return q.getResultList();
        } finally { 
           if (em.isOpen()) {
                em.close();
            }
        }
    }
    
}
