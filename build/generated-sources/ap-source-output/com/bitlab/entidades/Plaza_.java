package com.bitlab.entidades;

import com.bitlab.entidades.DetPlaAlumno;
import com.bitlab.entidades.Evaluador;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-09-02T22:04:30")
@StaticMetamodel(Plaza.class)
public class Plaza_ { 

    public static volatile SingularAttribute<Plaza, Integer> plaIdPk;
    public static volatile SingularAttribute<Plaza, Date> plaFechaFin;
    public static volatile ListAttribute<Plaza, DetPlaAlumno> detPlaAlumnoList;
    public static volatile SingularAttribute<Plaza, Date> plaFechaPublicacion;
    public static volatile SingularAttribute<Plaza, Evaluador> evaIdFk;
    public static volatile SingularAttribute<Plaza, String> plaNombre;
    public static volatile SingularAttribute<Plaza, String> plaDescripcion;

}