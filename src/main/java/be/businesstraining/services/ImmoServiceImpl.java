package be.businesstraining.services;

import be.businesstraining.domain.Immo;
import be.businesstraining.repository.ImmoRepository;
import org.springframework.stereotype.Service;


import java.util.HashSet;
import java.util.Set;

@Service
// Ou @AllArgsConstructor a la place du Constructeur de Repository
public class ImmoServiceImpl implements ImmoService {

    // Ou @Autowired a la place du constructeur
    private ImmoRepository repository;

    public ImmoServiceImpl(ImmoRepository repository) {
        this.repository = repository;
    }

    @Override
    public Set<Immo> allImmo() {
        return new HashSet<>(repository.findAll());
    }

    @Override
    public Immo getImmoById(Long id) {
        return repository.findById(id).orElse(null);
    }
}
