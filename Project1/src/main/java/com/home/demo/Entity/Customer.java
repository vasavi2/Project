package com.home.demo.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "customer2")
public class Customer {

	@Id
	
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator ="app1_seq")
	@SequenceGenerator(name = "app1_seq", initialValue=1001, allocationSize=1)
	public Integer customerId;

	@Column(name = "first_name")
	
	private String firstName;

	@Column(name = "middle_name")
	
	private String middleName;

	@Column(name = "last_name")
	
	private String lastName;

	@Column(name="email")
	private String email;

	@Column(name="password")
	private String password;

	@Column(name="confirmpassword")
	private String confirmPwd;

	@Column(name = "phone_no")
	
	private String phoneNo;

	@Column(name="dob")
	private String dob;

	@Column(name="gender")
	private String gender;

	@Column(name="nationality")
	private String nationality;

	@Column(name = "aadhar_no")
	
	private String aadharNo;

	@Column(name = "pan_no")
	
	private String panNo;
	
	@Column(name="is_admin")
	
	 private String isAdmin="N";

	/*
	 * @OneToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
	 * 
	 * @OneToOne(mappedBy = "customer", cascade = CascadeType.ALL) private
	 * PropertyAndIncome propertyAndIncome;
	 * 
	 * @OneToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
	 * 
	 * @OneToOne(mappedBy = "customer", cascade = CascadeType.ALL) private Loan
	 * loan;
	 * 
	 * @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL) private
	 * List<Document> docs;
	 * 
	 * @OneToOne(mappedBy = "customer", cascade = CascadeType.ALL) private Login
	 * login;
	 */
	public Customer() {

	}

	public Customer(Integer customerId, String firstName, String middleName, String lastName, String email, String password,
			String confirmPwd, String phoneNo, String dob, String gender, String nationality, String aadharNo,
			String panNo) {
		super();
		this.customerId = customerId;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.confirmPwd = confirmPwd;
		this.phoneNo = phoneNo;
		this.dob = dob;
		this.gender = gender;
		this.nationality = nationality;
		this.aadharNo = aadharNo;
		this.panNo = panNo;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer appId) {
		this.customerId = appId;
	}

	

	

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmPwd() {
		return confirmPwd;
	}

	public void setConfirmPwd(String confirmPwd) {
		this.confirmPwd = confirmPwd;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getAadharNo() {
		return aadharNo;
	}

	public void setAadharNo(String aadharNo) {
		this.aadharNo = aadharNo;
	}

	public String getPanNo() {
		return panNo;
	}

	public void setPanNo(String panNo) {
		this.panNo = panNo;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", firstName=" + firstName + ", middleName=" + middleName + ", lastName="
				+ lastName + ", email=" + email + ", password=" + password + ", confirmPwd=" + confirmPwd + ", phoneNo="
				+ phoneNo + ", dob=" + dob + ", gender=" + gender + ", nationality=" + nationality + ", aadharNo="
				+ aadharNo + ", panNo=" + panNo + "]";
	}

	

	
}
	