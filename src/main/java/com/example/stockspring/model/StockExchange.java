package com.example.stockspring.model;

import java.util.List;

public class StockExchange {
private int stockExchangeId;
private List<String> stockExchanges;
private String brief;
private String address;
private String remarks;
public int getStockExchangeId() {
	return stockExchangeId;
}
public void setStockExchangeId(int stockExchangeId) {
	this.stockExchangeId = stockExchangeId;
}
public List<String> getStockExchanges() {
	return stockExchanges;
}
public void setStockExchanges(List<String> stockExchanges) {
	this.stockExchanges = stockExchanges;
}
public String getBrief() {
	return brief;
}
public void setBrief(String brief) {
	this.brief = brief;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getRemarks() {
	return remarks;
}
public void setRemarks(String remarks) {
	this.remarks = remarks;
}


}
