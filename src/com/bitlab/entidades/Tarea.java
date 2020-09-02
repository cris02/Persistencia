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
@Table(name = "BIT_TAREA", catalog = "BITLABCURSOS", schema = "")
@NamedQueries({
    @NamedQuery(name = "Tarea.findAll", query = "SELECT t FROM Tarea t")
    , @NamedQuery(name = "Tarea.findByTarIdPk", query = "SELECT t FROM Tarea t WHERE t.tarIdPk = :tarIdPk")
    , @NamedQuery(name = "Tarea.findByTarNombre", query = "SELECT t FROM Tarea t WHERE t.tarNombre = :tarNombre")
    , @NamedQuery(name = "Tarea.findByTarFechaInicio", query = "SELECT t FROM Tarea t WHERE t.tarFechaInicio = :tarFechaInicio")})
public class Tarea implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "TAR_ID_PK", nullable = false)
    private Integer tarIdPk;
    @Column(name = "TAR_NOMBRE", length = 100)
    private String tarNombre;
    @Column(name = "TAR_FECHA_INICIO")
    @Temporal(TemporalType.DATE)
    private Date tarFechaInicio;
    @JoinColumn(name = "PRO_ID_FK", referencedColumnName = "PRO_ID_PK", nullable = false)
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Profesor proIdFk;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tarIdFk", fetch = FetchType.EAGER)
    private List<DetAluTarea> detAluTareaList;

    public Tarea() {
    }

    public Tarea(Integer tarIdPk) {
        this.tarIdPk = tarIdPk;
    }

    public Integer getTarIdPk() {
        return tarIdPk;
    }

    public void setTarIdPk(Integer tarIdPk) {
        this.tarIdPk = tarIdPk;
    }

    public String getTarNombre() {
        return tarNombre;
    }

    public void setTarNombre(String tarNombre) {
        this.tarNombre = tarNombre;
    }

    public Date getTarFechaInicio() {
        return tarFechaInicio;
    }

    public void setTarFechaInicio(Date tarFechaInicio) {
        this.tarFechaInicio = tarFechaInicio;
    }

    public Profesor getProIdFk() {
        return proIdFk;
    }

    public void setProIdFk(Profesor proIdFk) {
        this.proIdFk = proIdFk;
    }

    public List<DetAluTarea> getDetAluTareaList() {
        return detAluTareaList;
    }

    public void setDetAluTareaList(List<DetAluTarea> detAluTareaList) {
        this.detAluTareaList = detAluTareaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tarIdPk != null ? tarIdPk.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tarea)) {
            return false;
        }
        Tarea other = (Tarea) object;
        if ((this.tarIdPk == null && other.tarIdPk != null) || (this.tarIdPk != null && !this.tarIdPk.equals(other.tarIdPk))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.bitlab.entidades.Tarea[ tarIdPk=" + tarIdPk + " ]";
    }
    
}
