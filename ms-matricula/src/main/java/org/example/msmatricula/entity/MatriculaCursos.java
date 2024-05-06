package org.example.msmatricula.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.example.msmatricula.Dto.CursoDto;
import org.example.msmatricula.Dto.NotaDto;

@Entity
@Data
public class MatriculaCursos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;
    private Integer cursoId;
    private Integer notaId;
    @Transient
    CursoDto curso;
    @Transient
    NotaDto notas;

}
