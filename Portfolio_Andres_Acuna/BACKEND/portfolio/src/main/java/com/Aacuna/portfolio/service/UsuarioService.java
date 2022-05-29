
package com.Aacuna.portfolio.service;

import com.Aacuna.portfolio.models.Usuario;
import com.Aacuna.portfolio.repository.UsuarioRepo;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class UsuarioService {
    private final UsuarioRepo usuarioRepo;

    
    @Autowired
    public UsuarioService(UsuarioService usuarioService) {
        this.UsuarioRepo = usuarioService;
    }
    
    public Usuario addUsuario(Usuario usuario){
        return UsuarioRepo.save(usuario);
    }
    
    public List<Usuario> buscarEducaciones(){
        return UsuarioRepo.findAll();
    }
    
    public Usuario editarUsuario(Usuario usuario){
        return UsuarioRepo.save(usuario);
    }
    
    public void borrarEducacion(Long id){
        UsuarioRepo.deleteById(id);
    }
    
    
    
}
