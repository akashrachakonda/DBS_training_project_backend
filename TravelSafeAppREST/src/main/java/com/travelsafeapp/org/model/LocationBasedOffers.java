package com.travelsafeapp.org.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="lbo4")
public class LocationBasedOffers {
		
		@Id
		private int serialNum;
		private String latitude;
		private String longitude;
		private String countryCode ;
		private String offerId;
		private String offerCategory;
		private String offerDesc;
		private String startDate;
		private String endDate;
		private String iconName;
		private String couponCode;
		
		public int getSerialNum() {
			return serialNum;
		}
		public void setSerialNum(int serialNum) {
			this.serialNum = serialNum;
		}
		public String getLatitude() {
			return latitude;
		}
		public void setLatitude(String latitude) {
			this.latitude = latitude;
		}
		public String getLongitude() {
			return longitude;
		}
		public void setLongitude(String longitude) {
			this.longitude = longitude;
		}
		public String getCountryCode() {
			return countryCode;
		}
		public void setCountryCode(String countryCode) {
			this.countryCode = countryCode;
		}
		public String getOfferId() {
			return offerId;
		}
		public void setOfferId(String offerId) {
			this.offerId = offerId;
		}
		public String getOfferCategory() {
			return offerCategory;
		}
		public void setOfferCategory(String offerCategory) {
			this.offerCategory = offerCategory;
		}
		public String getOfferDesc() {
			return offerDesc;
		}
		public void setOfferDesc(String offerDesc) {
			this.offerDesc = offerDesc;
		}
		public String getStartDate() {
			return startDate;
		}
		public void setStartDate(String startDate) {
			this.startDate = startDate;
		}
		public String getEndDate() {
			return endDate;
		}
		public void setEndDate(String endDate) {
			this.endDate = endDate;
		}
		public String getIconName() {
			return iconName;
		}
		public void setIconName(String iconName) {
			this.iconName = iconName;
		}
		public String getCouponCode() {
			return couponCode;
		}
		public void setCouponCode(String couponCode) {
			this.couponCode = couponCode;
		}
		
		
		
		

}
