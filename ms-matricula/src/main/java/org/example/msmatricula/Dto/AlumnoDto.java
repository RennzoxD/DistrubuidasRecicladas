package org.example.msmatricula.Dto;


import lombok.Data;

@Data
public class AlumnoDto {
    private Integer id;
    private String nombre;
    private String apellidos;
    private String telefono;
    private GradoDto grado;
}
