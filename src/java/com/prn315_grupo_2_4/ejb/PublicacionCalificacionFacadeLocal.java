/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prn315_grupo_2_4.ejb;

import com.prn315_grupo_2_4.Entity.PublicacionCalificacion;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author crist
 */
@Local
public interface PublicacionCalificacionFacadeLocal {

    void create(PublicacionCalificacion publicacionCalificacion);

    void edit(PublicacionCalificacion publicacionCalificacion);

    void remove(PublicacionCalificacion publicacionCalificacion);

    PublicacionCalificacion find(Object id);

    List<PublicacionCalificacion> findAll();

    List<PublicacionCalificacion> findRange(int[] range);

    int count();
    
}
