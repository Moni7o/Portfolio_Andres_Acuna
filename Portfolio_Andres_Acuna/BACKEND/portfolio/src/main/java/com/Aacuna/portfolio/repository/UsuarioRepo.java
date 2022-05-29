
package com.Aacuna.portfolio.repository;

import com.Aacuna.portfolio.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UsuarioRepo  extends JpaRepository<Usuario, Long>{
    
}
