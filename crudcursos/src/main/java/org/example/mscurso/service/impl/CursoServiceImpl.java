package org.example.mscurso.service.impl;

import org.example.mscurso.dto.Alumno;
import org.example.mscurso.dto.Profesores;
import org.example.mscurso.entity.Curso;
import org.example.mscurso.entity.CursoDetalle;
import org.example.mscurso.feign.AlumnoFeign;
import org.example.mscurso.feign.ProfesoresFeign;
import org.example.mscurso.repository.CursoRepository;
import org.example.mscurso.service.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CursoServiceImpl implements CursoService {
    @Autowired
    private CursoRepository cursoRepository;

    @Autowired
    private AlumnoFeign alumnoFeign;

    @Autowired
    private ProfesoresFeign profesoresFeign;

    @Override
    public List<Curso> listar() {
        return cursoRepository.findAll();
    }

    @Override
    public Curso guardar(Curso curso) {
        return cursoRepository.save(curso);
    }

    @Override
    public Optional<Curso> buscarPorId(Integer id) {
        Curso curso = cursoRepository.findById(id).orElse(null);
        if (curso != null) {
            List<CursoDetalle> cursoDetalles = curso.getDetalles().stream().map(cursoDetalle -> {
                Profesores profesores = profesoresFeign.listById(cursoDetalle.getProfesores().getId()).getBody();
                cursoDetalle.setProfesores(profesores);
                return cursoDetalle;
            }).collect(Collectors.toList());
            curso.setDetalles(cursoDetalles);
        }
        return Optional.ofNullable(curso);
    }

    @Override
    public Curso editar(Curso curso) {
        return cursoRepository.save(curso);
    }

    @Override
    public void eliminar(Integer id) {
        cursoRepository.deleteById(id);

    }
}
