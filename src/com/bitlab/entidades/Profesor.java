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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Aguilar
 */
@Entity
@Table(name = "BIT_PROFESOR", catalog = "BITLABCURSOS", schema = "")
@NamedQueries({
    @NamedQuery(name = "Profesor.findAll", query = "SELECT p FROM Profesor p")
    , @NamedQuery(name = "Profesor.findByProIdPk", query = "SELECT p FROM Profesor p WHERE p.proIdPk = :proIdPk")
    , @NamedQuery(name = "Profesor.findByProNombres", query = "SELECT p FROM Profesor p WHERE p.proNombres = :proNombres")
    , @NamedQuery(name = "Profesor.findByProApellidos", query = "SELECT p FROM Profesor p WHERE p.proApellidos = :proApellidos")
    , @NamedQuery(name = "Profesor.findByProTelefono", query = "SELECT p FROM Profesor p WHERE p.proTelefono = :proTelefono")
    , @NamedQuery(name = "Profesor.findByProCorreo", query = "SELECT p FROM Profesor p WHERE p.proCorreo = :proCorreo")
    , @NamedQuery(name = "Profesor.findByProDireccion", query = "SELECT p FROM Profesor p WHERE p.proDireccion = :proDireccion")
    , @NamedQuery(name = "Profesor.findByProTitulo", query = "SELECT p FROM Profesor p WHERE p.proTitulo = :proTitulo")})
public class Profesor implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "PRO_ID_PK", nullable = false)
    private Integer proIdPk;
    @Column(name = "PRO_NOMBRES", length = 50)
    private String proNombres;
    @Column(name = "PRO_APELLIDOS", length = 50)
    private String proApellidos;
    @Column(name = "PRO_TELEFONO", length = 13)
    private String proTelefono;
    @Column(name = "PRO_CORREO", length = 60)
    private String proCorreo;
    @Column(name = "PRO_DIRECCION", length = 200)
    private String proDireccion;
    @Column(name = "PRO_TITULO", length = 70)
    private String proTitulo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "proIdFk", fetch = FetchType.EAGER)
    private List<Tarea> tareaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "proIdFk", fetch = FetchType.EAGER)
    private List<Curso> cursoList;
    @JoinColumn(name = "USU_ID_FK", referencedColumnName = "USU_ID_PK", nullable = false)
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Usuario usuIdFk;

    public Profesor() {
    }

    public Profesor(Integer proIdPk) {
        this.proIdPk = proIdPk;
    }

    public Integer getProIdPk() {
        return proIdPk;
    }

    public void setProIdPk(Integer proIdPk) {
        this.proIdPk = proIdPk;
    }

    public String getProNombres() {
        return proNombres;
    }

    public void setProNombres(String proNombres) {
        this.proNombres = proNombres;
    }

    public String getProApellidos() {
        return proApellidos;
    }

    public void setProApellidos(String proApellidos) {
        this.proApellidos = proApellidos;
    }

    public String getProTelefono() {
        return proTelefono;
    }

    public void setProTelefono(String proTelefono) {
        this.proTelefono = proTelefono;
    }

    public String getProCorreo() {
        return proCorreo;
    }

    public void setProCorreo(String proCorreo) {
        this.proCorreo = proCorreo;
    }

    public String getProDireccion() {
        return proDireccion;
    }

    public void setProDireccion(String proDireccion) {
        this.proDireccion = proDireccion;
    }

    public String getProTitulo() {
        return proTitulo;
    }

    public void setProTitulo(String proTitulo) {
        this.proTitulo = proTitulo;
    }

    public List<Tarea> getTareaList() {
        return tareaList;
    }

    public void setTareaList(List<Tarea> tareaList) {
        this.tareaList = tareaList;
    }

    public List<Curso> getCursoList() {
        return cursoList;
    }

    public void setCursoList(List<Curso> cursoList) {
        this.cursoList = cursoList;
    }

    public Usuario getUsuIdFk() {
        return usuIdFk;
    }

    public void setUsuIdFk(Usuario usuIdFk) {
        this.usuIdFk = usuIdFk;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (proIdPk != null ? proIdPk.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Profesor)) {
            return false;
        }
        Profesor other = (Profesor) object;
        if ((this.proIdPk == null && other.proIdPk != null) || (this.proIdPk != null && !this.proIdPk.equals(other.proIdPk))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.bitlab.entidades.Profesor[ proIdPk=" + proIdPk + " ]";
    }
    
}
