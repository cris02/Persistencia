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
@Table(name = "BIT_DET_PER_TECNOLOGIA", catalog = "BITLABCURSOS", schema = "")
@NamedQueries({
    @NamedQuery(name = "DetPerTecnologia.findAll", query = "SELECT d FROM DetPerTecnologia d")
    , @NamedQuery(name = "DetPerTecnologia.findByDetPerTecIdPk", query = "SELECT d FROM DetPerTecnologia d WHERE d.detPerTecIdPk = :detPerTecIdPk")
    , @NamedQuery(name = "DetPerTecnologia.findByDetPerTecNivel", query = "SELECT d FROM DetPerTecnologia d WHERE d.detPerTecNivel = :detPerTecNivel")
    , @NamedQuery(name = "DetPerTecnologia.findByDetPerTecSkills", query = "SELECT d FROM DetPerTecnologia d WHERE d.detPerTecSkills = :detPerTecSkills")})
public class DetPerTecnologia implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "DET_PER_TEC_ID_PK", nullable = false)
    private Integer detPerTecIdPk;
    @Column(name = "DET_PER_TEC_NIVEL", length = 30)
    private String detPerTecNivel;
    @Column(name = "DET_PER_TEC_SKILLS", length = 500)
    private String detPerTecSkills;
    @JoinColumn(name = "PER_ID_FK", referencedColumnName = "PER_ID_PK", nullable = false)
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Perfil perIdFk;
    @JoinColumn(name = "TEC_ID_FK", referencedColumnName = "TEC_ID_PK", nullable = false)
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Tecnologia tecIdFk;

    public DetPerTecnologia() {
    }

    public DetPerTecnologia(Integer detPerTecIdPk) {
        this.detPerTecIdPk = detPerTecIdPk;
    }

    public Integer getDetPerTecIdPk() {
        return detPerTecIdPk;
    }

    public void setDetPerTecIdPk(Integer detPerTecIdPk) {
        this.detPerTecIdPk = detPerTecIdPk;
    }

    public String getDetPerTecNivel() {
        return detPerTecNivel;
    }

    public void setDetPerTecNivel(String detPerTecNivel) {
        this.detPerTecNivel = detPerTecNivel;
    }

    public String getDetPerTecSkills() {
        return detPerTecSkills;
    }

    public void setDetPerTecSkills(String detPerTecSkills) {
        this.detPerTecSkills = detPerTecSkills;
    }

    public Perfil getPerIdFk() {
        return perIdFk;
    }

    public void setPerIdFk(Perfil perIdFk) {
        this.perIdFk = perIdFk;
    }

    public Tecnologia getTecIdFk() {
        return tecIdFk;
    }

    public void setTecIdFk(Tecnologia tecIdFk) {
        this.tecIdFk = tecIdFk;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (detPerTecIdPk != null ? detPerTecIdPk.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetPerTecnologia)) {
            return false;
        }
        DetPerTecnologia other = (DetPerTecnologia) object;
        if ((this.detPerTecIdPk == null && other.detPerTecIdPk != null) || (this.detPerTecIdPk != null && !this.detPerTecIdPk.equals(other.detPerTecIdPk))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.bitlab.entidades.DetPerTecnologia[ detPerTecIdPk=" + detPerTecIdPk + " ]";
    }
    
}
