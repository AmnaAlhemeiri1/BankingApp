package com.eibfs.bankingapp.dto;

import lombok.Data;

@Data
public class customer {
	private String customerID; 
	private String customerName;
	private String contactNumber;
	private String address;
	
	
	@Override
	public String toString() {
		return "Customer [customerID=" + customerID + ", customerName=" + customerName + ", contactNumber="
				+ contactNumber + ", address=" + address + "]";
}
}