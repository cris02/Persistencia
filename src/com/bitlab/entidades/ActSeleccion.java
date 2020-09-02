/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bitlab.entidades;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "BIT_ACT_SELECCION", catalog = "BITLABCURSOS", schema = "")
@NamedQueries({
    @NamedQuery(name = "ActSeleccion.findAll", query = "SELECT a FROM ActSeleccion a")
    , @NamedQuery(name = "ActSeleccion.findByActSelIdPk", query = "SELECT a FROM ActSeleccion a WHERE a.actSelIdPk = :actSelIdPk")
    , @NamedQuery(name = "ActSeleccion.findByActSelNombre", query = "SELECT a FROM ActSeleccion a WHERE a.actSelNombre = :actSelNombre")
    , @NamedQuery(name = "ActSeleccion.findByActSelPonderacion", query = "SELECT a FROM ActSeleccion a WHERE a.actSelPonderacion = :actSelPonderacion")
    , @NamedQuery(name = "ActSeleccion.findByActSelFechaCreacion", query = "SELECT a FROM ActSeleccion a WHERE a.actSelFechaCreacion = :actSelFechaCreacion")})
public class ActSeleccion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ACT_SEL_ID_PK", nullable = false)
    private Integer actSelIdPk;
    @Column(name = "ACT_SEL_NOMBRE", length = 160)
    private String actSelNombre;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "ACT_SEL_PONDERACION", precision = 3, scale = 2)
    private BigDecimal actSelPonderacion;
    @Column(name = "ACT_SEL_FECHA_CREACION")
    @Temporal(TemporalType.DATE)
    private Date actSelFechaCreacion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "actSelIdFk", fetch = FetchType.EAGER)
    private List<DetAluActseleccion> detAluActseleccionList;
    @JoinColumn(name = "CUR_ID_FK", referencedColumnName = "CUR_ID_PK", nullable = false)
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Curso curIdFk;
    @JoinColumn(name = "EVA_ID_FK", referencedColumnName = "EVA_ID_PK", nullable = false)
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Evaluador evaIdFk;

    public ActSeleccion() {
    }

    public ActSeleccion(Integer actSelIdPk) {
        this.actSelIdPk = actSelIdPk;
    }

    public Integer getActSelIdPk() {
        return actSelIdPk;
    }

    public void setActSelIdPk(Integer actSelIdPk) {
        this.actSelIdPk = actSelIdPk;
    }

    public String getActSelNombre() {
        return actSelNombre;
    }

    public void setActSelNombre(String actSelNombre) {
        this.actSelNombre = actSelNombre;
    }

    public BigDecimal getActSelPonderacion() {
        return actSelPonderacion;
    }

    public void setActSelPonderacion(BigDecimal actSelPonderacion) {
        this.actSelPonderacion = actSelPonderacion;
    }

    public Date getActSelFechaCreacion() {
        return actSelFechaCreacion;
    }

    public void setActSelFechaCreacion(Date actSelFechaCreacion) {
        this.actSelFechaCreacion = actSelFechaCreacion;
    }

    public List<DetAluActseleccion> getDetAluActseleccionList() {
        return detAluActseleccionList;
    }

    public void setDetAluActseleccionList(List<DetAluActseleccion> detAluActseleccionList) {
        this.detAluActseleccionList = detAluActseleccionList;
    }

    public Curso getCurIdFk() {
        return curIdFk;
    }

    public void setCurIdFk(Curso curIdFk) {
        this.curIdFk = curIdFk;
    }

    public Evaluador getEvaIdFk() {
        return evaIdFk;
    }

    public void setEvaIdFk(Evaluador evaIdFk) {
        this.evaIdFk = evaIdFk;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (actSelIdPk != null ? actSelIdPk.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ActSeleccion)) {
            return false;
        }
        ActSeleccion other = (ActSeleccion) object;
        if ((this.actSelIdPk == null && other.actSelIdPk != null) || (this.actSelIdPk != null && !this.actSelIdPk.equals(other.actSelIdPk))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.bitlab.entidades.ActSeleccion[ actSelIdPk=" + actSelIdPk + " ]";
    }
    
}
