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
@Table(name = "BIT_EST_ACTIVIDAD", catalog = "BITLABCURSOS", schema = "")
@NamedQueries({
    @NamedQuery(name = "EstActividad.findAll", query = "SELECT e FROM EstActividad e")
    , @NamedQuery(name = "EstActividad.findByEstActIdPk", query = "SELECT e FROM EstActividad e WHERE e.estActIdPk = :estActIdPk")
    , @NamedQuery(name = "EstActividad.findByEstActNombre", query = "SELECT e FROM EstActividad e WHERE e.estActNombre = :estActNombre")
    , @NamedQuery(name = "EstActividad.findByEstActDescripcion", query = "SELECT e FROM EstActividad e WHERE e.estActDescripcion = :estActDescripcion")})
public class EstActividad implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "EST_ACT_ID_PK", nullable = false)
    private Integer estActIdPk;
    @Column(name = "EST_ACT_NOMBRE", length = 40)
    private String estActNombre;
    @Column(name = "EST_ACT_DESCRIPCION", length = 200)
    private String estActDescripcion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "estActIdFk", fetch = FetchType.EAGER)
    private List<DetAluActseleccion> detAluActseleccionList;

    public EstActividad() {
    }

    public EstActividad(Integer estActIdPk) {
        this.estActIdPk = estActIdPk;
    }

    public Integer getEstActIdPk() {
        return estActIdPk;
    }

    public void setEstActIdPk(Integer estActIdPk) {
        this.estActIdPk = estActIdPk;
    }

    public String getEstActNombre() {
        return estActNombre;
    }

    public void setEstActNombre(String estActNombre) {
        this.estActNombre = estActNombre;
    }

    public String getEstActDescripcion() {
        return estActDescripcion;
    }

    public void setEstActDescripcion(String estActDescripcion) {
        this.estActDescripcion = estActDescripcion;
    }

    public List<DetAluActseleccion> getDetAluActseleccionList() {
        return detAluActseleccionList;
    }

    public void setDetAluActseleccionList(List<DetAluActseleccion> detAluActseleccionList) {
        this.detAluActseleccionList = detAluActseleccionList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (estActIdPk != null ? estActIdPk.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EstActividad)) {
            return false;
        }
        EstActividad other = (EstActividad) object;
        if ((this.estActIdPk == null && other.estActIdPk != null) || (this.estActIdPk != null && !this.estActIdPk.equals(other.estActIdPk))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.bitlab.entidades.EstActividad[ estActIdPk=" + estActIdPk + " ]";
    }
    
}
