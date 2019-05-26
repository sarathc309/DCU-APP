package com.banking.app.dcu.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
//import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.stereotype.Component;
@Component
@Entity
public class Users implements Serializable{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
@OneToMany(mappedBy="users")
private List<UserAccount> accounts= new ArrayList<UserAccount>();	
	
	

@Id
@SequenceGenerator(sequenceName="id_gen", name = "myseq",initialValue=10512,allocationSize=1)
@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="myseq")
private Integer uid;

@NotNull(message="required")
@Size(min=1, message="minimun 1 letter is required")
@Column(nullable=false)
private String user_name;
@NotNull(message="required")
@Size(min=1, message="minimun 1 letter is required")
@Column(nullable=false)
private String password;
@CreationTimestamp
@Column(nullable=false)
private LocalDateTime date_created;
@UpdateTimestamp
@Column(nullable=false)
private LocalDateTime date_updated;
public Integer getUid() {
	return uid;
}
public String getUser_name() {
	return user_name;
}
public String getPassword() {
	return password;
}
public LocalDateTime getDate_created() {
	return date_created;
}
public LocalDateTime getDate_updated() {
	return date_updated;
}
public void setUser_name(String user_name) {
	this.user_name = user_name;
}
public void setPassword(String password) {
	this.password = password;
}
public void setDate_created(LocalDateTime date_created) {
	this.date_created = date_created;
}
public void setDate_updated(LocalDateTime date_updated) {
	this.date_updated = date_updated;
}

public List<UserAccount> getAccounts() {
	return accounts;
}
public void addUserAccount(UserAccount account) {
	this.accounts.add(account) ;
}
public void removeUserAccount(UserAccount account) {
	this.accounts.remove(account) ;
}



//public UserInfo getInfo() {
//	return info;
//}
//public void setInfo(UserInfo info) {
//	this.info = info;
// }
@Override
public String toString() {
	return "Users [uid=" + uid + ", user_name=" + user_name + ", password=" + password + ", date_created="
			+ date_created + ", date_updated=" + date_updated + "]";
}


//
//
public Users(String user_name, String password, LocalDateTime date_created, LocalDateTime date_updated) {
	super();
	this.user_name = user_name;
	this.password = password;
	this.date_created = date_created;
	this.date_updated = date_updated;
}
public Users()
{
	
}
}
