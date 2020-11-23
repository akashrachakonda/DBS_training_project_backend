package com.travelsafeapp.org.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@Table(name="offersclaimed")
public class ClaimedOffers {
		
	@Id
	private int serialNum;
		private String customerId;
		private String couponCode;
		private String offerCategory;
		private String offerDescription;
		private String endDate;
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
		public String getOfferCategory() {
			return offerCategory;
		}
		public void setOfferCategory(String offerCategory) {
			this.offerCategory = offerCategory;
		}
		public String getOfferDescription() {
			return offerDescription;
		}
		public void setOfferDescription(String offerDescription) {
			this.offerDescription = offerDescription;
		}
		
		public String getCouponCode() {
			return couponCode;
		}
		public void setCouponCode(String couponCode) {
			this.couponCode = couponCode;
		}
		
		
		public String getEndDate() {
			return endDate;
		}
		public void setEndDate(String endDate) {
			this.endDate = endDate;
		}
		
		public ClaimedOffers(int serialNum, String customerId, String couponCode, String offerCategory,
				String offerDescription, String endDate) {
			super();
			this.serialNum = serialNum;
			this.customerId = customerId;
			this.couponCode = couponCode;
			this.offerCategory = offerCategory;
			this.offerDescription = offerDescription;
			this.endDate = endDate;
		}
		public ClaimedOffers() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		
		

}