package com.example.cqrsbankingapp.domain.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Table(name = "clients")
@Entity
@Getter
@Setter
@NoArgsConstructor
public class Client extends AbstractModel {

    private String name;

    private String username;

    private String password;

    @OneToMany
    @JoinTable(
            joinColumns = @JoinColumn(name="client_id"),
            inverseJoinColumns = @JoinColumn(name="card_id")
    )
    private List<Card> cards;

    @OneToOne
    private Account account;
}
