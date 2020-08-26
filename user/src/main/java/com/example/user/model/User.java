package com.example.user.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Integer id;
	@Column(name = "user_name")
	private String username;
	@Column(name = "password")
    private String password;
	@Column(name = "user_type")
    private String userType;
	@Column(name ="email")
    private String email;
	@Column(name = "mobile_number")
    private long mobileNumber;
	@Column(name="confirmed")
    private String confirmed;
	    
		public User(int id, String password, String userType, String email, long mobileNumber, String confirmed) {
			super();
			this.id = id;
			this.password = password;
			this.userType = userType;
			this.email = email;
			this.mobileNumber = mobileNumber;
			this.confirmed = confirmed;
		}
		public User() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getUserType() {
			return userType;
		}
		public void setUserType(String userType) {
			this.userType = userType;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public long getMobileNumber() {
			return mobileNumber;
		}
		public void setMobileNumber(long mobileNumber) {
			this.mobileNumber = mobileNumber;
		}
		public String getConfirmed() {
			return confirmed;
		}
		public void setConfirmed(String confirmed) {
			this.confirmed = confirmed;
		}
	    
	
	
}
