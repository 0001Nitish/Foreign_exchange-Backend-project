package com.example.forex.service;


import com.example.forex.exception.ForexException;
import com.example.forex.model.ConversionRate;
import com.example.forex.repository.ConversionRateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class ForexService {
    @Autowired
    private ConversionRateRepository repository;

    public double getAverageRate(String fromCurrency, String toCurrency, LocalDate startDate, LocalDate endDate) {
        List<ConversionRate> rates = repository.findByFromCurrencyAndToCurrencyAndDateBetween(fromCurrency, toCurrency, startDate, endDate);
        if (rates.isEmpty()) {
            throw new ForexException("No conversion rates found for the specified period.");
        }
        return rates.stream().mapToDouble(ConversionRate::getRate).average().orElse(0);
    }

    public ConversionRate getClosingRate(String fromCurrency, String toCurrency, LocalDate date) {
        ConversionRate rate = repository.findByFromCurrencyAndToCurrencyAndDate(fromCurrency, toCurrency, date);
        if (rate == null) {
            throw new ForexException("No closing rate found for " + fromCurrency + " to " + toCurrency + " on " + date);
        }
        return rate;
    }

    public ConversionRate addCurrencyPair(ConversionRate conversionRate) {
        return repository.save(conversionRate);
    }
}

