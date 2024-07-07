package com.example.common.domain.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.util.List;
import java.util.UUID;

@NoArgsConstructor
@Getter
@Setter
@Table(name = "cards")
@Entity
public class Card {

    @Id
    @GeneratedValue
    @JdbcTypeCode(SqlTypes.VARCHAR)
    private UUID id;

    private String number;
    private String date;
    private String cvv;

    @OneToMany
    @JoinTable(
            joinColumns = @JoinColumn(name = "card_id"),
            inverseJoinColumns = @JoinColumn(name = "transaction_id")
    )
    private List<Transaction> transactions;

    @ManyToOne
    private Account account;

    public Card(Account account) {
        this.account = account;
    }

}
