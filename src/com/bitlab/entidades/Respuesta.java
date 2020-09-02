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
@Table(name = "BIT_RESPUESTA", catalog = "BITLABCURSOS", schema = "")
@NamedQueries({
    @NamedQuery(name = "Respuesta.findAll", query = "SELECT r FROM Respuesta r")
    , @NamedQuery(name = "Respuesta.findByResIdPk", query = "SELECT r FROM Respuesta r WHERE r.resIdPk = :resIdPk")
    , @NamedQuery(name = "Respuesta.findByResRespuestapreg", query = "SELECT r FROM Respuesta r WHERE r.resRespuestapreg = :resRespuestapreg")})
public class Respuesta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "RES_ID_PK", nullable = false)
    private Integer resIdPk;
    @Column(name = "RES_RESPUESTAPREG", length = 500)
    private String resRespuestapreg;
    @JoinColumn(name = "ALU_ID_FK", referencedColumnName = "ALU_ID_PK", nullable = false)
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Alumno aluIdFk;
    @JoinColumn(name = "PRE_ID_FK", referencedColumnName = "PRE_ID_PK", nullable = false)
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Pregunta preIdFk;

    public Respuesta() {
    }

    public Respuesta(Integer resIdPk) {
        this.resIdPk = resIdPk;
    }

    public Integer getResIdPk() {
        return resIdPk;
    }

    public void setResIdPk(Integer resIdPk) {
        this.resIdPk = resIdPk;
    }

    public String getResRespuestapreg() {
        return resRespuestapreg;
    }

    public void setResRespuestapreg(String resRespuestapreg) {
        this.resRespuestapreg = resRespuestapreg;
    }

    public Alumno getAluIdFk() {
        return aluIdFk;
    }

    public void setAluIdFk(Alumno aluIdFk) {
        this.aluIdFk = aluIdFk;
    }

    public Pregunta getPreIdFk() {
        return preIdFk;
    }

    public void setPreIdFk(Pregunta preIdFk) {
        this.preIdFk = preIdFk;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (resIdPk != null ? resIdPk.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Respuesta)) {
            return false;
        }
        Respuesta other = (Respuesta) object;
        if ((this.resIdPk == null && other.resIdPk != null) || (this.resIdPk != null && !this.resIdPk.equals(other.resIdPk))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.bitlab.entidades.Respuesta[ resIdPk=" + resIdPk + " ]";
    }
    
}
