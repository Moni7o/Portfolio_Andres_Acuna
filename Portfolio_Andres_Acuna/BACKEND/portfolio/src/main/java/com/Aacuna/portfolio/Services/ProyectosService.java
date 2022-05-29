/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Aacuna.portfolio.Services;

import com.Aacuna.portfolio.Entity.Proyectos;
import com.Aacuna.portfolio.Repository.ProyectosRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author oscar
 */
@Service
@Transactional
public class ProyectosService {

    private final ProyectosRepo proyectosRepo;

    @Autowired
    public ProyectosService(ProyectosRepo proyectosRepo) {
        this.proyectosRepo = proyectosRepo;
    }

    public Proyectos addProyectos(Proyectos proyectos) {
        return proyectosRepo.save(proyectos);
    }

    public List<Proyectos> buscarProyectos() {
        return proyectosRepo.findAll();
    }

    public Proyectos editarProyectos(Proyectos proyectos) {
        return proyectosRepo.save(proyectos);
    }

    public void borrarProyectos(Long id) {
        proyectosRepo.deleteById(id);
    }
}
