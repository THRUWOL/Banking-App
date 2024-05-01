package com.example.cqrsbankingapp.domain.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.util.List;
import java.util.UUID;

@Table(name = "cards")
@Entity
@Getter
@Setter
@NoArgsConstructor
public class Card extends AbstractModel{

    private String number;

    private String date;

    @OneToMany
    @JoinTable(
            joinColumns = @JoinColumn(name="card_id"),
            inverseJoinColumns = @JoinColumn(name="transaction_id")
    )
    private List<Transaction> transactions;

    @ManyToOne
    private Account account;
}
