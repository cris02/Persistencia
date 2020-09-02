package com.bitlab.entidades;

import com.bitlab.entidades.DetAluActseleccion;
import com.bitlab.entidades.DetAluTarea;
import com.bitlab.entidades.DetPlaAlumno;
import com.bitlab.entidades.Perfil;
import com.bitlab.entidades.Respuesta;
import com.bitlab.entidades.Usuario;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-09-02T15:35:04")
@StaticMetamodel(Alumno.class)
public class Alumno_ { 

    public static volatile SingularAttribute<Alumno, String> aluDui;
    public static volatile SingularAttribute<Alumno, String> aluDireccion;
    public static volatile SingularAttribute<Alumno, String> aluApellidos;
    public static volatile SingularAttribute<Alumno, Character> aluGenero;
    public static volatile SingularAttribute<Alumno, String> aluCorreo;
    public static volatile ListAttribute<Alumno, Perfil> perfilList;
    public static volatile SingularAttribute<Alumno, String> aluTelefono;
    public static volatile SingularAttribute<Alumno, Short> aluEdad;
    public static volatile SingularAttribute<Alumno, Date> aluFechaNac;
    public static volatile ListAttribute<Alumno, DetPlaAlumno> detPlaAlumnoList;
    public static volatile ListAttribute<Alumno, DetAluTarea> detAluTareaList;
    public static volatile SingularAttribute<Alumno, String> aluNombres;
    public static volatile ListAttribute<Alumno, Respuesta> respuestaList;
    public static volatile SingularAttribute<Alumno, Integer> aluIdPk;
    public static volatile ListAttribute<Alumno, DetAluActseleccion> detAluActseleccionList;
    public static volatile SingularAttribute<Alumno, Usuario> usuIdFk;

}