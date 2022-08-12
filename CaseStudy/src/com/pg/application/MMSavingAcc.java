package com.pg.application;

import com.pg.framework.SavingAcc;

public class MMSavingAcc extends SavingAcc {
	private static final float MINBAL = 200;
	
	public MMSavingAcc(int accNo, String accNm, float accBal, boolean isSalary) {
		super(accNo, accNm, accBal, isSalary);
		
	}
	
	public void withdraw(float isSalary) {
		System.out.println("The Withdraw Amount is :"+isSalary);
		
	}

	@Override
	public String toString() {
		return "MMSavingAcc [toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}

	
	
}