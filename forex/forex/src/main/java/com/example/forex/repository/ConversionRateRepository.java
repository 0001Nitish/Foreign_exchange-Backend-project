package com.example.forex.repository;

import com.example.forex.model.ConversionRate;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface ConversionRateRepository extends JpaRepository<ConversionRate, Long> {
    List<ConversionRate> findByFromCurrencyAndToCurrencyAndDateBetween(String fromCurrency, String toCurrency, LocalDate startDate, LocalDate endDate);

    ConversionRate findByFromCurrencyAndToCurrencyAndDate(String fromCurrency, String toCurrency, LocalDate date);
}