/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Aacuna.portfolio.Services;

import com.Aacuna.portfolio.Entity.AcercaDe;
import com.Aacuna.portfolio.Repository.AcercaDeRepo;
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
public class AcercaDeService {

    private final AcercaDeRepo acercaDeRepo;

    @Autowired
    public AcercaDeService(AcercaDeRepo acercaDeRepo) {
        this.acercaDeRepo = acercaDeRepo;
    }

    public AcercaDe addAcercaDe(AcercaDe acercaDe) {
        return acercaDeRepo.save(acercaDe);
    }

    public List<AcercaDe> buscarAcercaDe() {
        return acercaDeRepo.findAll();
    }

    public AcercaDe editarAcercaDe(AcercaDe acercaDe) {
        return acercaDeRepo.save(acercaDe);
    }

}
