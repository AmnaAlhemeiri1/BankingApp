package com.eibfs.bankingapp.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
@Data
//@ToString (exclude = "accountCreated")
public class Account {
	
	// ecapsulation.
	// we will have private properties
	private String accountHolderName; 
	private String accountNumber;
	private float balance;
	private String accountType;
	private String contactNumber;
	private String address;
	
	//in a datetime format, don't want setter method.
	// exclude the setter for the "Date" to be read only
	@Getter(value=AccessLevel.NONE)
	@Setter(value = AccessLevel.NONE)
	private LocalDateTime accountCreated = LocalDateTime.now();
	
	//to check if the account is active or not , the answer will be true or false.
	private boolean isActive; 
		
	
	//toString method is overridden
	@Override
	public String toString() {
		return "Account [accountHolderName=" + accountHolderName + ", accountNumber=" + accountNumber + ", balance="
				+ balance + ", accountType=" + accountType + ", contactNumber=" + contactNumber + ", address=" + address
				+ ", accountCreated=" + accountCreated.format(DateTimeFormatter.ofPattern("dd-MM-YYYY HH:mm:SS")) + "]";
	}
}
