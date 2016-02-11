package com.tickertrek.metadata.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

// All prices are in cents. All ratios and percents are x100.
@Entity
@Table(name = "stock_quote")
public class StockQuote {
	@Id
    @GeneratedValue
    private Integer id;
	String symbol;
	Long averageDailyVolume;
	Integer bookValueCent;
	Integer changeCent;
	Integer changeFromFiftydayMovingAverageCent;
	Integer changeFromTwoHundreddayMovingAverageCent;
	Integer	changeFromYearHighCent;
	Integer	changeFromYearLowCent;
	Integer fiftydayMovingAverageCent;
	Integer lastTradePriceCent;
	Integer percebtChangeFromYearHigh;
	Integer percentChange;
	Integer percentChangeFromFiftydayMovingAverage;
	Integer percentChangeFromTwoHundreddayMovingAverage;
	Integer percentChangeFromYearLow;
	Integer shortRatio;
	Integer twoHundreddayMovingAverageCent;
	Long volume;
	Integer yearHighCent;
	Integer	yearLowCent;
	
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
	public Long getAverageDailyVolume() {
		return averageDailyVolume;
	}
	public void setAverageDailyVolume(Long averageDailyVolume) {
		this.averageDailyVolume = averageDailyVolume;
	}
	public Integer getBookValueCent() {
		return bookValueCent;
	}
	public void setBookValueCent(Integer bookValueCent) {
		this.bookValueCent = bookValueCent;
	}
	public Integer getChangeCent() {
		return changeCent;
	}
	public void setChangeCent(Integer changeCent) {
		this.changeCent = changeCent;
	}
	public Integer getChangeFromFiftydayMovingAverageCent() {
		return changeFromFiftydayMovingAverageCent;
	}
	public void setChangeFromFiftydayMovingAverageCent(
			Integer changeFromFiftydayMovingAverageCent) {
		this.changeFromFiftydayMovingAverageCent = changeFromFiftydayMovingAverageCent;
	}
	public Integer getChangeFromTwoHundreddayMovingAverageCent() {
		return changeFromTwoHundreddayMovingAverageCent;
	}
	public void setChangeFromTwoHundreddayMovingAverageCent(
			Integer changeFromTwoHundreddayMovingAverageCent) {
		this.changeFromTwoHundreddayMovingAverageCent = changeFromTwoHundreddayMovingAverageCent;
	}
	public Integer getChangeFromYearHighCent() {
		return changeFromYearHighCent;
	}
	public void setChangeFromYearHighCent(Integer changeFromYearHighCent) {
		this.changeFromYearHighCent = changeFromYearHighCent;
	}
	public Integer getChangeFromYearLowCent() {
		return changeFromYearLowCent;
	}
	public void setChangeFromYearLowCent(Integer changeFromYearLowCent) {
		this.changeFromYearLowCent = changeFromYearLowCent;
	}
	public Integer getFiftydayMovingAverageCent() {
		return fiftydayMovingAverageCent;
	}
	public void setFiftydayMovingAverageCent(Integer fiftydayMovingAverageCent) {
		this.fiftydayMovingAverageCent = fiftydayMovingAverageCent;
	}
	public Integer getLastTradePriceCent() {
		return lastTradePriceCent;
	}
	public void setLastTradePriceCent(Integer lastTradePriceCent) {
		this.lastTradePriceCent = lastTradePriceCent;
	}
	public Integer getPercebtChangeFromYearHigh() {
		return percebtChangeFromYearHigh;
	}
	public void setPercebtChangeFromYearHigh(Integer percebtChangeFromYearHigh) {
		this.percebtChangeFromYearHigh = percebtChangeFromYearHigh;
	}
	public Integer getPercentChange() {
		return percentChange;
	}
	public void setPercentChange(Integer percentChange) {
		this.percentChange = percentChange;
	}
	public Integer getPercentChangeFromFiftydayMovingAverage() {
		return percentChangeFromFiftydayMovingAverage;
	}
	public void setPercentChangeFromFiftydayMovingAverage(
			Integer percentChangeFromFiftydayMovingAverage) {
		this.percentChangeFromFiftydayMovingAverage = percentChangeFromFiftydayMovingAverage;
	}
	public Integer getPercentChangeFromTwoHundreddayMovingAverage() {
		return percentChangeFromTwoHundreddayMovingAverage;
	}
	public void setPercentChangeFromTwoHundreddayMovingAverage(
			Integer percentChangeFromTwoHundreddayMovingAverage) {
		this.percentChangeFromTwoHundreddayMovingAverage = percentChangeFromTwoHundreddayMovingAverage;
	}
	public Integer getPercentChangeFromYearLow() {
		return percentChangeFromYearLow;
	}
	public void setPercentChangeFromYearLow(Integer percentChangeFromYearLow) {
		this.percentChangeFromYearLow = percentChangeFromYearLow;
	}
	public Integer getShortRatio() {
		return shortRatio;
	}
	public void setShortRatio(Integer shortRatio) {
		this.shortRatio = shortRatio;
	}
	public Integer getTwoHundreddayMovingAverageCent() {
		return twoHundreddayMovingAverageCent;
	}
	public void setTwoHundreddayMovingAverageCent(Integer twoHundreddayMovingAverageCent) {
		this.twoHundreddayMovingAverageCent = twoHundreddayMovingAverageCent;
	}
	public Long getVolume() {
		return volume;
	}
	public void setVolume(Long volume) {
		this.volume = volume;
	}
	public Integer getYearHighCent() {
		return yearHighCent;
	}
	public void setYearHighCent(Integer yearHighCent) {
		this.yearHighCent = yearHighCent;
	}
	public Integer getYearLowCent() {
		return yearLowCent;
	}
	public void setYearLowCent(Integer yearLowCent) {
		this.yearLowCent = yearLowCent;
	}
}
