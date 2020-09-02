package com.bitlab.entidades;

import com.bitlab.entidades.ActSeleccion;
import com.bitlab.entidades.Alumno;
import com.bitlab.entidades.EstActividad;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-09-02T15:35:04")
@StaticMetamodel(DetAluActseleccion.class)
public class DetAluActseleccion_ { 

    public static volatile SingularAttribute<DetAluActseleccion, Alumno> aluIdFk;
    public static volatile SingularAttribute<DetAluActseleccion, EstActividad> estActIdFk;
    public static volatile SingularAttribute<DetAluActseleccion, String> detAluActObservacion;
    public static volatile SingularAttribute<DetAluActseleccion, String> detAluActDocumentoPrueba;
    public static volatile SingularAttribute<DetAluActseleccion, Integer> detAluActNota;
    public static volatile SingularAttribute<DetAluActseleccion, Integer> detAluActIdPk;
    public static volatile SingularAttribute<DetAluActseleccion, ActSeleccion> actSelIdFk;

}