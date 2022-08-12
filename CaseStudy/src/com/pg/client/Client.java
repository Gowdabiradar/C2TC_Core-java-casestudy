package com.pg.client;

import com.pg.framework.CurrentAcc;
import com.pg.framework.SavingAcc;
import com.pg.application.MMCurrentAcc;
import com.pg.application.MMBankfactory;
import com.pg.application.MMSavingAcc;
import com.pg.framework.BankFactory;


public class Client {
	public static void main(String[] args) {
		
		BankFactory bf = new MMBankfactory();		
		SavingAcc sav = new MMSavingAcc(413420,"prajwal",8000,true);
		CurrentAcc cur = new MMCurrentAcc(504799, "niru",4000,9000);
		sav.withdraw(sav.getAccBal());
		sav.toString();
		cur.withdraw(cur.getCreditLimit());
		cur.toString();

	}

}
