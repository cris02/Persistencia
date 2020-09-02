/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bitlab.entidades;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Aguilar
 */
@Entity
@Table(name = "BIT_PLAZA", catalog = "BITLABCURSOS", schema = "")
@NamedQueries({
    @NamedQuery(name = "Plaza.findAll", query = "SELECT p FROM Plaza p")
    , @NamedQuery(name = "Plaza.findByPlaIdPk", query = "SELECT p FROM Plaza p WHERE p.plaIdPk = :plaIdPk")
    , @NamedQuery(name = "Plaza.findByPlaNombre", query = "SELECT p FROM Plaza p WHERE p.plaNombre = :plaNombre")
    , @NamedQuery(name = "Plaza.findByPlaFechaPublicacion", query = "SELECT p FROM Plaza p WHERE p.plaFechaPublicacion = :plaFechaPublicacion")
    , @NamedQuery(name = "Plaza.findByPlaFechaFin", query = "SELECT p FROM Plaza p WHERE p.plaFechaFin = :plaFechaFin")
    , @NamedQuery(name = "Plaza.findByPlaDescripcion", query = "SELECT p FROM Plaza p WHERE p.plaDescripcion = :plaDescripcion")})
public class Plaza implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "PLA_ID_PK", nullable = false)
    private Integer plaIdPk;
    @Column(name = "PLA_NOMBRE", length = 150)
    private String plaNombre;
    @Column(name = "PLA_FECHA_PUBLICACION")
    @Temporal(TemporalType.DATE)
    private Date plaFechaPublicacion;
    @Column(name = "PLA_FECHA_FIN")
    @Temporal(TemporalType.DATE)
    private Date plaFechaFin;
    @Column(name = "PLA_DESCRIPCION", length = 255)
    private String plaDescripcion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "plaIdFk", fetch = FetchType.EAGER)
    private List<DetPlaAlumno> detPlaAlumnoList;
    @JoinColumn(name = "EVA_ID_FK", referencedColumnName = "EVA_ID_PK", nullable = false)
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Evaluador evaIdFk;

    public Plaza() {
    }

    public Plaza(Integer plaIdPk) {
        this.plaIdPk = plaIdPk;
    }

    public Integer getPlaIdPk() {
        return plaIdPk;
    }

    public void setPlaIdPk(Integer plaIdPk) {
        this.plaIdPk = plaIdPk;
    }

    public String getPlaNombre() {
        return plaNombre;
    }

    public void setPlaNombre(String plaNombre) {
        this.plaNombre = plaNombre;
    }

    public Date getPlaFechaPublicacion() {
        return plaFechaPublicacion;
    }

    public void setPlaFechaPublicacion(Date plaFechaPublicacion) {
        this.plaFechaPublicacion = plaFechaPublicacion;
    }

    public Date getPlaFechaFin() {
        return plaFechaFin;
    }

    public void setPlaFechaFin(Date plaFechaFin) {
        this.plaFechaFin = plaFechaFin;
    }

    public String getPlaDescripcion() {
        return plaDescripcion;
    }

    public void setPlaDescripcion(String plaDescripcion) {
        this.plaDescripcion = plaDescripcion;
    }

    public List<DetPlaAlumno> getDetPlaAlumnoList() {
        return detPlaAlumnoList;
    }

    public void setDetPlaAlumnoList(List<DetPlaAlumno> detPlaAlumnoList) {
        this.detPlaAlumnoList = detPlaAlumnoList;
    }

    public Evaluador getEvaIdFk() {
        return evaIdFk;
    }

    public void setEvaIdFk(Evaluador evaIdFk) {
        this.evaIdFk = evaIdFk;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (plaIdPk != null ? plaIdPk.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Plaza)) {
            return false;
        }
        Plaza other = (Plaza) object;
        if ((this.plaIdPk == null && other.plaIdPk != null) || (this.plaIdPk != null && !this.plaIdPk.equals(other.plaIdPk))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.bitlab.entidades.Plaza[ plaIdPk=" + plaIdPk + " ]";
    }
    
}
