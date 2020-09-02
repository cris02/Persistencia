package com.bitlab.entidades;

import com.bitlab.entidades.Perfil;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-09-02T17:12:04")
@StaticMetamodel(EstPerfil.class)
public class EstPerfil_ { 

    public static volatile SingularAttribute<EstPerfil, String> estPerNombre;
    public static volatile SingularAttribute<EstPerfil, Integer> estPerIdPk;
    public static volatile SingularAttribute<EstPerfil, String> estPerDescripcion;
    public static volatile ListAttribute<EstPerfil, Perfil> perfilList;

}