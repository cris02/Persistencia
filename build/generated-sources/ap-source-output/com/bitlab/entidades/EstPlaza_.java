package com.bitlab.entidades;

import com.bitlab.entidades.DetPlaAlumno;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-09-02T15:35:04")
@StaticMetamodel(EstPlaza.class)
public class EstPlaza_ { 

    public static volatile SingularAttribute<EstPlaza, Integer> estPlaIdPk;
    public static volatile ListAttribute<EstPlaza, DetPlaAlumno> detPlaAlumnoList;
    public static volatile SingularAttribute<EstPlaza, String> estPlaNombre;
    public static volatile SingularAttribute<EstPlaza, String> estPlaDescripcion;

}