package com.example.stockspring.model;

import java.util.Date;
import java.util.List;

public class StockPrice {
	private String stockCode;
	private List<String> stockExchanges;
	private double currentPrice;
	private Date date;
	private String time;
	public String getStockCode() {
		return stockCode;
	}
	public void setStockCode(String stockCode) {
		this.stockCode = stockCode;
	}
	public List<String> getStockExchanges() {
		return stockExchanges;
	}
	public void setStockExchanges(List<String> stockExchanges) {
		this.stockExchanges = stockExchanges;
	}
	public double getCurrentPrice() {
		return currentPrice;
	}
	public void setCurrentPrice(double currentPrice) {
		this.currentPrice = currentPrice;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	

}
