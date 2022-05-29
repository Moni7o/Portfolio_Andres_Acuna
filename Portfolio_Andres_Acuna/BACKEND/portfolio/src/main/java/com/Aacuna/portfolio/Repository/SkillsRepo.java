/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.Aacuna.portfolio.Repository;

import com.Aacuna.portfolio.Entity.Skills;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author oscar
 */

public interface SkillsRepo extends JpaRepository <Skills, Long> {
    
}