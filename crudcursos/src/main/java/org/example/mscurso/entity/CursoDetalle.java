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
        this.duracionHoras = 0.0;
        this.precio = 0.0;
    }
    public Profesores getProfesores() {
        return profesores;
    }

    public void setProfesores(Profesores profesores) {
        this.profesores = profesores;
    }

}