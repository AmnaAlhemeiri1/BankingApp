package com.eibfs.bankingapp;

import java.beans.Customizer;
import java.time.LocalDate;

import com.eibfs.bankingapp.dto.Account;
import com.eibfs.bankingapp.dto.customer;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account account = new Account();
		Account account2 = new Account();
		
		
		//when you will print the ref. then it will cal toString method implicitly
		account.setAccountNumber("AD01");
		account.setAccountHolderName("Amna");
		account.setAccountType("saving");
		account.setAddress("abudhabi");
		account.setBalance(400);
		account.setContactNumber("971522996166");
//		account.setAccountCreated(LocalDate.now());
		System.out.println(account);
//		System.out.println(account.toString());
		
		
		// Customer Class 
		customer customer = new customer();
		
		customer.setCustomerID("N007");
		customer.setCustomerName("Waad");
		customer.setContactNumber("01364565496");
		customer.setAddress("AbuDhabi");
		
		System.out.println(customer);
		//System.out.println(customer.toString());
	}

}
