/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cabin.modelo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Claudia Rodriguez
 * por buenas practicas se deja comentado el documento
 */
@Entity
@Table(name = "cabin")
public class Cabin implements Serializable{
    /**
 *
 * @author Claudia Rodriguez
 * por buenas practicas se deja comentado el documento
 */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    /**
 *
 * @author Claudia Rodriguez
 * por buenas practicas se deja comentado el documento
 */
    private String name;
    /**
 *
 * @author Claudia Rodriguez
 * por buenas practicas se deja comentado el documento
 */
    private String  brand;
    /**
 *
 * @author Claudia Rodriguez
 * por buenas practicas se deja comentado el documento
 */
    private Integer rooms;
    /**
 *
 * @author Claudia Rodriguez
 * por buenas practicas se deja comentado el documento
 */
    private String description;
    /**
 *
 * @author Claudia Rodriguez
 * por buenas practicas se deja comentado el documento
 */
    @ManyToOne
    @JoinColumn(name="categoryid")
    @JsonIgnoreProperties("cabins")
    private Categoria category;
    /**
 *
 * @author Claudia Rodriguez
 * por buenas practicas se deja comentado el documento
 */
    @OneToMany(cascade = {CascadeType.PERSIST}, mappedBy = "cabin")
    @JsonIgnoreProperties({"cabin","client"})
    private List<Mensaje> messages;
/**
 *
 * @author Claudia Rodriguez
 * por buenas practicas se deja comentado el documento
 */
    @OneToMany(cascade = {CascadeType.PERSIST}, mappedBy = "cabin")
    @JsonIgnoreProperties({"cabin","message"})
    public List<Reservacion> reservations;
/**
 *
 * @author Claudia Rodriguez
 * por buenas practicas se deja comentado el documento
     * @return 
 */
    public Integer getId() {
        return id;
    }
/**
 *
 * @author Claudia Rodriguez
 * por buenas practicas se deja comentado el documento
     * @param id
 */
    public void setId(Integer id) {
        this.id = id;
    }
/**
 *
 * @author Claudia Rodriguez
 * por buenas practicas se deja comentado el documento
     * @return 
 */
    public String getName() {
        return name;
    }
/**
 *
 * @author Claudia Rodriguez
 * por buenas practicas se deja comentado el documento
     * @param name
 */
    public void setName(String name) {
        this.name = name;
    }
/**
 *
 * @author Claudia Rodriguez
 * por buenas practicas se deja comentado el documento
     * @return 
 */
    public String getBrand() {
        return brand;
    }
/**
 *
 * @author Claudia Rodriguez
 * por buenas practicas se deja comentado el documento
     * @param brand
 */
    public void setBrand(String brand) {
        this.brand = brand;
    }
/**
 *
 * @author Claudia Rodriguez
 * por buenas practicas se deja comentado el documento
     * @return 
 */
    public Integer getRooms() {
        return rooms;
    }
/**
 *
 * @author Claudia Rodriguez
 * por buenas practicas se deja comentado el documento
     * @param rooms
 */
    public void setRooms(Integer rooms) {
        this.rooms = rooms;
    }
/**
 *
 * @author Claudia Rodriguez
 * por buenas practicas se deja comentado el documento
     * @return 
 */
    public String getDescription() {
        return description;
    }
/**
 *
 * @author Claudia Rodriguez
 * por buenas practicas se deja comentado el documento
     * @param description
 */
    public void setDescription(String description) {
        this.description = description;
    }
/**
 *
 * @author Claudia Rodriguez
 * por buenas practicas se deja comentado el documento
     * @return 
 */
    public Categoria getCategory() {
        return category;
    }
/**
 *
 * @author Claudia Rodriguez
 * por buenas practicas se deja comentado el documento
     * @param category
 */
    public void setCategory(Categoria category) {
        this.category = category;
    }
/**
 *
 * @author Claudia Rodriguez
 * por buenas practicas se deja comentado el documento
     * @return 
 */
    public List<Mensaje> getMessages() {
        return messages;
    }
/**
 *
 * @author Claudia Rodriguez
 * por buenas practicas se deja comentado el documento
     * @return 
 */
    public void setMessages(List<Mensaje> messages) {
        this.messages = messages;
    }
/**
 *
 * @author Claudia Rodriguez
 * por buenas practicas se deja comentado el documento
     * @return 
 */
    public List<Reservacion> getReservations() {
        return reservations;
    }
/**
 *
 * @author Claudia Rodriguez
 * por buenas practicas se deja comentado el documento
     * @param reservations
 */
    public void setReservations(List<Reservacion> reservations) {
        this.reservations = reservations;
    }

}
