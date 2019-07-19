package be.businesstraining.repository;

import be.businesstraining.domain.Immo;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ImmoRepository
        extends JpaRepository<Immo, Long> {

}
