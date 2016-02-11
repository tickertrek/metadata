package com.tickertrek.metadata.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tickertrek.metadata.entity.StockQuote;

public interface StockQuoteRepository extends JpaRepository<StockQuote, Integer> {

}
