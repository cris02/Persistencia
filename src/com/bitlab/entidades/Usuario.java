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
@Table(name = "BIT_USUARIO", catalog = "BITLABCURSOS", schema = "")
@NamedQueries({
    @NamedQuery(name = "Usuario.findAll", query = "SELECT u FROM Usuario u")
    , @NamedQuery(name = "Usuario.findByUsuIdPk", query = "SELECT u FROM Usuario u WHERE u.usuIdPk = :usuIdPk")
    , @NamedQuery(name = "Usuario.findByUsuUser", query = "SELECT u FROM Usuario u WHERE u.usuUser = :usuUser")
    , @NamedQuery(name = "Usuario.findByUsuPass", query = "SELECT u FROM Usuario u WHERE u.usuPass = :usuPass")
    , @NamedQuery(name = "Usuario.findByUsuFechacreacion", query = "SELECT u FROM Usuario u WHERE u.usuFechacreacion = :usuFechacreacion")
    , @NamedQuery(name = "Usuario.findByUsuFechamodificacion", query = "SELECT u FROM Usuario u WHERE u.usuFechamodificacion = :usuFechamodificacion")
    , @NamedQuery(name = "Usuario.findByUsuEstado", query = "SELECT u FROM Usuario u WHERE u.usuEstado = :usuEstado")})
public class Usuario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "USU_ID_PK", nullable = false)
    private Integer usuIdPk;
    @Column(name = "USU_USER", length = 80)
    private String usuUser;
    @Column(name = "USU_PASS", length = 80)
    private String usuPass;
    @Column(name = "USU_FECHACREACION")
    @Temporal(TemporalType.DATE)
    private Date usuFechacreacion;
    @Column(name = "USU_FECHAMODIFICACION")
    @Temporal(TemporalType.DATE)
    private Date usuFechamodificacion;
    @Column(name = "USU_ESTADO")
    private Boolean usuEstado;
    @OneToMany(mappedBy = "usuIdFk", fetch = FetchType.EAGER)
    private List<Evaluador> evaluadorList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "usuIdFk", fetch = FetchType.EAGER)
    private List<Alumno> alumnoList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "usuIdFk", fetch = FetchType.EAGER)
    private List<Profesor> profesorList;
    @JoinColumn(name = "ROL_ID_FK", referencedColumnName = "ROL_ID_PK", nullable = false)
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Rol rolIdFk;

    public Usuario() {
    }

    public Usuario(Integer usuIdPk) {
        this.usuIdPk = usuIdPk;
    }

    public Integer getUsuIdPk() {
        return usuIdPk;
    }

    public void setUsuIdPk(Integer usuIdPk) {
        this.usuIdPk = usuIdPk;
    }

    public String getUsuUser() {
        return usuUser;
    }

    public void setUsuUser(String usuUser) {
        this.usuUser = usuUser;
    }

    public String getUsuPass() {
        return usuPass;
    }

    public void setUsuPass(String usuPass) {
        this.usuPass = usuPass;
    }

    public Date getUsuFechacreacion() {
        return usuFechacreacion;
    }

    public void setUsuFechacreacion(Date usuFechacreacion) {
        this.usuFechacreacion = usuFechacreacion;
    }

    public Date getUsuFechamodificacion() {
        return usuFechamodificacion;
    }

    public void setUsuFechamodificacion(Date usuFechamodificacion) {
        this.usuFechamodificacion = usuFechamodificacion;
    }

    public Boolean getUsuEstado() {
        return usuEstado;
    }

    public void setUsuEstado(Boolean usuEstado) {
        this.usuEstado = usuEstado;
    }

    public List<Evaluador> getEvaluadorList() {
        return evaluadorList;
    }

    public void setEvaluadorList(List<Evaluador> evaluadorList) {
        this.evaluadorList = evaluadorList;
    }

    public List<Alumno> getAlumnoList() {
        return alumnoList;
    }

    public void setAlumnoList(List<Alumno> alumnoList) {
        this.alumnoList = alumnoList;
    }

    public List<Profesor> getProfesorList() {
        return profesorList;
    }

    public void setProfesorList(List<Profesor> profesorList) {
        this.profesorList = profesorList;
    }

    public Rol getRolIdFk() {
        return rolIdFk;
    }

    public void setRolIdFk(Rol rolIdFk) {
        this.rolIdFk = rolIdFk;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (usuIdPk != null ? usuIdPk.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usuario)) {
            return false;
        }
        Usuario other = (Usuario) object;
        if ((this.usuIdPk == null && other.usuIdPk != null) || (this.usuIdPk != null && !this.usuIdPk.equals(other.usuIdPk))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.bitlab.entidades.Usuario[ usuIdPk=" + usuIdPk + " ]";
    }
    
}
