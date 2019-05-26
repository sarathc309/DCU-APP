package com.banking.app.dcu.model;

import java.io.Serializable;
//import java.math.BigInteger;
import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.PersistenceContext;
//import javax.persistence.Query;
import javax.persistence.Table;
//import javax.persistence.SequenceGenerator;
//import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//import com.banking.app.dcu.dao.AccountNumberSequence;

@Entity
@Component
@Table(name="user_account")
public class UserAccount implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
//@Autowired
//@Transient
//private AccountNumberSequence sequence;
	
//@Autowired
//@Transient	
//@PersistenceContext	
//EntityManager manager;	
	
@ManyToOne
private Users users;


@OneToOne(mappedBy="useraccount")
private AccountBalance balance;

@Id
//@SequenceGenerator(sequenceName="acct_id", name = "my_acct_seq",initialValue=1000001,allocationSize=1)
//@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="my_acct_seq")
@Column(nullable=false)
private String account_no;
@Column(nullable=false)
private String acct_cd;
@CreationTimestamp
@Column(nullable=false)
private LocalDateTime date_created;
@UpdateTimestamp
@Column(nullable=false)
private LocalDateTime date_updated;
@Column(nullable=false)
private String is_account_active;
public String getAccount_no() {
	return account_no;
}
public void setAccount_no(String account_no) {
//	
//	
//	Query q=this.manager.createNativeQuery("select acct_num.nextval from DUAL");
//	BigInteger result=(BigInteger) q.getSingleResult();
//	
	  this.account_no=account_no;
}
public String getAcct_cd() {
	return acct_cd;
}
public void setAcct_cd(String acct_cd) {
	this.acct_cd = acct_cd;
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
public String getIs_account_active() {
	return is_account_active;
}
public void setIs_account_active(String is_account_active) {
	this.is_account_active = is_account_active;
}
public Users getUsers() {
	return users;
}
public void setUsers(Users users) {
	this.users = users;
}

public AccountBalance getBalance() {
	return balance;
}
//public void setBalance(AccountBalance balance) {
//	this.balance = balance;
//}
public UserAccount() 
{
	
}
public UserAccount(String acct_cd,
		LocalDateTime date_created, LocalDateTime date_updated, String is_account_active) {
	super();
	
	//this.users = users;
	//this.account_no = account_no;
	this.acct_cd = acct_cd;
	this.date_created = date_created;
	this.date_updated = date_updated;
	this.is_account_active = is_account_active;
}
@Override
public String toString() {
	return "UserAccount [users=" + users + ", account_no=" + account_no + ", acct_cd="
			+ acct_cd + ", date_created=" + date_created + ", date_updated=" + date_updated + ", is_account_active="
			+ is_account_active + "]";
}
}
