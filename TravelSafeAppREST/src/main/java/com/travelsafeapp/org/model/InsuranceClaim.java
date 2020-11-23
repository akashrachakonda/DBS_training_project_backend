package com.travelsafeapp.org.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="insuranceclaim")
public class InsuranceClaim {
	@Id
	private int serialNum;
	private String customerId;
	private String accidentalDeath;
	private String burglaryInsurance;
	private String medicalCoverage;
	private String name;
	private String totalPrice;
	private String travelDelay;
	private String tripCancellation;
	public int getSerialNum() {
		return serialNum;
	}
	public void setSerialNum(int serialNum) {
		this.serialNum = serialNum;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getAccidentalDeath() {
		return accidentalDeath;
	}
	public void setAccidentalDeath(String accidentalDeath) {
		this.accidentalDeath = accidentalDeath;
	}
	public String getBurglaryInsurance() {
		return burglaryInsurance;
	}
	public void setBurglaryInsurance(String burglaryInsurance) {
		this.burglaryInsurance = burglaryInsurance;
	}
	public String getMedicalCoverage() {
		return medicalCoverage;
	}
	public void setMedicalCoverage(String medicalCoverage) {
		this.medicalCoverage = medicalCoverage;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(String totalPrice) {
		this.totalPrice = totalPrice;
	}
	public String getTravelDelay() {
		return travelDelay;
	}
	public void setTravelDelay(String travelDelay) {
		this.travelDelay = travelDelay;
	}
	public String getTripCancellation() {
		return tripCancellation;
	}
	public void setTripCancellation(String tripCancellation) {
		this.tripCancellation = tripCancellation;
	}
	public InsuranceClaim(int serialNum, String customerId, String accidentalDeath, String burglaryInsurance,
			String medicalCoverage, String name, String totalPrice, String travelDelay, String tripCancellation) {
		super();
		this.serialNum = serialNum;
		this.customerId = customerId;
		this.accidentalDeath = accidentalDeath;
		this.burglaryInsurance = burglaryInsurance;
		this.medicalCoverage = medicalCoverage;
		this.name = name;
		this.totalPrice = totalPrice;
		this.travelDelay = travelDelay;
		this.tripCancellation = tripCancellation;
	}
	public InsuranceClaim() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
