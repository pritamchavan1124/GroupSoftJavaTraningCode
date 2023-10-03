package com.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="users_tbl")
public class Users extends BaseEntity{
	
	@Column(name="custFName", length = 15,nullable = false)
	private String custFirstName;
	
	@Column(name="custLName", length = 15,nullable = false)
	private String custLastName;
	
	@Column(name="custEmail", length = 50,nullable = false)
	private String custEmail;
	
	@Column(name="custMob", length = 50,nullable = false)
	private String custMobileNo;
	
	@Column(name="custAge")
	private int custAge;
	
	@Column(name="custGender", length = 15)
	private String gender;
	
	@Column(name="custCity", length = 15)
	private String city;
	
	@Column(name="custPassword", length = 400)
	private String password;
}
