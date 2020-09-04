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
@Table(name = "BIT_ALUMNO", catalog = "BITLABCURSOS", schema = "")
@NamedQueries({
    @NamedQuery(name = "Alumno.findAll", query = "SELECT a FROM Alumno a")
    , @NamedQuery(name = "Alumno.findByAluIdPk", query = "SELECT a FROM Alumno a WHERE a.aluIdPk = :aluIdPk")
    , @NamedQuery(name = "Alumno.findByAluNombres", query = "SELECT a FROM Alumno a WHERE a.aluNombres = :aluNombres")
    , @NamedQuery(name = "Alumno.findByAluEdad", query = "SELECT a FROM Alumno a WHERE a.aluEdad = :aluEdad")
    , @NamedQuery(name = "Alumno.findByAluTelefono", query = "SELECT a FROM Alumno a WHERE a.aluTelefono = :aluTelefono")
    , @NamedQuery(name = "Alumno.findByAluDui", query = "SELECT a FROM Alumno a WHERE a.aluDui = :aluDui")
    , @NamedQuery(name = "Alumno.findByAluDireccion", query = "SELECT a FROM Alumno a WHERE a.aluDireccion = :aluDireccion")
    , @NamedQuery(name = "Alumno.findByAluFechaNac", query = "SELECT a FROM Alumno a WHERE a.aluFechaNac = :aluFechaNac")
    , @NamedQuery(name = "Alumno.findByAluGenero", query = "SELECT a FROM Alumno a WHERE a.aluGenero = :aluGenero")
    , @NamedQuery(name = "Alumno.findByAluCorreo", query = "SELECT a FROM Alumno a WHERE a.aluCorreo = :aluCorreo")})
public class Alumno implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ALU_ID_PK", nullable = false)
    private Integer aluIdPk;
    @Column(name = "ALU_NOMBRES", length = 50)
    private String aluNombres;
    @Column(name = "ALU_EDAD")
    private Short aluEdad;
    @Column(name = "ALU_TELEFONO", length = 13)
    private String aluTelefono;
    @Column(name = "ALU_DUI", length = 12)
    private String aluDui;
    @Column(name = "ALU_DIRECCION", length = 200)
    private String aluDireccion;
    @Column(name = "ALU_FECHA_NAC")
    @Temporal(TemporalType.DATE)
    private Date aluFechaNac;
    @Column(name = "ALU_GENERO")
    private Character aluGenero;
    @Column(name = "ALU_CORREO", length = 60)
    private String aluCorreo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "aluIdFk", fetch = FetchType.EAGER)
    private List<Respuesta> respuestaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "aluIdFk", fetch = FetchType.EAGER)
    private List<Perfil> perfilList;
    @JoinColumn(name = "USU_ID_FK", referencedColumnName = "USU_ID_PK", nullable = false)
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Usuario usuIdFk;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "aluIdFk", fetch = FetchType.EAGER)
    private List<DetAluActseleccion> detAluActseleccionList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "aluIdFk", fetch = FetchType.EAGER)
    private List<DetAluTarea> detAluTareaList;

    public Alumno() {
    }

    public Alumno(Integer aluIdPk) {
        this.aluIdPk = aluIdPk;
    }

    public Integer getAluIdPk() {
        return aluIdPk;
    }

    public void setAluIdPk(Integer aluIdPk) {
        this.aluIdPk = aluIdPk;
    }

    public String getAluNombres() {
        return aluNombres;
    }

    public void setAluNombres(String aluNombres) {
        this.aluNombres = aluNombres;
    }

    public Short getAluEdad() {
        return aluEdad;
    }

    public void setAluEdad(Short aluEdad) {
        this.aluEdad = aluEdad;
    }

    public String getAluTelefono() {
        return aluTelefono;
    }

    public void setAluTelefono(String aluTelefono) {
        this.aluTelefono = aluTelefono;
    }

    public String getAluDui() {
        return aluDui;
    }

    public void setAluDui(String aluDui) {
        this.aluDui = aluDui;
    }

    public String getAluDireccion() {
        return aluDireccion;
    }

    public void setAluDireccion(String aluDireccion) {
        this.aluDireccion = aluDireccion;
    }

    public Date getAluFechaNac() {
        return aluFechaNac;
    }

    public void setAluFechaNac(Date aluFechaNac) {
        this.aluFechaNac = aluFechaNac;
    }

    public Character getAluGenero() {
        return aluGenero;
    }

    public void setAluGenero(Character aluGenero) {
        this.aluGenero = aluGenero;
    }

    public String getAluCorreo() {
        return aluCorreo;
    }

    public void setAluCorreo(String aluCorreo) {
        this.aluCorreo = aluCorreo;
    }

    public List<Respuesta> getRespuestaList() {
        return respuestaList;
    }

    public void setRespuestaList(List<Respuesta> respuestaList) {
        this.respuestaList = respuestaList;
    }

    public List<Perfil> getPerfilList() {
        return perfilList;
    }

    public void setPerfilList(List<Perfil> perfilList) {
        this.perfilList = perfilList;
    }

    public Usuario getUsuIdFk() {
        return usuIdFk;
    }

    public void setUsuIdFk(Usuario usuIdFk) {
        this.usuIdFk = usuIdFk;
    }

    public List<DetAluActseleccion> getDetAluActseleccionList() {
        return detAluActseleccionList;
    }

    public void setDetAluActseleccionList(List<DetAluActseleccion> detAluActseleccionList) {
        this.detAluActseleccionList = detAluActseleccionList;
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
        hash += (aluIdPk != null ? aluIdPk.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Alumno)) {
            return false;
        }
        Alumno other = (Alumno) object;
        if ((this.aluIdPk == null && other.aluIdPk != null) || (this.aluIdPk != null && !this.aluIdPk.equals(other.aluIdPk))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.bitlab.entidades.Alumno[ aluIdPk=" + aluIdPk + " ]";
    }
    
}
