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
@Table(name = "BIT_EST_PLAZA", catalog = "BITLABCURSOS", schema = "")
@NamedQueries({
    @NamedQuery(name = "EstPlaza.findAll", query = "SELECT e FROM EstPlaza e")
    , @NamedQuery(name = "EstPlaza.findByEstPlaIdPk", query = "SELECT e FROM EstPlaza e WHERE e.estPlaIdPk = :estPlaIdPk")
    , @NamedQuery(name = "EstPlaza.findByEstPlaNombre", query = "SELECT e FROM EstPlaza e WHERE e.estPlaNombre = :estPlaNombre")
    , @NamedQuery(name = "EstPlaza.findByEstPlaDescripcion", query = "SELECT e FROM EstPlaza e WHERE e.estPlaDescripcion = :estPlaDescripcion")})
public class EstPlaza implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "EST_PLA_ID_PK", nullable = false)
    private Integer estPlaIdPk;
    @Column(name = "EST_PLA_NOMBRE", length = 40)
    private String estPlaNombre;
    @Column(name = "EST_PLA_DESCRIPCION", length = 200)
    private String estPlaDescripcion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "estPlaIdFk", fetch = FetchType.EAGER)
    private List<DetPlaAlumno> detPlaAlumnoList;

    public EstPlaza() {
    }

    public EstPlaza(Integer estPlaIdPk) {
        this.estPlaIdPk = estPlaIdPk;
    }

    public Integer getEstPlaIdPk() {
        return estPlaIdPk;
    }

    public void setEstPlaIdPk(Integer estPlaIdPk) {
        this.estPlaIdPk = estPlaIdPk;
    }

    public String getEstPlaNombre() {
        return estPlaNombre;
    }

    public void setEstPlaNombre(String estPlaNombre) {
        this.estPlaNombre = estPlaNombre;
    }

    public String getEstPlaDescripcion() {
        return estPlaDescripcion;
    }

    public void setEstPlaDescripcion(String estPlaDescripcion) {
        this.estPlaDescripcion = estPlaDescripcion;
    }

    public List<DetPlaAlumno> getDetPlaAlumnoList() {
        return detPlaAlumnoList;
    }

    public void setDetPlaAlumnoList(List<DetPlaAlumno> detPlaAlumnoList) {
        this.detPlaAlumnoList = detPlaAlumnoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (estPlaIdPk != null ? estPlaIdPk.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EstPlaza)) {
            return false;
        }
        EstPlaza other = (EstPlaza) object;
        if ((this.estPlaIdPk == null && other.estPlaIdPk != null) || (this.estPlaIdPk != null && !this.estPlaIdPk.equals(other.estPlaIdPk))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.bitlab.entidades.EstPlaza[ estPlaIdPk=" + estPlaIdPk + " ]";
    }
    
}
