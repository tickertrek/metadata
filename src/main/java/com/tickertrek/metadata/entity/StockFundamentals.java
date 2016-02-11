package com.tickertrek.metadata.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

// All prices are in cents. All ratios and percents are x100.
// Dates are in epoch in sec.
@Entity
@Table(name = "stock_fundamentals")
public class StockFundamentals {
	@Id
    @GeneratedValue
    private Integer id;
	String symbol;
	Long dividendPayDateSec;
	Long dividendShareCent;
	Integer dividendYield;
	Integer ebitda;
	Integer epsEstimateCurrentYearCent;
	Integer epsEstimateNextQuarterCent;
	Integer epsEstimateNextYearCent;
	Integer earningsShareCent;
	Long exDividendDateSec;
	Long marketCapitalizationMil;
	String name;
	Integer oneyrTargetPriceCent;
	Integer pegRatio;
	Integer peRatio;
	Integer priceBook;
	Integer priceSales;
	Integer priceEPSEstimateCurrentYear;
	Integer priceEPSEstimateNextYear;
	String stockExchange;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	public Long getDividendPayDateSec() {
		return dividendPayDateSec;
	}
	public void setDividendPayDateSec(Long dividendPayDateSec) {
		this.dividendPayDateSec = dividendPayDateSec;
	}
	public Long getDividendShareCent() {
		return dividendShareCent;
	}
	public void setDividendShareCent(Long dividendShareCent) {
		this.dividendShareCent = dividendShareCent;
	}
	public Integer getDividendYield() {
		return dividendYield;
	}
	public void setDividendYield(Integer dividendYield) {
		this.dividendYield = dividendYield;
	}
	public Integer getEbitda() {
		return ebitda;
	}
	public void setEbitda(Integer ebitda) {
		this.ebitda = ebitda;
	}
	public Integer getEpsEstimateCurrentYearCent() {
		return epsEstimateCurrentYearCent;
	}
	public void setEpsEstimateCurrentYearCent(Integer epsEstimateCurrentYearCent) {
		this.epsEstimateCurrentYearCent = epsEstimateCurrentYearCent;
	}
	public Integer getEpsEstimateNextQuarterCent() {
		return epsEstimateNextQuarterCent;
	}
	public void setEpsEstimateNextQuarterCent(Integer epsEstimateNextQuarterCent) {
		this.epsEstimateNextQuarterCent = epsEstimateNextQuarterCent;
	}
	public Integer getEpsEstimateNextYearCent() {
		return epsEstimateNextYearCent;
	}
	public void setEpsEstimateNextYearCent(Integer epsEstimateNextYearCent) {
		this.epsEstimateNextYearCent = epsEstimateNextYearCent;
	}
	public Integer getEarningsShareCent() {
		return earningsShareCent;
	}
	public void setEarningsShareCent(Integer earningsShareCent) {
		this.earningsShareCent = earningsShareCent;
	}
	public Long getExDividendDateSec() {
		return exDividendDateSec;
	}
	public void setExDividendDateSec(Long exDividendDateSec) {
		this.exDividendDateSec = exDividendDateSec;
	}
	public Long getMarketCapitalizationMil() {
		return marketCapitalizationMil;
	}
	public void setMarketCapitalizationMil(Long marketCapitalizationMil) {
		this.marketCapitalizationMil = marketCapitalizationMil;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getOneyrTargetPriceCent() {
		return oneyrTargetPriceCent;
	}
	public void setOneyrTargetPriceCent(Integer oneyrTargetPriceCent) {
		this.oneyrTargetPriceCent = oneyrTargetPriceCent;
	}
	public Integer getPegRatio() {
		return pegRatio;
	}
	public void setPegRatio(Integer pegRatio) {
		this.pegRatio = pegRatio;
	}
	public Integer getPeRatio() {
		return peRatio;
	}
	public void setPeRatio(Integer peRatio) {
		this.peRatio = peRatio;
	}
	public Integer getPriceBook() {
		return priceBook;
	}
	public void setPriceBook(Integer priceBook) {
		this.priceBook = priceBook;
	}
	public Integer getPriceSales() {
		return priceSales;
	}
	public void setPriceSales(Integer priceSales) {
		this.priceSales = priceSales;
	}
	public Integer getPriceEPSEstimateCurrentYear() {
		return priceEPSEstimateCurrentYear;
	}
	public void setPriceEPSEstimateCurrentYear(Integer priceEPSEstimateCurrentYear) {
		this.priceEPSEstimateCurrentYear = priceEPSEstimateCurrentYear;
	}
	public Integer getPriceEPSEstimateNextYear() {
		return priceEPSEstimateNextYear;
	}
	public void setPriceEPSEstimateNextYear(Integer priceEPSEstimateNextYear) {
		this.priceEPSEstimateNextYear = priceEPSEstimateNextYear;
	}
	public String getStockExchange() {
		return stockExchange;
	}
	public void setStockExchange(String stockExchange) {
		this.stockExchange = stockExchange;
	}
}
