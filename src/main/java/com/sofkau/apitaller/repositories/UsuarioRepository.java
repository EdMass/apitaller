package com.sofkau.apitaller.repositories;


import com.sofkau.apitaller.models.UsuarioModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface UsuarioRepository extends JpaRepository<UsuarioModel, Long> {
    //Se cambia la extension de Crud a JpaRepository
    public abstract ArrayList<UsuarioModel> findByPrioridad(Integer prioridad);
}
