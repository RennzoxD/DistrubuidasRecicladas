package org.example.mscurso.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Data;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String descripcion;
    private int duracion;
    private double precio;
    @JsonIgnoreProperties({"hebernateLazyInitializer", "handler"})
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "curso_id")
    private List<CursoDetalle> detalles;
    @Transient
    private Curso curso;


}