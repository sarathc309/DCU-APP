package com.banking.app.dcu.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name="account_details")
public class AccountDetails {

	@Column(nullable=false)
	private String acct_cd;
	@Id
	@GeneratedValue
	private long acct_no;

//	@OneToMany
//	private AccountReporting reporting;
	
	@Column(nullable=false)
	private int uid;
	@Column(nullable=false)
	private double balance;
	@CreationTimestamp
	@Column(nullable=false)
	private LocalDateTime date_created;
	@UpdateTimestamp
	@Column(nullable=false)
	private LocalDateTime date_updated;
	
	public AccountDetails()
	{
		
	}

	public AccountDetails(String account_cd, long account_no, int uid, double balance, LocalDateTime date_created,
			LocalDateTime date_updated) {
		super();
		this.acct_cd = account_cd;
		this.acct_no = account_no;
		this.uid = uid;
		this.balance = balance;
		this.date_created = date_created;
		this.date_updated = date_updated;
	}

	public String getAccount_cd() {
		return acct_cd;
	}

	public void setAccount_cd(String account_cd) {
		this.acct_cd = account_cd;
	}

	public long getAccount_no() {
		return acct_no;
	}

	public void setAccount_no(long account_no) {
		this.acct_no = account_no;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
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

	@Override
	public String toString() {
		return "AccountDetails [account_cd=" + acct_cd + ", account_no=" + acct_no + ", uid=" + uid + ", balance="
				+ balance + ", date_created=" + date_created + ", date_updated=" + date_updated + "]";
	}
	
	
	
	
	
	
	
	
}
