/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Aacuna.portfolio.Services;

import com.Aacuna.portfolio.Entity.Usuario;
import com.Aacuna.portfolio.Repository.UsuarioRepo;
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
public class UsuarioService {
    private final UsuarioRepo usuarioRepo;
    
    @Autowired
    public UsuarioService(UsuarioRepo usuarioRepo){
        this.usuarioRepo = usuarioRepo;
    }
    
    
    public Usuario addUser(Usuario usuario){
        return usuarioRepo.save(usuario);
    }
    
    public List<Usuario> buscarUser(Usuario usuario){
        return usuarioRepo.findAll();
    }
    
    public Usuario editarUser(Usuario usuario){
        return usuarioRepo.save(usuario);
    }
    
    public void borrarUser(Long id){
        usuarioRepo.deleteById(id);
    }

    public Usuario buscarUsuarioPorId(Long id){
        return usuarioRepo.findById(id).orElse(null);
    }
    
}
