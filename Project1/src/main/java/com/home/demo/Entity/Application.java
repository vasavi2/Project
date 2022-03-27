package com.home.demo.Entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "application123")
public class Application {
	@Column(name = "property_loc")
	private String propertyLoc;

	@Column(name = "property_name")
	private String propertyName;

	@Column(name = "estimated_amt")
	private int propertyEstimatedAmount;

	@Column(name = "type_of_emp")
	private String typeOfEmployment;

	@Column(name = "ret_age")
	private Integer retirementAge;

	@Column(name = "org_type")
	private String orgType;

	@Column(name = "income")
	private int income;

	@OneToMany(mappedBy = "application", cascade = CascadeType.ALL)
	private List<Document> docs;

	@Id
	@Column(name = "appId")
	private Integer appId;

	@ManyToOne
	@JoinColumn(name = "customerId")
	private Customer customer;

	public Integer getAppId() {
		return appId;
	}

	public void setAppId(Integer appId) {
		this.appId = appId;
	}

	public String getPropertyLoc() {
		return propertyLoc;
	}

	public void setPropertyLoc(String propertyLoc) {
		this.propertyLoc = propertyLoc;
	}

	public String getPropertyName() {
		return propertyName;
	}

	public void setPropertyName(String propertyName) {
		this.propertyName = propertyName;
	}

	public int getPropertyEstimatedAmount() {
		return propertyEstimatedAmount;
	}

	public void setPropertyEstimatedAmount(int propertyEstimatedAmount) {
		this.propertyEstimatedAmount = propertyEstimatedAmount;
	}

	public String getTypeOfEmployment() {
		return typeOfEmployment;
	}

	public void setTypeOfEmployment(String typeOfEmployment) {
		this.typeOfEmployment = typeOfEmployment;
	}

	public Integer getRetirementAge() {
		return retirementAge;
	}

	public void setRetirementAge(Integer retirementAge) {
		this.retirementAge = retirementAge;
	}

	public String getOrgType() {
		return orgType;
	}

	public void setOrgType(String orgType) {
		this.orgType = orgType;
	}

	public int getIncome() {
		return income;
	}

	public void setIncome(int income) {
		this.income = income;
	}

	public List<Document> getDocs() {
		return docs;
	}

	public void setDocs(List<Document> docs) {
		this.docs = docs;
	}

	public Application(Integer appId, String propertyLoc, String propertyName, int propertyEstimatedAmount,
			String typeOfEmployment, Integer retirementAge, String orgType, int income) {
		super();
		this.appId = appId;
		this.propertyLoc = propertyLoc;
		this.propertyName = propertyName;
		this.propertyEstimatedAmount = propertyEstimatedAmount;
		this.typeOfEmployment = typeOfEmployment;
		this.retirementAge = retirementAge;
		this.orgType = orgType;
		this.income = income;
	}

	@Override
	public String toString() {
		return "Application [propertyLoc=" + propertyLoc + ", propertyName=" + propertyName
				+ ", propertyEstimatedAmount=" + propertyEstimatedAmount + ", typeOfEmployment=" + typeOfEmployment
				+ ", retirementAge=" + retirementAge + ", orgType=" + orgType + ", income=" + income + ", docs=" + docs
				+ ", appId=" + appId + "]";
	}

	public Application() {
		super();

	}

}