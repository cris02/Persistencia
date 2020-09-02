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
@Table(name = "BIT_TECNOLOGIA", catalog = "BITLABCURSOS", schema = "")
@NamedQueries({
    @NamedQuery(name = "Tecnologia.findAll", query = "SELECT t FROM Tecnologia t")
    , @NamedQuery(name = "Tecnologia.findByTecIdPk", query = "SELECT t FROM Tecnologia t WHERE t.tecIdPk = :tecIdPk")
    , @NamedQuery(name = "Tecnologia.findByTecNombre", query = "SELECT t FROM Tecnologia t WHERE t.tecNombre = :tecNombre")
    , @NamedQuery(name = "Tecnologia.findByTecDescripcion", query = "SELECT t FROM Tecnologia t WHERE t.tecDescripcion = :tecDescripcion")})
public class Tecnologia implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "TEC_ID_PK", nullable = false)
    private Integer tecIdPk;
    @Column(name = "TEC_NOMBRE", length = 100)
    private String tecNombre;
    @Column(name = "TEC_DESCRIPCION", length = 200)
    private String tecDescripcion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tecIdFk", fetch = FetchType.EAGER)
    private List<DetPerTecnologia> detPerTecnologiaList;

    public Tecnologia() {
    }

    public Tecnologia(Integer tecIdPk) {
        this.tecIdPk = tecIdPk;
    }

    public Integer getTecIdPk() {
        return tecIdPk;
    }

    public void setTecIdPk(Integer tecIdPk) {
        this.tecIdPk = tecIdPk;
    }

    public String getTecNombre() {
        return tecNombre;
    }

    public void setTecNombre(String tecNombre) {
        this.tecNombre = tecNombre;
    }

    public String getTecDescripcion() {
        return tecDescripcion;
    }

    public void setTecDescripcion(String tecDescripcion) {
        this.tecDescripcion = tecDescripcion;
    }

    public List<DetPerTecnologia> getDetPerTecnologiaList() {
        return detPerTecnologiaList;
    }

    public void setDetPerTecnologiaList(List<DetPerTecnologia> detPerTecnologiaList) {
        this.detPerTecnologiaList = detPerTecnologiaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tecIdPk != null ? tecIdPk.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tecnologia)) {
            return false;
        }
        Tecnologia other = (Tecnologia) object;
        if ((this.tecIdPk == null && other.tecIdPk != null) || (this.tecIdPk != null && !this.tecIdPk.equals(other.tecIdPk))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.bitlab.entidades.Tecnologia[ tecIdPk=" + tecIdPk + " ]";
    }
    
}
