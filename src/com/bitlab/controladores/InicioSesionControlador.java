/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bitlab.controladores;

import com.bitlab.conexion.FabricaConexion;
import com.bitlab.entidades.Usuario;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaQuery;

/**
 *
 * @author henry
 */
public class InicioSesionControlador extends FabricaControladorAbstracto<Usuario> {

    public InicioSesionControlador() {
        super(Usuario.class);
    }

    @Override
    protected EntityManager obtenerManejadorEntidades() {
        return FabricaConexion.getInstancia().getManejadorEntidades().createEntityManager();
    }

    public Usuario encontrarUsuario(String usuario, String pass) {
        EntityManager em = obtenerManejadorEntidades();
        try {
            //realizar la busqueda de las entidades por medio de CriteriaQuery
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
//            cq.select(cq.from(entityClass));
//            Query q = em.createQuery(cq);
            TypedQuery<Usuario> usuarioEncontrado = em.createNamedQuery("Usuario.findByUsuarioPass", Usuario.class);
            usuarioEncontrado.setParameter("usuUser", usuario);
            usuarioEncontrado.setParameter("usuPass", pass);

            return usuarioEncontrado.getSingleResult();

        } catch (NoResultException ex) {
            System.out.println("No hay resultados...");
            return null;
        } finally {
            em.close();
        }
    }

    public Usuario encontrarPorUser(String usuario) {
        EntityManager em = obtenerManejadorEntidades();
        try {
            TypedQuery<Usuario> usuarioEncontrado = em.createNamedQuery("Usuario.findByUsuUser", Usuario.class);
            usuarioEncontrado.setParameter("usuUser", usuario);
            return usuarioEncontrado.getSingleResult();

        } catch (NoResultException ex) {
            System.out.println("No hay resultados...");
            return null;
        } finally {
            em.close();
        }
    }
}
