/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cabin.modelo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

 /**
 *
 * @author Claudia Rodriguez
 * por buenas practicas se deja comentado el documento
 */
@Entity
@Table(name ="reservation")
public class Reservacion implements Serializable{
     /**
 *
 * @author Claudia Rodriguez
 * por buenas practicas se deja comentado el documento
 */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idReservation;
     /**
 *
 * @author Claudia Rodriguez
 * por buenas practicas se deja comentado el documento
 */
    private Date startDate;
     /**
 *
 * @author Claudia Rodriguez
 * por buenas practicas se deja comentado el documento
 */
    private Date devolutionDate;
     /**
 *
 * @author Claudia Rodriguez
 * por buenas practicas se deja comentado el documento
 */
    private String status="created";
            /**
 *
 * @author Claudia Rodriguez
 * por buenas practicas se deja comentado el documento
 */
    @ManyToOne
    @JoinColumn(name = "id")
    @JsonIgnoreProperties("reservations")
    private Cabin cabin ;
     /**
 *
 * @author Claudia Rodriguez
 * por buenas practicas se deja comentado el documento
 */
    @ManyToOne
    @JoinColumn(name = "idCliente")
    @JsonIgnoreProperties({"reservations","messages"})
    private Cliente client;
     /**
 *
 * @author Claudia Rodriguez
 * por buenas practicas se deja comentado el documento
 */
     private String score;
/**
 *
 * @author Claudia Rodriguez
 * por buenas practicas se deja comentado el documento
     * @return 
 */
    public Integer getIdReservation() {
        return idReservation;
    }
/**
 *
 * @author Claudia Rodriguez
 * por buenas practicas se deja comentado el documento
     * @param idReservation
 */
    public void setIdReservation(Integer idReservation) {
        this.idReservation = idReservation;
    }
/**
 *
 * @author Claudia Rodriguez
 * por buenas practicas se deja comentado el documento
     * @return 
 */
    public Date getStartDate() {
        return startDate;
    }
/**
 *
 * @author Claudia Rodriguez
 * por buenas practicas se deja comentado el documento
     * @param startDate
 */
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }
/**
 *
 * @author Claudia Rodriguez
 * por buenas practicas se deja comentado el documento
     * @return 
 */
    public Date getDevolutionDate() {
        return devolutionDate;
    }
/**
 *
 * @author Claudia Rodriguez
 * por buenas practicas se deja comentado el documento
     * @param devolutionDate
 */
    public void setDevolutionDate(Date devolutionDate) {
        this.devolutionDate = devolutionDate;
    }
/**
 *
 * @author Claudia Rodriguez
 * por buenas practicas se deja comentado el documento
     * @return 
 */
    public String getStatus() {
        return status;
    }
/**
 *
 * @author Claudia Rodriguez
 * por buenas practicas se deja comentado el documento
     * @param status
 */
    public void setStatus(String status) {
        this.status = status;
    }
/**
 *
 * @author Claudia Rodriguez
 * por buenas practicas se deja comentado el documento
     * @return 
 */
    public Cabin getCabin() {
        return cabin;
    }
/**
 *
 * @author Claudia Rodriguez
 * por buenas practicas se deja comentado el documento
     * @param cabin
 */
    public void setCabin(Cabin cabin) {
        this.cabin = cabin;
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
/**
 *
 * @author Claudia Rodriguez
 * por buenas practicas se deja comentado el documento
     * @return 
 */
    public String getScore() {
        return score;
    }
/**
 *
 * @author Claudia Rodriguez
 * por buenas practicas se deja comentado el documento
     * @param score
 */
    public void setScore(String score) {
        this.score = score;
    }
}
