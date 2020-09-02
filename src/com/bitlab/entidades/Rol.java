/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bitlab.entidades;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Aguilar
 */
@Entity
@Table(name = "BIT_ROL", catalog = "BITLABCURSOS", schema = "")
@NamedQueries({
    @NamedQuery(name = "Rol.findAll", query = "SELECT r FROM Rol r")
    , @NamedQuery(name = "Rol.findByRolIdPk", query = "SELECT r FROM Rol r WHERE r.rolIdPk = :rolIdPk")
    , @NamedQuery(name = "Rol.findByRolNombre", query = "SELECT r FROM Rol r WHERE r.rolNombre = :rolNombre")
    , @NamedQuery(name = "Rol.findByRolDescripcion", query = "SELECT r FROM Rol r WHERE r.rolDescripcion = :rolDescripcion")})
public class Rol implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ROL_ID_PK", nullable = false)
    private Integer rolIdPk;
    @Column(name = "ROL_NOMBRE", length = 100)
    private String rolNombre;
    @Column(name = "ROL_DESCRIPCION", length = 200)
    private String rolDescripcion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "rolIdFk", fetch = FetchType.EAGER)
    private List<Usuario> usuarioList;

    public Rol() {
    }

    public Rol(Integer rolIdPk) {
        this.rolIdPk = rolIdPk;
    }

    public Integer getRolIdPk() {
        return rolIdPk;
    }

    public void setRolIdPk(Integer rolIdPk) {
        this.rolIdPk = rolIdPk;
    }

    public String getRolNombre() {
        return rolNombre;
    }

    public void setRolNombre(String rolNombre) {
        this.rolNombre = rolNombre;
    }

    public String getRolDescripcion() {
        return rolDescripcion;
    }

    public void setRolDescripcion(String rolDescripcion) {
        this.rolDescripcion = rolDescripcion;
    }

    public List<Usuario> getUsuarioList() {
        return usuarioList;
    }

    public void setUsuarioList(List<Usuario> usuarioList) {
        this.usuarioList = usuarioList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (rolIdPk != null ? rolIdPk.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Rol)) {
            return false;
        }
        Rol other = (Rol) object;
        if ((this.rolIdPk == null && other.rolIdPk != null) || (this.rolIdPk != null && !this.rolIdPk.equals(other.rolIdPk))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.bitlab.entidades.Rol[ rolIdPk=" + rolIdPk + " ]";
    }
    
}
