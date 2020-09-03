package com.bitlab.entidades;

import com.bitlab.entidades.Curso;
import com.bitlab.entidades.Respuesta;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-09-02T22:04:30")
@StaticMetamodel(Pregunta.class)
public class Pregunta_ { 

    public static volatile SingularAttribute<Pregunta, Date> preFechaCreacion;
    public static volatile SingularAttribute<Pregunta, Curso> curIdFk;
    public static volatile ListAttribute<Pregunta, Respuesta> respuestaList;
    public static volatile SingularAttribute<Pregunta, String> preDescripcionpreg;
    public static volatile SingularAttribute<Pregunta, Integer> preIdPk;

}