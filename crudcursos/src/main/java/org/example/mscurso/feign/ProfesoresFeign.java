package org.example.mscurso.feign;

import jakarta.persistence.Id;
import org.example.mscurso.dto.Profesores;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name= "ms-curso-service.yml", path = "/Profesores")
public interface ProfesoresFeign {
    @GetMapping(value = "/{id}")
        public ResponseEntity<Profesores> listById(@PathVariable(required = true)Integer id);

}
