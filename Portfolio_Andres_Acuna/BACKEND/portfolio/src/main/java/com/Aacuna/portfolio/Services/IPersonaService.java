/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Aacuna.portfolio.Services;

import com.Aacuna.portfolio.Entity.Persona;
import java.util.List;

/**
 *
 * @author oscar
 */
public interface IPersonaService {
    
    public List<Persona> verPersona ();
    
    public void crearPersona (Persona per);
    
    public void borrarPersona (Long id);
    

    public Persona buscarPersona (Long id);
}
