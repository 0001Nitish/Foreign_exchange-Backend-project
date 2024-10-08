package com.example.forex.controller;



import com.example.forex.dto.AverageConversionRateDTO;
import com.example.forex.dto.ClosingConversionRateDTO;
import com.example.forex.model.ConversionRate;
import com.example.forex.service.ForexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@RestController
@RequestMapping("/api/forex")
public class ForexRateController {
    @Autowired
    private ForexService service;

    @GetMapping("/average")
    public AverageConversionRateDTO getAverage(@RequestParam String fromCurrency,
                                               @RequestParam String toCurrency,
                                               @RequestParam String startDate,
                                               @RequestParam String endDate) {
        double averageRate = service.getAverageRate(fromCurrency, toCurrency, LocalDate.parse(startDate), LocalDate.parse(endDate));
        return new AverageConversionRateDTO(fromCurrency, toCurrency, LocalDate.parse(startDate), LocalDate.parse(endDate), averageRate);
    }

    @GetMapping("/closing")
    public ClosingConversionRateDTO getClosing(@RequestParam String fromCurrency,
                                               @RequestParam String toCurrency,
                                               @RequestParam String date) {
        ConversionRate rate = service.getClosingRate(fromCurrency, toCurrency, LocalDate.parse(date));
        return new ClosingConversionRateDTO(fromCurrency, toCurrency, rate.getRate(), rate.getDate());
    }

    @PostMapping("/add")
    public ConversionRate addCurrencyPair(@RequestBody ConversionRate conversionRate) {
        return service.addCurrencyPair(conversionRate);
    }
}

