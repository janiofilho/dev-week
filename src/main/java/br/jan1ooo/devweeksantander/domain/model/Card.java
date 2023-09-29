package br.jan1ooo.devweeksantander.domain.model;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "tb_card")
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_card;

    @Column(unique = true)
    private String number;

    @Column(name = "available_limit",precision = 13, scale = 2)
    private BigDecimal limit;
}
