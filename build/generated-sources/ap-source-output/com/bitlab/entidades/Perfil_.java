package com.bitlab.entidades;

import com.bitlab.entidades.Alumno;
import com.bitlab.entidades.DetPerTecnologia;
import com.bitlab.entidades.EstPerfil;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-09-02T15:35:04")
@StaticMetamodel(Perfil.class)
public class Perfil_ { 

    public static volatile SingularAttribute<Perfil, String> perIdioma;
    public static volatile SingularAttribute<Perfil, String> perNivelacademico;
    public static volatile SingularAttribute<Perfil, Alumno> aluIdFk;
    public static volatile SingularAttribute<Perfil, EstPerfil> estPerIdFk;
    public static volatile ListAttribute<Perfil, DetPerTecnologia> detPerTecnologiaList;
    public static volatile SingularAttribute<Perfil, String> perCv;
    public static volatile SingularAttribute<Perfil, String> perFoto;
    public static volatile SingularAttribute<Perfil, String> perEstadolaboral;
    public static volatile SingularAttribute<Perfil, Date> perFechacreacion;
    public static volatile SingularAttribute<Perfil, Integer> perIdPk;

}