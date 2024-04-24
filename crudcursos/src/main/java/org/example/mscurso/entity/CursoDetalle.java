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
    @Transient
    private Profesores profesores;

    public CursoDetalle(){
    this.duracionHoras = (double) 0;
    this.precio = (double) 0;
    }

}