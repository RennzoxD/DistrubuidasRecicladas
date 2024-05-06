package org.example.msmatricula.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Data;
import org.example.msmatricula.Dto.AlumnoDto;
import org.example.msmatricula.Dto.CursoDto;
import org.example.msmatricula.Dto.NotaDto;

import java.util.List;

@Entity
@Data
public class Notas {
    @Id
    private Integer id;
    private int calificacion;
    @Transient
    AlumnoDto alumnoDto;
    @Transient
    private NotaDto notas;
}
