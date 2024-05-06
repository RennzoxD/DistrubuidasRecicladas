package org.example.msmatricula.Dto;

import lombok.Data;

@Data
public class NotaDto {
    private Long id;
    private int calificacion;
    private AlumnoDto alumnoId;
    private CursoDto cursoId;
}
