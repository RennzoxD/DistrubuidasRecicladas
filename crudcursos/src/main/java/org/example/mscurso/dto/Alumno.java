package org.example.mscurso.dto;

import lombok.Data;

@Data
public class Alumno {
    private Integer id;
    private String nombre;
    private String appPaterno;
    private String appMaterno;
    private String numCelular;
    private String grado;

}
