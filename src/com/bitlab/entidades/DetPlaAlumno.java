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
@Table(name = "BIT_DET_PLA_ALUMNO", catalog = "BITLABCURSOS", schema = "")
@NamedQueries({
    @NamedQuery(name = "DetPlaAlumno.findAll", query = "SELECT d FROM DetPlaAlumno d")
    , @NamedQuery(name = "DetPlaAlumno.findByDetPlaAluIdPk", query = "SELECT d FROM DetPlaAlumno d WHERE d.detPlaAluIdPk = :detPlaAluIdPk")
    , @NamedQuery(name = "DetPlaAlumno.findByDetPlaAluSalario", query = "SELECT d FROM DetPlaAlumno d WHERE d.detPlaAluSalario = :detPlaAluSalario")
    , @NamedQuery(name = "DetPlaAlumno.findByDetPlaAluEmpresa", query = "SELECT d FROM DetPlaAlumno d WHERE d.detPlaAluEmpresa = :detPlaAluEmpresa")
    , @NamedQuery(name = "DetPlaAlumno.findByDetPlaAluTiempoexperiencia", query = "SELECT d FROM DetPlaAlumno d WHERE d.detPlaAluTiempoexperiencia = :detPlaAluTiempoexperiencia")
    , @NamedQuery(name = "DetPlaAlumno.findByDetPlaAluContacto", query = "SELECT d FROM DetPlaAlumno d WHERE d.detPlaAluContacto = :detPlaAluContacto")
    , @NamedQuery(name = "DetPlaAlumno.findByDetPlaAluObservacion", query = "SELECT d FROM DetPlaAlumno d WHERE d.detPlaAluObservacion = :detPlaAluObservacion")
    , @NamedQuery(name = "DetPlaAlumno.findByDetPlaAluTipoplaza", query = "SELECT d FROM DetPlaAlumno d WHERE d.detPlaAluTipoplaza = :detPlaAluTipoplaza")})
public class DetPlaAlumno implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "DET_PLA_ALU_ID_PK", nullable = false)
    private Integer detPlaAluIdPk;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "DET_PLA_ALU_SALARIO", precision = 4, scale = 2)
    private BigDecimal detPlaAluSalario;
    @Column(name = "DET_PLA_ALU_EMPRESA", length = 125)
    private String detPlaAluEmpresa;
    @Column(name = "DET_PLA_ALU_TIEMPOEXPERIENCIA")
    private Short detPlaAluTiempoexperiencia;
    @Column(name = "DET_PLA_ALU_CONTACTO", length = 60)
    private String detPlaAluContacto;
    @Column(name = "DET_PLA_ALU_OBSERVACION", length = 500)
    private String detPlaAluObservacion;
    @Column(name = "DET_PLA_ALU_TIPOPLAZA", length = 40)
    private String detPlaAluTipoplaza;
    @JoinColumn(name = "ALU_ID_FK", referencedColumnName = "ALU_ID_PK", nullable = false)
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Alumno aluIdFk;
    @JoinColumn(name = "EST_PLA_ID_FK", referencedColumnName = "EST_PLA_ID_PK", nullable = false)
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private EstPlaza estPlaIdFk;
    @JoinColumn(name = "PLA_ID_FK", referencedColumnName = "PLA_ID_PK", nullable = false)
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Plaza plaIdFk;

    public DetPlaAlumno() {
    }

    public DetPlaAlumno(Integer detPlaAluIdPk) {
        this.detPlaAluIdPk = detPlaAluIdPk;
    }

    public Integer getDetPlaAluIdPk() {
        return detPlaAluIdPk;
    }

    public void setDetPlaAluIdPk(Integer detPlaAluIdPk) {
        this.detPlaAluIdPk = detPlaAluIdPk;
    }

    public BigDecimal getDetPlaAluSalario() {
        return detPlaAluSalario;
    }

    public void setDetPlaAluSalario(BigDecimal detPlaAluSalario) {
        this.detPlaAluSalario = detPlaAluSalario;
    }

    public String getDetPlaAluEmpresa() {
        return detPlaAluEmpresa;
    }

    public void setDetPlaAluEmpresa(String detPlaAluEmpresa) {
        this.detPlaAluEmpresa = detPlaAluEmpresa;
    }

    public Short getDetPlaAluTiempoexperiencia() {
        return detPlaAluTiempoexperiencia;
    }

    public void setDetPlaAluTiempoexperiencia(Short detPlaAluTiempoexperiencia) {
        this.detPlaAluTiempoexperiencia = detPlaAluTiempoexperiencia;
    }

    public String getDetPlaAluContacto() {
        return detPlaAluContacto;
    }

    public void setDetPlaAluContacto(String detPlaAluContacto) {
        this.detPlaAluContacto = detPlaAluContacto;
    }

    public String getDetPlaAluObservacion() {
        return detPlaAluObservacion;
    }

    public void setDetPlaAluObservacion(String detPlaAluObservacion) {
        this.detPlaAluObservacion = detPlaAluObservacion;
    }

    public String getDetPlaAluTipoplaza() {
        return detPlaAluTipoplaza;
    }

    public void setDetPlaAluTipoplaza(String detPlaAluTipoplaza) {
        this.detPlaAluTipoplaza = detPlaAluTipoplaza;
    }

    public Alumno getAluIdFk() {
        return aluIdFk;
    }

    public void setAluIdFk(Alumno aluIdFk) {
        this.aluIdFk = aluIdFk;
    }

    public EstPlaza getEstPlaIdFk() {
        return estPlaIdFk;
    }

    public void setEstPlaIdFk(EstPlaza estPlaIdFk) {
        this.estPlaIdFk = estPlaIdFk;
    }

    public Plaza getPlaIdFk() {
        return plaIdFk;
    }

    public void setPlaIdFk(Plaza plaIdFk) {
        this.plaIdFk = plaIdFk;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (detPlaAluIdPk != null ? detPlaAluIdPk.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetPlaAlumno)) {
            return false;
        }
        DetPlaAlumno other = (DetPlaAlumno) object;
        if ((this.detPlaAluIdPk == null && other.detPlaAluIdPk != null) || (this.detPlaAluIdPk != null && !this.detPlaAluIdPk.equals(other.detPlaAluIdPk))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.bitlab.entidades.DetPlaAlumno[ detPlaAluIdPk=" + detPlaAluIdPk + " ]";
    }
    
}
