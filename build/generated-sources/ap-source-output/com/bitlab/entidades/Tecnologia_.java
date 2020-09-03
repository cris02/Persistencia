package com.bitlab.entidades;

import com.bitlab.entidades.DetPerTecnologia;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-09-02T22:04:30")
@StaticMetamodel(Tecnologia.class)
public class Tecnologia_ { 

    public static volatile SingularAttribute<Tecnologia, String> tecNombre;
    public static volatile SingularAttribute<Tecnologia, String> tecDescripcion;
    public static volatile ListAttribute<Tecnologia, DetPerTecnologia> detPerTecnologiaList;
    public static volatile SingularAttribute<Tecnologia, Integer> tecIdPk;

}