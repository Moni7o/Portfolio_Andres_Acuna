/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Aacuna.portfolio.Services;

import com.Aacuna.portfolio.Entity.Educacion;
import com.Aacuna.portfolio.Repository.EducacionRepo;
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
public class EducacionService {
    
    private final EducacionRepo educacionRepo;
    
    @Autowired
    public EducacionService(EducacionRepo educacionRepo){
        this.educacionRepo = educacionRepo;
    }
    
    public Educacion addEducacion(Educacion educacion){
        return educacionRepo.save(educacion);
    }
    
    public List<Educacion> buscarEducacion(){
        return educacionRepo.findAll();
    }
    
    public Educacion editarEducacion(Educacion educacion){
        return educacionRepo.save(educacion);
    }
    
    public void borrarEducacion(Long id){
        educacionRepo.deleteById(id);
    }
    
}
