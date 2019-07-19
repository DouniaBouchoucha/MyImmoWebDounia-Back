package be.businesstraining.rest;

import be.businesstraining.domain.Immo;
import be.businesstraining.services.ImmoService;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@CrossOrigin(origins = "*")
@RestController // + Responsebody
@RequestMapping("/immo")
public class ImmoResource {


    private ImmoService service;

    public ImmoResource(ImmoService service) {
        this.service = service;
    }

    @GetMapping
    public Set<Immo> allImmo() {
        return service.allImmo();
    }
    @GetMapping("/{id}")
    public Immo getImmoById(@PathVariable Long id) {
        return service.getImmoById(id);
    }


}
