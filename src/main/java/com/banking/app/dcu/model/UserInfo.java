package com.banking.app.dcu.model;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.stereotype.Component;
@Component
@Entity
@Table(name="user_info")
public class UserInfo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
//	@GeneratedValue
//	private int uid;
	@OneToOne(fetch=FetchType.LAZY)
	private Users users;
	
	@Column(nullable=false)
	@NotNull(message="required")
	@Size(min=1, message="minimun 1 letter is required")
	private String first_name;
	@Column(nullable=false)
	@NotNull(message="required")
	@Size(min=1, message="minimun 1 letter is required")
	private String last_name;
	@Column(nullable=false)
	@NotNull(message="required")
	@Size(min=1, message="minimun 1 letter is required")
	private String e_mail;

	@Column(nullable=false,length=10)
	@NotNull(message="required")
	@Min(value=2000000000L)
	@Max(value=9999999999L)
	private Long phone_no;

	@Column(nullable=false)
	@NotNull(message="required")
	@Min(value=123456789)
	@Max(value=999999999)
	private Integer ssn;
	@CreationTimestamp
	@Column(nullable=false)
	private LocalDateTime date_created;
	@UpdateTimestamp
	@Column(nullable=false)
	private LocalDateTime date_updated;
//	public int getUid() {
//		return uid;
//	}

	public UserInfo( String first_name, String last_name, String e_mail, long phone_no, int ssn,
			LocalDateTime date_created, LocalDateTime date_updated) {
		super();
		
		//System.out.println("Inside UserINfo Constuctor");
		
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
		return "UserInfo  first_name=" + first_name + ", last_name=" + last_name + ", e_mail=" + e_mail
				+ ", phone_no=" + phone_no + ", ssn=" + ssn + ", date_created=" + date_created + ", date_updated="
				+ date_updated + "]";
	}

	
	
	
	
	
	
	
	public Users getUsers() {
		return users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		
		//System.out.println("Setting first_name"+first_name);
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		
		//System.out.println("Setting last_name"+last_name);
		this.last_name = last_name;
	}
	
	public String getE_mail() {
		return e_mail;
	}

	public void setE_mail(String e_mail) {
		this.e_mail = e_mail;
	}
	
	
	
	public Long getPhone_no() {
		return phone_no;
	}
	public void setPhone_no(Long phone_no) {
		this.phone_no = phone_no;
	}
	public Integer getSsn() {
		return ssn;
	}
	public void setSsn(Integer ssn) {
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
