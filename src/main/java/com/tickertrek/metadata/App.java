package com.tickertrek.metadata;

import com.tickertrek.metadata.crawler.StockCrawler;
import com.tickertrek.metadata.crawler.YahooStockCrawler;

public class App {
    public static void main( String[] args )
    {
	StockCrawler crawler = new YahooStockCrawler();
	crawler.getStockQuote("GOOG");	
    }
}
