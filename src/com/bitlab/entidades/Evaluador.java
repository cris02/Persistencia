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
@Table(name = "BIT_EVALUADOR", catalog = "BITLABCURSOS", schema = "")
@NamedQueries({
    @NamedQuery(name = "Evaluador.findAll", query = "SELECT e FROM Evaluador e")
    , @NamedQuery(name = "Evaluador.findByEvaIdPk", query = "SELECT e FROM Evaluador e WHERE e.evaIdPk = :evaIdPk")
    , @NamedQuery(name = "Evaluador.findByEvaNombres", query = "SELECT e FROM Evaluador e WHERE e.evaNombres = :evaNombres")
    , @NamedQuery(name = "Evaluador.findByEvaApellidos", query = "SELECT e FROM Evaluador e WHERE e.evaApellidos = :evaApellidos")
    , @NamedQuery(name = "Evaluador.findByEvaTel", query = "SELECT e FROM Evaluador e WHERE e.evaTel = :evaTel")
    , @NamedQuery(name = "Evaluador.findByEvaDui", query = "SELECT e FROM Evaluador e WHERE e.evaDui = :evaDui")
    , @NamedQuery(name = "Evaluador.findByEvaDireccion", query = "SELECT e FROM Evaluador e WHERE e.evaDireccion = :evaDireccion")
    , @NamedQuery(name = "Evaluador.findByEvaFechaNac", query = "SELECT e FROM Evaluador e WHERE e.evaFechaNac = :evaFechaNac")
    , @NamedQuery(name = "Evaluador.findByEvaSexo", query = "SELECT e FROM Evaluador e WHERE e.evaSexo = :evaSexo")
    , @NamedQuery(name = "Evaluador.findByEvaCorreo", query = "SELECT e FROM Evaluador e WHERE e.evaCorreo = :evaCorreo")})
public class Evaluador implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "EVA_ID_PK", nullable = false)
    private Integer evaIdPk;
    @Column(name = "EVA_NOMBRES", length = 50)
    private String evaNombres;
    @Column(name = "EVA_APELLIDOS", length = 50)
    private String evaApellidos;
    @Column(name = "EVA_TEL", length = 13)
    private String evaTel;
    @Column(name = "EVA_DUI", length = 12)
    private String evaDui;
    @Column(name = "EVA_DIRECCION", length = 200)
    private String evaDireccion;
    @Column(name = "EVA_FECHA_NAC")
    @Temporal(TemporalType.DATE)
    private Date evaFechaNac;
    @Column(name = "EVA_SEXO")
    private Character evaSexo;
    @Column(name = "EVA_CORREO", length = 60)
    private String evaCorreo;
    @JoinColumn(name = "USU_ID_FK", referencedColumnName = "USU_ID_PK")
    @ManyToOne(fetch = FetchType.EAGER)
    private Usuario usuIdFk;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "evaIdFk", fetch = FetchType.EAGER)
    private List<Curso> cursoList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "evaIdFk", fetch = FetchType.EAGER)
    private List<Plaza> plazaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "evaIdFk", fetch = FetchType.EAGER)
    private List<ActSeleccion> actSeleccionList;

    public Evaluador() {
    }

    public Evaluador(Integer evaIdPk) {
        this.evaIdPk = evaIdPk;
    }

    public Integer getEvaIdPk() {
        return evaIdPk;
    }

    public void setEvaIdPk(Integer evaIdPk) {
        this.evaIdPk = evaIdPk;
    }

    public String getEvaNombres() {
        return evaNombres;
    }

    public void setEvaNombres(String evaNombres) {
        this.evaNombres = evaNombres;
    }

    public String getEvaApellidos() {
        return evaApellidos;
    }

    public void setEvaApellidos(String evaApellidos) {
        this.evaApellidos = evaApellidos;
    }

    public String getEvaTel() {
        return evaTel;
    }

    public void setEvaTel(String evaTel) {
        this.evaTel = evaTel;
    }

    public String getEvaDui() {
        return evaDui;
    }

    public void setEvaDui(String evaDui) {
        this.evaDui = evaDui;
    }

    public String getEvaDireccion() {
        return evaDireccion;
    }

    public void setEvaDireccion(String evaDireccion) {
        this.evaDireccion = evaDireccion;
    }

    public Date getEvaFechaNac() {
        return evaFechaNac;
    }

    public void setEvaFechaNac(Date evaFechaNac) {
        this.evaFechaNac = evaFechaNac;
    }

    public Character getEvaSexo() {
        return evaSexo;
    }

    public void setEvaSexo(Character evaSexo) {
        this.evaSexo = evaSexo;
    }

    public String getEvaCorreo() {
        return evaCorreo;
    }

    public void setEvaCorreo(String evaCorreo) {
        this.evaCorreo = evaCorreo;
    }

    public Usuario getUsuIdFk() {
        return usuIdFk;
    }

    public void setUsuIdFk(Usuario usuIdFk) {
        this.usuIdFk = usuIdFk;
    }

    public List<Curso> getCursoList() {
        return cursoList;
    }

    public void setCursoList(List<Curso> cursoList) {
        this.cursoList = cursoList;
    }

    public List<Plaza> getPlazaList() {
        return plazaList;
    }

    public void setPlazaList(List<Plaza> plazaList) {
        this.plazaList = plazaList;
    }

    public List<ActSeleccion> getActSeleccionList() {
        return actSeleccionList;
    }

    public void setActSeleccionList(List<ActSeleccion> actSeleccionList) {
        this.actSeleccionList = actSeleccionList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (evaIdPk != null ? evaIdPk.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Evaluador)) {
            return false;
        }
        Evaluador other = (Evaluador) object;
        if ((this.evaIdPk == null && other.evaIdPk != null) || (this.evaIdPk != null && !this.evaIdPk.equals(other.evaIdPk))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.bitlab.entidades.Evaluador[ evaIdPk=" + evaIdPk + " ]";
    }
    
}
