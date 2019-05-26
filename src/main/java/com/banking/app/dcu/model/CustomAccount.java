package com.banking.app.dcu.model;

public class CustomAccount {
	
private String acct_name;

private Double amount;

public String getAcct_name() {
	return acct_name;
}

public void setAcct_name(String acct_name) {
	this.acct_name = acct_name;
}

public Double getAmount() {
	return amount;
}

public void setAmount(Double amount) {
	this.amount = amount;
}

public CustomAccount(String acct_name, Double amount) {
	super();
	this.acct_name = acct_name;
	this.amount = amount;
}

@Override
public String toString() {
	return "CustomAccount [acct_name=" + acct_name + ", amount=" + amount + "]";
}
	

}
