package com.banking.app.dcu.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
@Entity
public class Account {
 
	@Id
	@Column(nullable=false)
	private String acct_cd;
	@Column(nullable=false)
	private String acct_name;
	@CreationTimestamp
	@Column(nullable=false)
	private LocalDateTime date_created;
	@UpdateTimestamp
	@Column(nullable=false)
	private LocalDateTime date_updated;
	public String getAccount_cd() {
		return acct_cd;
	}
	public void setAccount_cd(String account_cd) {
		this.acct_cd = account_cd;
	}
	public String getAccount_name() {
		return acct_name;
	}
	public void setAccount_name(String account_name) {
		this.acct_name = account_name;
	}
	public LocalDateTime getDate_created() {
		return date_created;
	}
	public void setDate_created(LocalDateTime date_created) {
		this.date_created = date_created;
	}
	public LocalDateTime getDate_updated() {
		return date_updated;
	}
	public void setDate_updated(LocalDateTime date_updated) {
		this.date_updated = date_updated;
	}
	@Override
	public String toString() {
		return "Account [account_cd=" + acct_cd + ", account_name=" + acct_name + ", date_created=" + date_created
				+ ", date_updated=" + date_updated + "]";
	}
	public Account(String account_cd, String account_name, LocalDateTime date_created, LocalDateTime date_updated) {
		super();
		this.acct_cd = account_cd;
		this.acct_name = account_name;
		this.date_created = date_created;
		this.date_updated = date_updated;
	}
	
	
	public Account()
	{
		
	}
	
}
