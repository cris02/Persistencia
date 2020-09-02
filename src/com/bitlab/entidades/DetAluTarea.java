/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bitlab.entidades;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
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
import javax.persistence.Table;

/**
 *
 * @author Aguilar
 */
@Entity
@Table(name = "BIT_DET_ALU_TAREA", catalog = "BITLABCURSOS", schema = "")
@NamedQueries({
    @NamedQuery(name = "DetAluTarea.findAll", query = "SELECT d FROM DetAluTarea d")
    , @NamedQuery(name = "DetAluTarea.findByDetAluTarIdPk", query = "SELECT d FROM DetAluTarea d WHERE d.detAluTarIdPk = :detAluTarIdPk")
    , @NamedQuery(name = "DetAluTarea.findByDetAluTarNota", query = "SELECT d FROM DetAluTarea d WHERE d.detAluTarNota = :detAluTarNota")
    , @NamedQuery(name = "DetAluTarea.findByDetAluTarObservacion", query = "SELECT d FROM DetAluTarea d WHERE d.detAluTarObservacion = :detAluTarObservacion")})
public class DetAluTarea implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "DET_ALU_TAR_ID_PK", nullable = false)
    private Integer detAluTarIdPk;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "DET_ALU_TAR_NOTA", nullable = false, precision = 3, scale = 2)
    private BigDecimal detAluTarNota;
    @Basic(optional = false)
    @Column(name = "DET_ALU_TAR_OBSERVACION", nullable = false, length = 500)
    private String detAluTarObservacion;
    @JoinColumn(name = "ALU_ID_FK", referencedColumnName = "ALU_ID_PK", nullable = false)
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Alumno aluIdFk;
    @JoinColumn(name = "TAR_ID_FK", referencedColumnName = "TAR_ID_PK", nullable = false)
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Tarea tarIdFk;

    public DetAluTarea() {
    }

    public DetAluTarea(Integer detAluTarIdPk) {
        this.detAluTarIdPk = detAluTarIdPk;
    }

    public DetAluTarea(Integer detAluTarIdPk, BigDecimal detAluTarNota, String detAluTarObservacion) {
        this.detAluTarIdPk = detAluTarIdPk;
        this.detAluTarNota = detAluTarNota;
        this.detAluTarObservacion = detAluTarObservacion;
    }

    public Integer getDetAluTarIdPk() {
        return detAluTarIdPk;
    }

    public void setDetAluTarIdPk(Integer detAluTarIdPk) {
        this.detAluTarIdPk = detAluTarIdPk;
    }

    public BigDecimal getDetAluTarNota() {
        return detAluTarNota;
    }

    public void setDetAluTarNota(BigDecimal detAluTarNota) {
        this.detAluTarNota = detAluTarNota;
    }

    public String getDetAluTarObservacion() {
        return detAluTarObservacion;
    }

    public void setDetAluTarObservacion(String detAluTarObservacion) {
        this.detAluTarObservacion = detAluTarObservacion;
    }

    public Alumno getAluIdFk() {
        return aluIdFk;
    }

    public void setAluIdFk(Alumno aluIdFk) {
        this.aluIdFk = aluIdFk;
    }

    public Tarea getTarIdFk() {
        return tarIdFk;
    }

    public void setTarIdFk(Tarea tarIdFk) {
        this.tarIdFk = tarIdFk;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (detAluTarIdPk != null ? detAluTarIdPk.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetAluTarea)) {
            return false;
        }
        DetAluTarea other = (DetAluTarea) object;
        if ((this.detAluTarIdPk == null && other.detAluTarIdPk != null) || (this.detAluTarIdPk != null && !this.detAluTarIdPk.equals(other.detAluTarIdPk))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.bitlab.entidades.DetAluTarea[ detAluTarIdPk=" + detAluTarIdPk + " ]";
    }
    
}
