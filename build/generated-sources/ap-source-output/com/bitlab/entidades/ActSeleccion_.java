package com.bitlab.entidades;

import com.bitlab.entidades.Curso;
import com.bitlab.entidades.DetAluActseleccion;
import com.bitlab.entidades.Evaluador;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-09-02T17:12:04")
@StaticMetamodel(ActSeleccion.class)
public class ActSeleccion_ { 

    public static volatile SingularAttribute<ActSeleccion, BigDecimal> actSelPonderacion;
    public static volatile SingularAttribute<ActSeleccion, Date> actSelFechaCreacion;
    public static volatile SingularAttribute<ActSeleccion, Integer> actSelIdPk;
    public static volatile SingularAttribute<ActSeleccion, String> actSelNombre;
    public static volatile SingularAttribute<ActSeleccion, Curso> curIdFk;
    public static volatile SingularAttribute<ActSeleccion, Evaluador> evaIdFk;
    public static volatile ListAttribute<ActSeleccion, DetAluActseleccion> detAluActseleccionList;

}