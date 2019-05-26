package com.banking.app.dcu.model;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.stereotype.Component;

@Entity
@Table(name="account_balance")
@Component
public class AccountBalance implements Serializable{


	

//	@OneToMany
//	private AccountReporting reporting;
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@OneToOne
	private UserAccount useraccount;
	@Column(nullable=false)
	private Double balance;
	@CreationTimestamp
	@Column(nullable=false)
	private LocalDateTime date_created;
	@UpdateTimestamp
	@Column(nullable=false)
	private LocalDateTime date_updated;
	
	public AccountBalance()
	{
		
	}

	public AccountBalance(  Double balance, LocalDateTime date_created,
			LocalDateTime date_updated) {
		super();
		
		
		
		this.balance = balance;
		this.date_created = date_created;
		this.date_updated = date_updated;
	}






	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
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

	
	public UserAccount getUseraccount() {
		return useraccount;
	}

	public void setUseraccount(UserAccount useraccount) {
		this.useraccount = useraccount;
	}
	
	
	
	
	
	
	
	
	
	
	
	@Override
	public String toString() {
		return "AccountDetails [ account_no=" + " balance="
				+ balance + ", date_created=" + date_created + ", date_updated=" + date_updated + "]";
	}
	
	
	
	
	
	
	
	
}
