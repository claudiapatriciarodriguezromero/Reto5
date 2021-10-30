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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Id;


 /**
 *
 * @author Claudia Rodriguez
 * por buenas practicas se deja comentado el documento
 */
@Entity
@Table(name = "category")
public class Categoria implements Serializable {
 /**
 *
 * @author Claudia Rodriguez
 * por buenas practicas se deja comentado el documento
 */
    
    @Id
    @GeneratedValue (strategy=GenerationType.IDENTITY)
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
    private String description;
    /**
 *
 * @author Claudia Rodriguez
 * por buenas practicas se deja comentado el documento
 */
    @OneToMany(cascade = {CascadeType.PERSIST},mappedBy="category")
    @JsonIgnoreProperties({"category","message"})
    private List<Cabin> Cabins;
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
    public List<Cabin> getCabins() {
        return Cabins;
    }
/**
 *
 * @author Claudia Rodriguez
 * por buenas practicas se deja comentado el documento
     * @param Cabins
     * 
 */
    public void setCabins(List<Cabin> Cabins) {
        this.Cabins = Cabins;
    }
    
    
}
