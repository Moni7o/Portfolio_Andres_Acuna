/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.Aacuna.portfolio.Repository;

import com.Aacuna.portfolio.Entity.Experiencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author oscar
 */
@Repository
public interface ExperienciaRepo extends JpaRepository <Experiencia, Long>{
    
}
