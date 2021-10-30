/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cabin.reportes;

import cabin.modelo.Cliente;

/**
 *
 * @author Claudia Rodriguez
 * por buenas practicas se deja comentado el documento
 */
public class ContadorClientes {
    /**
 *
 * @author Claudia Rodriguez
 * por buenas practicas se deja comentado el documento
 */
    private Long total;
    /**
 *
 * @author Claudia Rodriguez
 * por buenas practicas se deja comentado el documento
 */
    private Cliente client;
/**
 *
 * @author Claudia Rodriguez
 * por buenas practicas se deja comentado el documento
     * @param total
     * @param client
 */
    public ContadorClientes(Long total, Cliente client) {
        this.total = total;
        this.client = client;
    }
/**
 *
 * @author Claudia Rodriguez
 * por buenas practicas se deja comentado el documento
     * @return 
 */
    public Long getTotal() {
        return total;
    }
/**
 *
 * @author Claudia Rodriguez
 * por buenas practicas se deja comentado el documento
     * @param total
 */
    public void setTotal(Long total) {
        this.total = total;
    }
/**
 *
 * @author Claudia Rodriguez
 * por buenas practicas se deja comentado el documento
     * @return 
 */
    public Cliente getClient() {
        return client;
    }
/**
 *
 * @author Claudia Rodriguez
 * por buenas practicas se deja comentado el documento
     * @param client
 */
    public void setClient(Cliente client) {
        this.client = client;
    }

}