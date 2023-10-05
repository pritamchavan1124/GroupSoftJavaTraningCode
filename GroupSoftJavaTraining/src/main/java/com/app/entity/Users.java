package com.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.Length;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="users_tbl")
public class Users{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

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

	public Users(long id, String custFirstName, String custLastName, String custEmail, String custMobileNo, int custAge,
			String gender, String city, String password) {
		super();
		this.id = id;
		this.custFirstName = custFirstName;
		this.custLastName = custLastName;
		this.custEmail = custEmail;
		this.custMobileNo = custMobileNo;
		this.custAge = custAge;
		this.gender = gender;
		this.city = city;
		this.password = password;
	}
	

	public Users() {
		
	}


	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCustFirstName() {
		return custFirstName;
	}

	public void setCustFirstName(String custFirstName) {
		this.custFirstName = custFirstName;
	}

	public String getCustLastName() {
		return custLastName;
	}

	public void setCustLastName(String custLastName) {
		this.custLastName = custLastName;
	}

	public String getCustEmail() {
		return custEmail;
	}

	public void setCustEmail(String custEmail) {
		this.custEmail = custEmail;
	}

	public String getCustMobileNo() {
		return custMobileNo;
	}

	public void setCustMobileNo(String custMobileNo) {
		this.custMobileNo = custMobileNo;
	}

	public int getCustAge() {
		return custAge;
	}

	public void setCustAge(int custAge) {
		this.custAge = custAge;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Users [id=" + id + ", custFirstName=" + custFirstName + ", custLastName=" + custLastName
				+ ", custEmail=" + custEmail + ", custMobileNo=" + custMobileNo + ", custAge=" + custAge + ", gender="
				+ gender + ", city=" + city + ", password=" + password + "]";
	}
	
	
}
