package be.businesstraining.services;

import be.businesstraining.domain.Immo;

import java.util.Set;

public interface ImmoService {

    Set<Immo> allImmo();
    Immo getImmoById(Long id);
}
