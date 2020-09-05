/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bitlab.entidades;

import java.io.Serializable;
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
@Table(name = "BIT_DET_ALU_ACTSELECCION", catalog = "BITLABCURSOS", schema = "")
@NamedQueries({
    @NamedQuery(name = "DetAluActseleccion.findAll", query = "SELECT d FROM DetAluActseleccion d")
    , @NamedQuery(name = "DetAluActseleccion.findByDetAluActIdPk", query = "SELECT d FROM DetAluActseleccion d WHERE d.detAluActIdPk = :detAluActIdPk")
    , @NamedQuery(name = "DetAluActseleccion.findByDetAluActNota", query = "SELECT d FROM DetAluActseleccion d WHERE d.detAluActNota = :detAluActNota")
    , @NamedQuery(name = "DetAluActseleccion.findByDetAluActObservacion", query = "SELECT d FROM DetAluActseleccion d WHERE d.detAluActObservacion = :detAluActObservacion")
    , @NamedQuery(name = "DetAluActseleccion.findByDetAluActDocumentoPrueba", query = "SELECT d FROM DetAluActseleccion d WHERE d.detAluActDocumentoPrueba = :detAluActDocumentoPrueba")})
public class DetAluActseleccion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "DET_ALU_ACT_ID_PK", nullable = false)
    private Integer detAluActIdPk;
    @Basic(optional = false)
    @Column(name = "DET_ALU_ACT_NOTA", nullable = false)
    private int detAluActNota;
    @Column(name = "DET_ALU_ACT_OBSERVACION", length = 500)
    private String detAluActObservacion;
    @Column(name = "DET_ALU_ACT_DOCUMENTO_PRUEBA", length = 255)
    private String detAluActDocumentoPrueba;
    @JoinColumn(name = "PER_ID_FK", referencedColumnName = "PER_ID_PK", nullable = false)
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Perfil perIdFk;
    @JoinColumn(name = "EST_ACT_ID_FK", referencedColumnName = "EST_ACT_ID_PK", nullable = false)
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private EstActividad estActIdFk;
    @JoinColumn(name = "ACT_SEL_ID_FK", referencedColumnName = "ACT_SEL_ID_PK", nullable = false)
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private ActSeleccion actSelIdFk;

    public DetAluActseleccion() {
    }

    public DetAluActseleccion(Integer detAluActIdPk) {
        this.detAluActIdPk = detAluActIdPk;
    }

    public DetAluActseleccion(Integer detAluActIdPk, int detAluActNota) {
        this.detAluActIdPk = detAluActIdPk;
        this.detAluActNota = detAluActNota;
    }

    public Integer getDetAluActIdPk() {
        return detAluActIdPk;
    }

    public void setDetAluActIdPk(Integer detAluActIdPk) {
        this.detAluActIdPk = detAluActIdPk;
    }

    public int getDetAluActNota() {
        return detAluActNota;
    }

    public void setDetAluActNota(int detAluActNota) {
        this.detAluActNota = detAluActNota;
    }

    public String getDetAluActObservacion() {
        return detAluActObservacion;
    }

    public void setDetAluActObservacion(String detAluActObservacion) {
        this.detAluActObservacion = detAluActObservacion;
    }

    public String getDetAluActDocumentoPrueba() {
        return detAluActDocumentoPrueba;
    }

    public void setDetAluActDocumentoPrueba(String detAluActDocumentoPrueba) {
        this.detAluActDocumentoPrueba = detAluActDocumentoPrueba;
    }

    public Perfil getPerIdFk() {
        return perIdFk;
    }

    public void setPerIdFk(Perfil perIdFk) {
        this.perIdFk = perIdFk;
    }

    public EstActividad getEstActIdFk() {
        return estActIdFk;
    }

    public void setEstActIdFk(EstActividad estActIdFk) {
        this.estActIdFk = estActIdFk;
    }

    public ActSeleccion getActSelIdFk() {
        return actSelIdFk;
    }

    public void setActSelIdFk(ActSeleccion actSelIdFk) {
        this.actSelIdFk = actSelIdFk;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (detAluActIdPk != null ? detAluActIdPk.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetAluActseleccion)) {
            return false;
        }
        DetAluActseleccion other = (DetAluActseleccion) object;
        if ((this.detAluActIdPk == null && other.detAluActIdPk != null) || (this.detAluActIdPk != null && !this.detAluActIdPk.equals(other.detAluActIdPk))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.bitlab.entidades.DetAluActseleccion[ detAluActIdPk=" + detAluActIdPk + " ]";
    }
    
}
