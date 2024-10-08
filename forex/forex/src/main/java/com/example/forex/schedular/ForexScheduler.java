package com.example.forex.schedular;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ForexScheduler {

    // You would replace this with your scraping logic
    @Scheduled(cron = "0 0 6 * * ?")  // Run every day at 6 AM
    public void scrapeForexData() {
        // Implement scraping logic here
    }
}