package com.tickertrek.metadata.service;

import java.util.List;

import com.tickertrek.metadata.exception.StockQuoteNotFound;
import com.tickertrek.metadata.entity.StockQuote;

public interface StockQuoteService {
	public StockQuote create(StockQuote stockQuote);
	public StockQuote delete(int id) throws StockQuoteNotFound;
	public List<StockQuote> findAll();
	public StockQuote update(StockQuote stockQuote) throws StockQuoteNotFound;
	public StockQuote findById(int id);

}
