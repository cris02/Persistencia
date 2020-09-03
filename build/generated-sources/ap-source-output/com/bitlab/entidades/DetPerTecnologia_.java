package com.bitlab.entidades;

import com.bitlab.entidades.Perfil;
import com.bitlab.entidades.Tecnologia;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-09-02T22:04:30")
@StaticMetamodel(DetPerTecnologia.class)
public class DetPerTecnologia_ { 

    public static volatile SingularAttribute<DetPerTecnologia, Tecnologia> tecIdFk;
    public static volatile SingularAttribute<DetPerTecnologia, Perfil> perIdFk;
    public static volatile SingularAttribute<DetPerTecnologia, Integer> detPerTecIdPk;
    public static volatile SingularAttribute<DetPerTecnologia, String> detPerTecNivel;
    public static volatile SingularAttribute<DetPerTecnologia, String> detPerTecSkills;

}