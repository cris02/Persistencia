package com.bitlab.entidades;

import com.bitlab.entidades.DetAluActseleccion;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-09-02T22:04:30")
@StaticMetamodel(EstActividad.class)
public class EstActividad_ { 

    public static volatile SingularAttribute<EstActividad, String> estActDescripcion;
    public static volatile SingularAttribute<EstActividad, Integer> estActIdPk;
    public static volatile ListAttribute<EstActividad, DetAluActseleccion> detAluActseleccionList;
    public static volatile SingularAttribute<EstActividad, String> estActNombre;

}