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
@Table(name = "BIT_EST_PERFIL", catalog = "BITLABCURSOS", schema = "")
@NamedQueries({
    @NamedQuery(name = "EstPerfil.findAll", query = "SELECT e FROM EstPerfil e")
    , @NamedQuery(name = "EstPerfil.findByEstPerIdPk", query = "SELECT e FROM EstPerfil e WHERE e.estPerIdPk = :estPerIdPk")
    , @NamedQuery(name = "EstPerfil.findByEstPerNombre", query = "SELECT e FROM EstPerfil e WHERE e.estPerNombre = :estPerNombre")
    , @NamedQuery(name = "EstPerfil.findByEstPerDescripcion", query = "SELECT e FROM EstPerfil e WHERE e.estPerDescripcion = :estPerDescripcion")})
public class EstPerfil implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "EST_PER_ID_PK", nullable = false)
    private Integer estPerIdPk;
    @Column(name = "EST_PER_NOMBRE", length = 40)
    private String estPerNombre;
    @Column(name = "EST_PER_DESCRIPCION", length = 200)
    private String estPerDescripcion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "estPerIdFk", fetch = FetchType.EAGER)
    private List<Perfil> perfilList;

    public EstPerfil() {
    }

    public EstPerfil(Integer estPerIdPk) {
        this.estPerIdPk = estPerIdPk;
    }

    public Integer getEstPerIdPk() {
        return estPerIdPk;
    }

    public void setEstPerIdPk(Integer estPerIdPk) {
        this.estPerIdPk = estPerIdPk;
    }

    public String getEstPerNombre() {
        return estPerNombre;
    }

    public void setEstPerNombre(String estPerNombre) {
        this.estPerNombre = estPerNombre;
    }

    public String getEstPerDescripcion() {
        return estPerDescripcion;
    }

    public void setEstPerDescripcion(String estPerDescripcion) {
        this.estPerDescripcion = estPerDescripcion;
    }

    public List<Perfil> getPerfilList() {
        return perfilList;
    }

    public void setPerfilList(List<Perfil> perfilList) {
        this.perfilList = perfilList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (estPerIdPk != null ? estPerIdPk.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EstPerfil)) {
            return false;
        }
        EstPerfil other = (EstPerfil) object;
        if ((this.estPerIdPk == null && other.estPerIdPk != null) || (this.estPerIdPk != null && !this.estPerIdPk.equals(other.estPerIdPk))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.bitlab.entidades.EstPerfil[ estPerIdPk=" + estPerIdPk + " ]";
    }
    
}
