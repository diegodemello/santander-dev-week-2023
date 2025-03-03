package me.dio.domain.model;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity(name = "tb_account")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String number;

    private String agency;

    @Column(precision = 13, scale = 2)
    private BigDecimal balace;

    @Column(name = "additional_limit", precision = 13, scale = 2)
    private BigDecimal limit;

    @Version
    private Long version;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getAgency() {
        return agency;
    }

    public void setAgency(String agency) {
        this.agency = agency;
    }

    public BigDecimal getBalace() {
        return balace;
    }

    public void setBalace(BigDecimal balace) {
        this.balace = balace;
    }

    public BigDecimal getLimit() {
        return limit;
    }

    public void setLimit(BigDecimal limit) {
        this.limit = limit;
    }
}
