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
@Table(name = "BIT_CURSO", catalog = "BITLABCURSOS", schema = "")
@NamedQueries({
    @NamedQuery(name = "Curso.findAll", query = "SELECT c FROM Curso c")
    , @NamedQuery(name = "Curso.findByCurIdPk", query = "SELECT c FROM Curso c WHERE c.curIdPk = :curIdPk")
    , @NamedQuery(name = "Curso.findByCurNombre", query = "SELECT c FROM Curso c WHERE c.curNombre = :curNombre")
    , @NamedQuery(name = "Curso.findByCurDescripcion", query = "SELECT c FROM Curso c WHERE c.curDescripcion = :curDescripcion")
    , @NamedQuery(name = "Curso.findByCurFechaInicio", query = "SELECT c FROM Curso c WHERE c.curFechaInicio = :curFechaInicio")
    , @NamedQuery(name = "Curso.findByCurFechaFin", query = "SELECT c FROM Curso c WHERE c.curFechaFin = :curFechaFin")
    , @NamedQuery(name = "Curso.findByCurCupo", query = "SELECT c FROM Curso c WHERE c.curCupo = :curCupo")
    , @NamedQuery(name = "Curso.findByCurHorario", query = "SELECT c FROM Curso c WHERE c.curHorario = :curHorario")
    , @NamedQuery(name = "Curso.findByCurDiasClase", query = "SELECT c FROM Curso c WHERE c.curDiasClase = :curDiasClase")})
public class Curso implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "CUR_ID_PK", nullable = false)
    private Integer curIdPk;
    @Column(name = "CUR_NOMBRE", length = 175)
    private String curNombre;
    @Column(name = "CUR_DESCRIPCION", length = 500)
    private String curDescripcion;
    @Column(name = "CUR_FECHA_INICIO")
    @Temporal(TemporalType.DATE)
    private Date curFechaInicio;
    @Column(name = "CUR_FECHA_FIN")
    @Temporal(TemporalType.DATE)
    private Date curFechaFin;
    @Column(name = "CUR_CUPO")
    private Short curCupo;
    @Column(name = "CUR_HORARIO", length = 30)
    private String curHorario;
    @Column(name = "CUR_DIAS_CLASE", length = 100)
    private String curDiasClase;
    @JoinColumn(name = "EVA_ID_FK", referencedColumnName = "EVA_ID_PK", nullable = false)
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Evaluador evaIdFk;
    @JoinColumn(name = "PRO_ID_FK", referencedColumnName = "PRO_ID_PK", nullable = false)
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Profesor proIdFk;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "curIdFk", fetch = FetchType.EAGER)
    private List<Pregunta> preguntaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "curIdFk", fetch = FetchType.EAGER)
    private List<ActSeleccion> actSeleccionList;

    public Curso() {
    }

    public Curso(Integer curIdPk) {
        this.curIdPk = curIdPk;
    }

    public Integer getCurIdPk() {
        return curIdPk;
    }

    public void setCurIdPk(Integer curIdPk) {
        this.curIdPk = curIdPk;
    }

    public String getCurNombre() {
        return curNombre;
    }

    public void setCurNombre(String curNombre) {
        this.curNombre = curNombre;
    }

    public String getCurDescripcion() {
        return curDescripcion;
    }

    public void setCurDescripcion(String curDescripcion) {
        this.curDescripcion = curDescripcion;
    }

    public Date getCurFechaInicio() {
        return curFechaInicio;
    }

    public void setCurFechaInicio(Date curFechaInicio) {
        this.curFechaInicio = curFechaInicio;
    }

    public Date getCurFechaFin() {
        return curFechaFin;
    }

    public void setCurFechaFin(Date curFechaFin) {
        this.curFechaFin = curFechaFin;
    }

    public Short getCurCupo() {
        return curCupo;
    }

    public void setCurCupo(Short curCupo) {
        this.curCupo = curCupo;
    }

    public String getCurHorario() {
        return curHorario;
    }

    public void setCurHorario(String curHorario) {
        this.curHorario = curHorario;
    }

    public String getCurDiasClase() {
        return curDiasClase;
    }

    public void setCurDiasClase(String curDiasClase) {
        this.curDiasClase = curDiasClase;
    }

    public Evaluador getEvaIdFk() {
        return evaIdFk;
    }

    public void setEvaIdFk(Evaluador evaIdFk) {
        this.evaIdFk = evaIdFk;
    }

    public Profesor getProIdFk() {
        return proIdFk;
    }

    public void setProIdFk(Profesor proIdFk) {
        this.proIdFk = proIdFk;
    }

    public List<Pregunta> getPreguntaList() {
        return preguntaList;
    }

    public void setPreguntaList(List<Pregunta> preguntaList) {
        this.preguntaList = preguntaList;
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
        hash += (curIdPk != null ? curIdPk.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Curso)) {
            return false;
        }
        Curso other = (Curso) object;
        if ((this.curIdPk == null && other.curIdPk != null) || (this.curIdPk != null && !this.curIdPk.equals(other.curIdPk))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.bitlab.entidades.Curso[ curIdPk=" + curIdPk + " ]";
    }
    
}
