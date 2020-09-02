package com.bitlab.entidades;

import com.bitlab.entidades.Curso;
import com.bitlab.entidades.Tarea;
import com.bitlab.entidades.Usuario;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-09-02T17:12:04")
@StaticMetamodel(Profesor.class)
public class Profesor_ { 

    public static volatile SingularAttribute<Profesor, String> proTelefono;
    public static volatile ListAttribute<Profesor, Tarea> tareaList;
    public static volatile SingularAttribute<Profesor, String> proDireccion;
    public static volatile SingularAttribute<Profesor, Integer> proIdPk;
    public static volatile SingularAttribute<Profesor, String> proCorreo;
    public static volatile SingularAttribute<Profesor, String> proNombres;
    public static volatile SingularAttribute<Profesor, String> proApellidos;
    public static volatile SingularAttribute<Profesor, String> proTitulo;
    public static volatile ListAttribute<Profesor, Curso> cursoList;
    public static volatile SingularAttribute<Profesor, Usuario> usuIdFk;

}