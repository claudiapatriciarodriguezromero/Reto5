/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cabin.controlador;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import cabin.modelo.Mensaje;
import cabin.servicios.ServiciosMensaje;

/**
 *
 * @author Claudia Rodriguez
 * por buenas practicas se deja comentado el documento
 */
@RestController
@RequestMapping("/api/Message")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
public class ControladorMensaje {
    /**
 *
 * @author Claudia Rodriguez
 * por buenas practicas se deja comentado el documento
 */
    @Autowired
    private ServiciosMensaje servicio;
    /**
 *
 * @author Claudia Rodriguez
 * por buenas practicas se deja comentado el documento
     * @return 
 */
    @GetMapping("/all")
    public List<Mensaje> getMessages(){
        return servicio.getAll();
    }
/**
 *
 * @author Claudia Rodriguez
 * por buenas practicas se deja comentado el documento
     * @param messageId
     * @return 
 */
    @GetMapping("/{id}")
    public Optional<Mensaje> getMessage(@PathVariable("id") int messageId) {
        return servicio.getMessage(messageId);
    }
/**
 *
 * @author Claudia Rodriguez
 * por buenas practicas se deja comentado el documento
     * @param message
     * @return 
 */
    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Mensaje save(@RequestBody Mensaje message) {
        return servicio.save(message);
    }
    /**
 *
 * @author Claudia Rodriguez
 * por buenas practicas se deja comentado el documento
     * @param mensaje
     * @return 
 */
    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public Mensaje update(@RequestBody Mensaje mensaje) {
        return servicio.update(mensaje);
    }
/**
 *
 * @author Claudia Rodriguez
 * por buenas practicas se deja comentado el documento
     * @param messageId
     * @return 
 */
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean delete(@PathVariable("id") int messageId) {
        return servicio.deleteMessage(messageId);
    }
}
