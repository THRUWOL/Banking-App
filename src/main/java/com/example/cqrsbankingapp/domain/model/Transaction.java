package com.example.cqrsbankingapp.domain.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Table(name = "transactions")
@Entity
@Getter
@Setter
@NoArgsConstructor
public class Transaction extends AbstractModel{

    @ManyToOne
    private Card from;

    @ManyToOne
    private Card to;

    private BigDecimal amount;
}
