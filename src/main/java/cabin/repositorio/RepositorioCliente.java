/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cabin.repositorio;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import cabin.interfaces.InterfaceCliente;
import cabin.modelo.Cliente;

/**
 *
 * @author Claudia Rodriguez
 * por buenas practicas se deja comentado el documento
 */
@Repository
public class RepositorioCliente {
    /**
 *
 * @author Claudia Rodriguez
 * por buenas practicas se deja comentado el documento
 */
      @Autowired
    private InterfaceCliente crud1;
    
/**
 *
 * @author Claudia Rodriguez
 * por buenas practicas se deja comentado el documento
     * @return 
 */
    public List<Cliente> getAll(){
        return (List<Cliente>) crud1.findAll();       
    }
    /**
 *
 * @author Claudia Rodriguez
 * por buenas practicas se deja comentado el documento
     * @param id
     * @return 
 */
    public Optional <Cliente> getCliente(int id){
        return crud1.findById(id);
    }
    /**
 *
 * @author Claudia Rodriguez
 * por buenas practicas se deja comentado el documento
     * @param cliente
     * @return 
 */
    public Cliente save(Cliente cliente){
        return crud1.save(cliente);
    }
    /**
 *
 * @author Claudia Rodriguez
 * por buenas practicas se deja comentado el documento
     * @param cliente
 */
     public void delete(Cliente cliente){
        crud1.delete(cliente);
    } 
}
