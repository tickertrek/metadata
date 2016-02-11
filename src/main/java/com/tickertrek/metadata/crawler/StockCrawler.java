package com.tickertrek.metadata.crawler;

import com.tickertrek.metadata.entity.StockQuote;

public interface StockCrawler {
	public StockQuote getStockQuote(String ticker);
}

