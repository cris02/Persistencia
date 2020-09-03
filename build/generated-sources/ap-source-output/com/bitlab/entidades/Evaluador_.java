package com.bitlab.entidades;

import com.bitlab.entidades.ActSeleccion;
import com.bitlab.entidades.Curso;
import com.bitlab.entidades.Plaza;
import com.bitlab.entidades.Usuario;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-09-02T22:04:30")
@StaticMetamodel(Evaluador.class)
public class Evaluador_ { 

    public static volatile SingularAttribute<Evaluador, Date> evaFechaNac;
    public static volatile ListAttribute<Evaluador, ActSeleccion> actSeleccionList;
    public static volatile SingularAttribute<Evaluador, Character> evaSexo;
    public static volatile SingularAttribute<Evaluador, String> evaCorreo;
    public static volatile SingularAttribute<Evaluador, Integer> evaIdPk;
    public static volatile ListAttribute<Evaluador, Plaza> plazaList;
    public static volatile SingularAttribute<Evaluador, String> evaDui;
    public static volatile SingularAttribute<Evaluador, String> evaTel;
    public static volatile SingularAttribute<Evaluador, String> evaDireccion;
    public static volatile SingularAttribute<Evaluador, Usuario> usuIdFk;
    public static volatile ListAttribute<Evaluador, Curso> cursoList;
    public static volatile SingularAttribute<Evaluador, String> evaNombres;

}