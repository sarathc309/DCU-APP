package com.banking.app.dcu.model;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.stereotype.Component;
@Entity
@Component
public class Account {
 
	//New change
	@OneToMany(mappedBy="account")
	private List<UserAccount> user_account;
	
	
	public List<UserAccount> getUser_account() {
		return user_account;
	}
	public void addUser_account(UserAccount account) {
		this.user_account.add(account);
	}
	public void deleteUser_account(UserAccount account) {
		this.user_account.remove(account);
	}
	
	
	
	//End

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

	public String getAcct_cd() {
		return acct_cd;
	}
	public void setAcct_cd(String acct_cd) {
		this.acct_cd = acct_cd;
	}
	public String getAcct_name() {
		return acct_name;
	}
	public void setAcct_name(String acct_name) {
		this.acct_name = acct_name;
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
