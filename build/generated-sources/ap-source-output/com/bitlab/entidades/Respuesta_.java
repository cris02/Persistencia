package com.bitlab.entidades;

import com.bitlab.entidades.Alumno;
import com.bitlab.entidades.Pregunta;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-09-02T15:35:04")
@StaticMetamodel(Respuesta.class)
public class Respuesta_ { 

    public static volatile SingularAttribute<Respuesta, Integer> resIdPk;
    public static volatile SingularAttribute<Respuesta, Alumno> aluIdFk;
    public static volatile SingularAttribute<Respuesta, Pregunta> preIdFk;
    public static volatile SingularAttribute<Respuesta, String> resRespuestapreg;

}