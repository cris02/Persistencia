package com.bitlab.entidades;

import com.bitlab.entidades.Alumno;
import com.bitlab.entidades.EstPlaza;
import com.bitlab.entidades.Plaza;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-09-02T17:12:04")
@StaticMetamodel(DetPlaAlumno.class)
public class DetPlaAlumno_ { 

    public static volatile SingularAttribute<DetPlaAlumno, Alumno> aluIdFk;
    public static volatile SingularAttribute<DetPlaAlumno, BigDecimal> detPlaAluSalario;
    public static volatile SingularAttribute<DetPlaAlumno, Integer> detPlaAluIdPk;
    public static volatile SingularAttribute<DetPlaAlumno, String> detPlaAluEmpresa;
    public static volatile SingularAttribute<DetPlaAlumno, String> detPlaAluContacto;
    public static volatile SingularAttribute<DetPlaAlumno, Short> detPlaAluTiempoexperiencia;
    public static volatile SingularAttribute<DetPlaAlumno, String> detPlaAluObservacion;
    public static volatile SingularAttribute<DetPlaAlumno, String> detPlaAluTipoplaza;
    public static volatile SingularAttribute<DetPlaAlumno, EstPlaza> estPlaIdFk;
    public static volatile SingularAttribute<DetPlaAlumno, Plaza> plaIdFk;

}