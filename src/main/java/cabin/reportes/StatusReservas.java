/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cabin.reportes;

/**
 *
 * @author Claudia Rodriguez
 * por buenas practicas se deja comentado el documento
 */
public class StatusReservas {
    /**
 *
 * @author Claudia Rodriguez
 * por buenas practicas se deja comentado el documento
 */
    private int completed;
    /**
 *
 * @author Claudia Rodriguez
 * por buenas practicas se deja comentado el documento
 */
    private int cancelled;
/**
 *
 * @author Claudia Rodriguez
 * por buenas practicas se deja comentado el documento
     * @param completed
     * @param cancelled
 */
    public StatusReservas(int completed, int cancelled) {
        
        this.completed = completed;
        this.cancelled = cancelled;
    }
/**
 *
 * @author Claudia Rodriguez
 * por buenas practicas se deja comentado el documento
     * @return 
 */
    public int getCompleted() {
        return completed;
    }
/**
 *
 * @author Claudia Rodriguez
 * por buenas practicas se deja comentado el documento
     * @param completed
 */
    public void setCompleted(int completed) {
        this.completed = completed;
    }
/**
 *
 * @author Claudia Rodriguez
 * por buenas practicas se deja comentado el documento
     * @return 
 */
    public int getCancelled() {
        return cancelled;
    }
/**
 *
 * @author Claudia Rodriguez
 * por buenas practicas se deja comentado el documento
     * @param cancelled
 */
    public void setCancelled(int cancelled) {
        this.cancelled = cancelled;
    }
}