package com.bitlab.entidades;

import com.bitlab.entidades.ActSeleccion;
import com.bitlab.entidades.Evaluador;
import com.bitlab.entidades.Pregunta;
import com.bitlab.entidades.Profesor;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-09-02T17:12:04")
@StaticMetamodel(Curso.class)
public class Curso_ { 

    public static volatile SingularAttribute<Curso, String> curHorario;
    public static volatile SingularAttribute<Curso, Date> curFechaInicio;
    public static volatile SingularAttribute<Curso, String> curDiasClase;
    public static volatile ListAttribute<Curso, ActSeleccion> actSeleccionList;
    public static volatile SingularAttribute<Curso, Short> curCupo;
    public static volatile SingularAttribute<Curso, String> curDescripcion;
    public static volatile SingularAttribute<Curso, Date> curFechaFin;
    public static volatile SingularAttribute<Curso, String> curNombre;
    public static volatile SingularAttribute<Curso, Evaluador> evaIdFk;
    public static volatile SingularAttribute<Curso, Profesor> proIdFk;
    public static volatile ListAttribute<Curso, Pregunta> preguntaList;
    public static volatile SingularAttribute<Curso, Integer> curIdPk;

}