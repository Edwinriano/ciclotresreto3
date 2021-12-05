/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reto3_Do.Reto3;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author PQ727LW
 */
@Repository
public class RepositorioMensaje {
        
    @Autowired
    private InterfaceMensaje crud3;
    
    public List<Mensaje> getAll(){
        return (List<Mensaje>) crud3.findAll();
    }
    
    public Optional<Mensaje> getMessaje(int id){
        return crud3.findById(id);
    }
     
    public Mensaje save(Mensaje messaje){
        return crud3.save(messaje);
    }
    public void delete(Mensaje messaje){
        crud3.delete(messaje);
    }

    Optional<Mensaje> getMessage(Integer idMessage) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
