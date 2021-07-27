package cristianosilva.APIHotmart.controller;

import cristianosilva.APIHotmart.model.dto.CompraDTO;
import cristianosilva.APIHotmart.service.CompraService;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Cristiano Silva
 */
@CrossOrigin
@RestController
@RequestMapping(value = "/compra")
public class CompraController {
    
    @Autowired
    private CompraService service;
    
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<CompraDTO> save(@Valid @RequestBody CompraDTO dto){
        return ResponseEntity.ok(service.save(dto));
    }
    
    @PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<CompraDTO> update(@Valid @RequestBody CompraDTO dto){
        return ResponseEntity.ok(service.update(dto));
    }
    
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<CompraDTO>> findAll(){
        return ResponseEntity.ok(service.findAll());
    }
    
    @GetMapping(value ="/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<CompraDTO> findById(@PathVariable Long id){
        return ResponseEntity.ok(service.findById(id));
    }
    
    @DeleteMapping(value ="/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<CompraDTO> delete(@PathVariable Long id){
        return ResponseEntity.ok(service.delete(id));
    }
    
    
}
