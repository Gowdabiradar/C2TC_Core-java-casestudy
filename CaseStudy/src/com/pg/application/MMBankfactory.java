package com.pg.application;

import com.pg.framework.BankFactory;
import com.pg.framework.CurrentAcc;
import com.pg.framework.SavingAcc;
public  class MMBankfactory extends BankFactory {

	@Override
	public SavingAcc getNewSavingAccount(int accNo, String accNm, float accBal, boolean isSalary) {
	MMSavingAcc mmsav = new MMSavingAcc(accNo,accNm,accBal,isSalary);
		return mmsav;
	}

	@Override
	public CurrentAcc getNewCurrentAccount(int accNo, String accNm, float accBal, float creditLimit) {
		MMCurrentAcc mmcur = new MMCurrentAcc(accNo,accNm,accBal,creditLimit);
		return mmcur;
	}


}