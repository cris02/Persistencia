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
@Table(name = "BIT_PERFIL", catalog = "BITLABCURSOS", schema = "")
@NamedQueries({
    @NamedQuery(name = "Perfil.findAll", query = "SELECT p FROM Perfil p")
    , @NamedQuery(name = "Perfil.findByPerIdPk", query = "SELECT p FROM Perfil p WHERE p.perIdPk = :perIdPk")
    , @NamedQuery(name = "Perfil.findByPerFoto", query = "SELECT p FROM Perfil p WHERE p.perFoto = :perFoto")
    , @NamedQuery(name = "Perfil.findByPerCv", query = "SELECT p FROM Perfil p WHERE p.perCv = :perCv")
    , @NamedQuery(name = "Perfil.findByPerNivelacademico", query = "SELECT p FROM Perfil p WHERE p.perNivelacademico = :perNivelacademico")
    , @NamedQuery(name = "Perfil.findByPerIdioma", query = "SELECT p FROM Perfil p WHERE p.perIdioma = :perIdioma")
    , @NamedQuery(name = "Perfil.findByPerEstadolaboral", query = "SELECT p FROM Perfil p WHERE p.perEstadolaboral = :perEstadolaboral")
    , @NamedQuery(name = "Perfil.findByPerFechacreacion", query = "SELECT p FROM Perfil p WHERE p.perFechacreacion = :perFechacreacion")})
public class Perfil implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "PER_ID_PK", nullable = false)
    private Integer perIdPk;
    @Column(name = "PER_FOTO", length = 255)
    private String perFoto;
    @Column(name = "PER_CV", length = 255)
    private String perCv;
    @Column(name = "PER_NIVELACADEMICO", length = 150)
    private String perNivelacademico;
    @Column(name = "PER_IDIOMA", length = 40)
    private String perIdioma;
    @Column(name = "PER_ESTADOLABORAL", length = 40)
    private String perEstadolaboral;
    @Column(name = "PER_FECHACREACION")
    @Temporal(TemporalType.DATE)
    private Date perFechacreacion;
    @JoinColumn(name = "EST_PER_ID_FK", referencedColumnName = "EST_PER_ID_PK", nullable = false)
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private EstPerfil estPerIdFk;
    @JoinColumn(name = "ALU_ID_FK", referencedColumnName = "ALU_ID_PK", nullable = false)
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Alumno aluIdFk;
    @OneToMany(mappedBy = "perIdFk", fetch = FetchType.EAGER)
    private List<DetPlaAlumno> detPlaAlumnoList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "perIdFk", fetch = FetchType.EAGER)
    private List<DetPerTecnologia> detPerTecnologiaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "perIdFk", fetch = FetchType.EAGER)
    private List<DetAluActseleccion> detAluActseleccionList;

    public Perfil() {
    }

    public Perfil(Integer perIdPk) {
        this.perIdPk = perIdPk;
    }

    public Integer getPerIdPk() {
        return perIdPk;
    }

    public void setPerIdPk(Integer perIdPk) {
        this.perIdPk = perIdPk;
    }

    public String getPerFoto() {
        return perFoto;
    }

    public void setPerFoto(String perFoto) {
        this.perFoto = perFoto;
    }

    public String getPerCv() {
        return perCv;
    }

    public void setPerCv(String perCv) {
        this.perCv = perCv;
    }

    public String getPerNivelacademico() {
        return perNivelacademico;
    }

    public void setPerNivelacademico(String perNivelacademico) {
        this.perNivelacademico = perNivelacademico;
    }

    public String getPerIdioma() {
        return perIdioma;
    }

    public void setPerIdioma(String perIdioma) {
        this.perIdioma = perIdioma;
    }

    public String getPerEstadolaboral() {
        return perEstadolaboral;
    }

    public void setPerEstadolaboral(String perEstadolaboral) {
        this.perEstadolaboral = perEstadolaboral;
    }

    public Date getPerFechacreacion() {
        return perFechacreacion;
    }

    public void setPerFechacreacion(Date perFechacreacion) {
        this.perFechacreacion = perFechacreacion;
    }

    public EstPerfil getEstPerIdFk() {
        return estPerIdFk;
    }

    public void setEstPerIdFk(EstPerfil estPerIdFk) {
        this.estPerIdFk = estPerIdFk;
    }

    public Alumno getAluIdFk() {
        return aluIdFk;
    }

    public void setAluIdFk(Alumno aluIdFk) {
        this.aluIdFk = aluIdFk;
    }

    public List<DetPlaAlumno> getDetPlaAlumnoList() {
        return detPlaAlumnoList;
    }

    public void setDetPlaAlumnoList(List<DetPlaAlumno> detPlaAlumnoList) {
        this.detPlaAlumnoList = detPlaAlumnoList;
    }

    public List<DetPerTecnologia> getDetPerTecnologiaList() {
        return detPerTecnologiaList;
    }

    public void setDetPerTecnologiaList(List<DetPerTecnologia> detPerTecnologiaList) {
        this.detPerTecnologiaList = detPerTecnologiaList;
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
        hash += (perIdPk != null ? perIdPk.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Perfil)) {
            return false;
        }
        Perfil other = (Perfil) object;
        if ((this.perIdPk == null && other.perIdPk != null) || (this.perIdPk != null && !this.perIdPk.equals(other.perIdPk))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.bitlab.entidades.Perfil[ perIdPk=" + perIdPk + " ]";
    }
    
}
