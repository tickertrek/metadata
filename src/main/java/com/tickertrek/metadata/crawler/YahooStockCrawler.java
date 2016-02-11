package com.tickertrek.metadata.crawler;

import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.io.*;

import org.json.*;

import com.tickertrek.metadata.entity.StockQuote;

public class YahooStockCrawler implements StockCrawler {
	private final String BASE_URL = "http://query.yahooapis.com/v1/public/yql?q=";
	private final String YQL = "select%20*%20from%20yahoo.finance.quotes%20where%20symbol%20in%20(";
	private final String FORMAT = ")&env=store://datatables.org/alltableswithkeys&format=json";
	public StockQuote getStockQuote(String ticker) {
		StockQuote quote = new StockQuote();
		if (!ticker.isEmpty()) {
			System.out.println("Getting data for: " + ticker);
			try {
				String queryUrl = BASE_URL + YQL + "'" + ticker + "'" + FORMAT;
                URL url = new URL(queryUrl);
                URLConnection yc = url.openConnection();
                BufferedReader in = new BufferedReader(new InputStreamReader(yc.getInputStream()));
                String inputLine="";
				String buffer = "";
		        while ((inputLine = in.readLine()) != null) {
		        	buffer += inputLine;
				}
                try {
                	System.out.println("Called at initialization: " + inputLine);
                    JSONObject result = new JSONObject(buffer);                    
                    System.out.println("Received Data: " + result);
                    } catch (Exception e) {
                    	e.printStackTrace();
                    }
                in.close();
                } catch(Exception e) {
                	e.printStackTrace();
		        }
			}
		return quote;
		}
	public Map<String, StockQuote> getStockQuote(List<String> tickers) {
		return new HashMap<String, StockQuote>();
	}
	
}
// http://query.yahooapis.com/v1/public/yql?q=select+*+from%20yahoo.finance.quotes%20where%20symbol%20in%20(%22AAPL%22)&env=store://datatables.org/alltableswithkeys
// http://query.yahooapis.com/v1/public/yql?q=select+*+from+yahoo.finance.quotes+where+symbol+in+%28%27aapl%27%29%26env%3Dstore%3A%2F%2Fdatatables.org%2Falltableswithkeys	

