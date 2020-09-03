/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bitlab.controladores;

import com.bitlab.conexion.FabricaConexion;
import com.bitlab.entidades.Usuario;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author Aguilar
 */
public class UsuarioControlador extends FabricaControladorAbstracto<Usuario>{

    public UsuarioControlador() {
        super(Usuario.class);
    }

    @Override
    protected EntityManager obtenerManejadorEntidades() {
        return FabricaConexion.getInstancia().getManejadorEntidades().createEntityManager();
    }
    
    //buscar campos por filtro: en este caso se filtrara usuarios dependiendo su rol (id rol = 4 para roles de tipo profesor)
    public List<Usuario> filtrarUsuariosPorRol(Integer filtroRol) {
        EntityManager em = obtenerManejadorEntidades();
        try {
            Query q = em.createQuery("SELECT user FROM Usuario user WHERE user.rolIdFk.rolIdPk = :filtroRol");
            q.setParameter("filtroRol", filtroRol);
            return q.getResultList();
        } finally { 
           if (em.isOpen()) {
                em.close();
            }
        }
    }
    
    //filtrar roles de tipo superadmin y analistas (rol 1 y 3)
    public List<Usuario> filtrarUsuariosPorRol(Integer filtro1, Integer filtro2) {
        EntityManager em = obtenerManejadorEntidades();
        try {
            Query q = em.createQuery("SELECT user FROM Usuario user WHERE user.rolIdFk.rolIdPk = :filtro1 OR user.rolIdFk.rolIdPk = :filtro2");
            q.setParameter("filtro1", filtro1);
            q.setParameter("filtro2", filtro2);
            return q.getResultList();
        } finally { 
           if (em.isOpen()) {
                em.close();
            }
        }
    }
}
