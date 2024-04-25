package org.example.mscurso.feign;

import org.example.mscurso.dto.Alumno;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name= "ms-curso-service.yml", path = "/Alumno")
public interface AlumnoFeign {
    @GetMapping("/{id}")
    public ResponseEntity<Alumno> listById(@PathVariable(required = true) Integer id);
}