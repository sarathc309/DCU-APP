package com.banking.app.dcu.model;

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

@Entity
@Table(name="account_reporting")
public class AccountReporting {

	@Column(nullable=false)
	private String acct_cd;
	@Id
	@GeneratedValue
	private long acct_no;
	@Column(nullable=false)
	private double amount;
	@Column(nullable=false)
	private String trans_type;
//	@OneToOne
//	private AccountDetails details;
	
	@Column(nullable=false)
	private String memo;
	@CreationTimestamp
	@Column(nullable=false)
	private LocalDateTime date_created;
	@UpdateTimestamp
	@Column(nullable=false)
	private LocalDateTime date_updated;
	public AccountReporting()
	{
		
	}
	public AccountReporting(String account_cd, long account_no, double amount, String trans_type, String memo,
			LocalDateTime date_created, LocalDateTime date_updated) {
		super();
		this.acct_cd = account_cd;
		this.acct_no = account_no;
		this.amount = amount;
		this.trans_type = trans_type;
		this.memo = memo;
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
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getTrans_type() {
		return trans_type;
	}
	public void setTrans_type(String trans_type) {
		this.trans_type = trans_type;
	}
	public String getMemo() {
		return memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
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
		return "AccountReporting [account_cd=" + acct_cd + ", account_no=" + acct_no + ", amount=" + amount
				+ ", trans_type=" + trans_type + ", memo=" + memo + ", date_created=" + date_created + ", date_updated="
				+ date_updated + "]";
	}
	
}
