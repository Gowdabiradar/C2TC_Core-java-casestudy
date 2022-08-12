package com.pg.framework;

public abstract class CurrentAcc extends BankAcc{
	private final float creditLimit;
	
	
		public CurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		super(accNo, accNm, accBal);
		this.creditLimit = creditLimit;
	}

		public void withdraw(float creditLimit) {
			System.out.println("The WithDraw Amount is :"+creditLimit);
			
		}

		public float getCreditLimit() {
			return creditLimit;
		}

		@Override
		public String toString() {
			return "CurrentAcc [creditLimit=" + creditLimit + ", toString()=" + super.toString() + ", getClass()="
					+ getClass() + ", hashCode()=" + hashCode() + "]";
		}

		
		
		

}
