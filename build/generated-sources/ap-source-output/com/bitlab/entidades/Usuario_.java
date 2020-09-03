package com.bitlab.entidades;

import com.bitlab.entidades.Alumno;
import com.bitlab.entidades.Evaluador;
import com.bitlab.entidades.Profesor;
import com.bitlab.entidades.Rol;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-09-02T22:04:30")
@StaticMetamodel(Usuario.class)
public class Usuario_ { 

    public static volatile SingularAttribute<Usuario, Date> usuFechamodificacion;
    public static volatile SingularAttribute<Usuario, Integer> usuIdPk;
    public static volatile SingularAttribute<Usuario, String> usuPass;
    public static volatile SingularAttribute<Usuario, Date> usuFechacreacion;
    public static volatile ListAttribute<Usuario, Alumno> alumnoList;
    public static volatile SingularAttribute<Usuario, Rol> rolIdFk;
    public static volatile ListAttribute<Usuario, Profesor> profesorList;
    public static volatile SingularAttribute<Usuario, String> usuUser;
    public static volatile SingularAttribute<Usuario, Boolean> usuEstado;
    public static volatile ListAttribute<Usuario, Evaluador> evaluadorList;

}