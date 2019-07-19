package be.businesstraining.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name= "Immobiliers")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Immo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String adress;
    private String pictureUrl;
    private BigDecimal price;
    private BigDecimal surfaceArea;
    private String contact;
}
