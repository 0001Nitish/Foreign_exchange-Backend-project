package com.example.forex.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
@Getter
@Setter
public class AverageConversionRateDTO {
    private String fromCurrency;
    private String toCurrency;
    private LocalDate startDate;
    private LocalDate endDate;
    private double averageRate;

    public AverageConversionRateDTO(String fromCurrency, String toCurrency, LocalDate startDate, LocalDate endDate, double averageRate) {
        this.fromCurrency = fromCurrency;
        this.toCurrency = toCurrency;
        this.startDate = startDate;
        this.endDate = endDate;
        this.averageRate = averageRate;
    }
}
