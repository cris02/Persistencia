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
@Table(name = "BIT_PREGUNTA", catalog = "BITLABCURSOS", schema = "")
@NamedQueries({
    @NamedQuery(name = "Pregunta.findAll", query = "SELECT p FROM Pregunta p")
    , @NamedQuery(name = "Pregunta.findByPreIdPk", query = "SELECT p FROM Pregunta p WHERE p.preIdPk = :preIdPk")
    , @NamedQuery(name = "Pregunta.findByPreDescripcionpreg", query = "SELECT p FROM Pregunta p WHERE p.preDescripcionpreg = :preDescripcionpreg")
    , @NamedQuery(name = "Pregunta.findByPreFechaCreacion", query = "SELECT p FROM Pregunta p WHERE p.preFechaCreacion = :preFechaCreacion")})
public class Pregunta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "PRE_ID_PK", nullable = false)
    private Integer preIdPk;
    @Column(name = "PRE_DESCRIPCIONPREG", length = 500)
    private String preDescripcionpreg;
    @Column(name = "PRE_FECHA_CREACION")
    @Temporal(TemporalType.DATE)
    private Date preFechaCreacion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "preIdFk", fetch = FetchType.EAGER)
    private List<Respuesta> respuestaList;
    @JoinColumn(name = "CUR_ID_FK", referencedColumnName = "CUR_ID_PK", nullable = false)
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Curso curIdFk;

    public Pregunta() {
    }

    public Pregunta(Integer preIdPk) {
        this.preIdPk = preIdPk;
    }

    public Integer getPreIdPk() {
        return preIdPk;
    }

    public void setPreIdPk(Integer preIdPk) {
        this.preIdPk = preIdPk;
    }

    public String getPreDescripcionpreg() {
        return preDescripcionpreg;
    }

    public void setPreDescripcionpreg(String preDescripcionpreg) {
        this.preDescripcionpreg = preDescripcionpreg;
    }

    public Date getPreFechaCreacion() {
        return preFechaCreacion;
    }

    public void setPreFechaCreacion(Date preFechaCreacion) {
        this.preFechaCreacion = preFechaCreacion;
    }

    public List<Respuesta> getRespuestaList() {
        return respuestaList;
    }

    public void setRespuestaList(List<Respuesta> respuestaList) {
        this.respuestaList = respuestaList;
    }

    public Curso getCurIdFk() {
        return curIdFk;
    }

    public void setCurIdFk(Curso curIdFk) {
        this.curIdFk = curIdFk;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (preIdPk != null ? preIdPk.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pregunta)) {
            return false;
        }
        Pregunta other = (Pregunta) object;
        if ((this.preIdPk == null && other.preIdPk != null) || (this.preIdPk != null && !this.preIdPk.equals(other.preIdPk))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.bitlab.entidades.Pregunta[ preIdPk=" + preIdPk + " ]";
    }
    
}
