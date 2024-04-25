package org.example.mscurso.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.example.mscurso.dto.Profesores;

@Entity
@Data
public class CursoDetalle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;
    private String descripcion;
    private double precio;
    private double duracionHoras;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "profesores_id")
    private Profesores profesores;

    public CursoDetalle() {
        this.duracionHoras = 0;
        this.precio = 0;
    }
}