package com.example.stockspring.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="ipo_planned")
public class IPODetail {
	
@Id
private int id;

@Column(name="Company_code")
private int companycode;

@Column(name=" Stock_exchange")
private String stockExchanges;

@Column(name="price_per_share")
private double price;

@Column(name="total_no_of_shares")
private int totalShares;

@Column(name="open_date_time")
private Date dateTime;

@Column(name="remarks")
private String remarks;

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public int getCompanycode() {
	return companycode;
}

public void setCompanycode(int companycode) {
	this.companycode = companycode;
}

public String getStockExchanges() {
	return stockExchanges;
}

public void setStockExchanges(String stockExchanges) {
	this.stockExchanges = stockExchanges;
}

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}

public int getTotalShares() {
	return totalShares;
}

public void setTotalShares(int totalShares) {
	this.totalShares = totalShares;
}

public Date getDateTime() {
	return dateTime;
}

public void setDateTime(Date dateTime) {
	this.dateTime = dateTime;
}

public String getRemarks() {
	return remarks;
}

public void setRemarks(String remarks) {
	this.remarks = remarks;
}




}
