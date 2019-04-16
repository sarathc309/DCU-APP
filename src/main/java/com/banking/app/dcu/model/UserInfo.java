package com.banking.app.dcu.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;


import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name="user_info")
public class UserInfo {

	@Id
	@GeneratedValue
	private int uid;
	@Column(nullable=false)
	private String first_name;
	@Column(nullable=false)
	private String last_name;
	@Column(nullable=false)
	private String e_mail;
	@Column(nullable=false,length=10)
	private long phone_no;
	@Column(nullable=false)
	private int ssn;
	@CreationTimestamp
	@Column(nullable=false)
	private LocalDateTime date_created;
	@UpdateTimestamp
	@Column(nullable=false)
	private LocalDateTime date_updated;
	
	
	
	
	public int getUid() {
		return uid;
	}

	public UserInfo( String first_name, String last_name, String e_mail, long phone_no, int ssn,
			LocalDateTime date_created, LocalDateTime date_updated) {
		super();
		
		this.first_name = first_name;
		this.last_name = last_name;
		this.e_mail = e_mail;
		this.phone_no = phone_no;
		this.ssn = ssn;
		this.date_created = date_created;
		this.date_updated = date_updated;
	}
	
	public UserInfo()
	{
		
	}
	
	

	@Override
	public String toString() {
		return "UserInfo [uid=" + uid + ", first_name=" + first_name + ", last_name=" + last_name + ", e_mail=" + e_mail
				+ ", phone_no=" + phone_no + ", ssn=" + ssn + ", date_created=" + date_created + ", date_updated="
				+ date_updated + "]";
	}

	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getE_mail() {
		return e_mail;
	}
	public void c(String e_mail) {
		this.e_mail = e_mail;
	}
	public long getPhone_no() {
		return phone_no;
	}
	public void setPhone_no(long phone_no) {
		this.phone_no = phone_no;
	}
	public int getSsn() {
		return ssn;
	}
	public void setSsn(int ssn) {
		this.ssn = ssn;
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
	
	
	
	
	
	
}
