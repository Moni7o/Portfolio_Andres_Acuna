/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Aacuna.portfolio.Controller;

import com.Aacuna.portfolio.Entity.Proyectos;
import com.Aacuna.portfolio.Services.ProyectosService;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author oscar
 */
@RestController
@RequestMapping("/Proyectos")
@CrossOrigin(origins = "http://localhost:4200")
public class ProyectosController {

    private final ProyectosService proyectosService;

    public ProyectosController(ProyectosService proyectosService) {
        this.proyectosService = proyectosService;
    }
    
    @PostMapping("/add")
    public ResponseEntity<Proyectos> addProyectos(@RequestBody Proyectos proyectos) {
        Proyectos newProyecto = proyectosService.addProyectos(proyectos);
        return new ResponseEntity<>(newProyecto, HttpStatus.CREATED);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Proyectos>> obtenerProyectos() {
        List<Proyectos> proyectos = proyectosService.buscarProyectos();
        return new ResponseEntity<>(proyectos, HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<Proyectos> editarProyectos(@RequestBody Proyectos proyectos) {
        Proyectos updateProyectos = proyectosService.editarProyectos(proyectos);
        return new ResponseEntity<>(updateProyectos, HttpStatus.OK);
    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<?> borrarProyectos(@PathVariable("id") Long id) {
        proyectosService.borrarProyectos(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
