package com.example.forex.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class ClosingConversionRateDTO {
    private String fromCurrency;
    private String toCurrency;
    private double closingRate;
    private LocalDate date;

    public ClosingConversionRateDTO(String fromCurrency, String toCurrency, double closingRate, LocalDate date) {
        this.fromCurrency = fromCurrency;
        this.toCurrency = toCurrency;
        this.closingRate = closingRate;
        this.date = date;
    }
}
