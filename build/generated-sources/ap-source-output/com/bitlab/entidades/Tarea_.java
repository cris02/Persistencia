package com.bitlab.entidades;

import com.bitlab.entidades.DetAluTarea;
import com.bitlab.entidades.Profesor;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-09-02T22:04:30")
@StaticMetamodel(Tarea.class)
public class Tarea_ { 

    public static volatile ListAttribute<Tarea, DetAluTarea> detAluTareaList;
    public static volatile SingularAttribute<Tarea, Integer> tarIdPk;
    public static volatile SingularAttribute<Tarea, Date> tarFechaInicio;
    public static volatile SingularAttribute<Tarea, Profesor> proIdFk;
    public static volatile SingularAttribute<Tarea, String> tarNombre;

}