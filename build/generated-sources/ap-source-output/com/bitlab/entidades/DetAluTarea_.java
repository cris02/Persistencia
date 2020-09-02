package com.bitlab.entidades;

import com.bitlab.entidades.Alumno;
import com.bitlab.entidades.Tarea;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-09-02T17:12:04")
@StaticMetamodel(DetAluTarea.class)
public class DetAluTarea_ { 

    public static volatile SingularAttribute<DetAluTarea, Alumno> aluIdFk;
    public static volatile SingularAttribute<DetAluTarea, Tarea> tarIdFk;
    public static volatile SingularAttribute<DetAluTarea, Integer> detAluTarIdPk;
    public static volatile SingularAttribute<DetAluTarea, BigDecimal> detAluTarNota;
    public static volatile SingularAttribute<DetAluTarea, String> detAluTarObservacion;

}