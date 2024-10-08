package com.example.forex.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
@Setter
@Getter
@Entity
@Table(name = "conversion_rates")
public class ConversionRate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "from_currency", nullable = false)
    private String fromCurrency;

    @Column(name = "to_currency", nullable = false)
    private String toCurrency;

    @Column(nullable = false)
    private double rate;

    @Column(nullable = false)
    private LocalDate date;

    // Constructors
    public ConversionRate() {}

    public ConversionRate(String fromCurrency, String toCurrency, double rate, LocalDate date) {
        this.fromCurrency = fromCurrency;
        this.toCurrency = toCurrency;
        this.rate = rate;
        this.date = date;
    }



    // Getters and setters
}
