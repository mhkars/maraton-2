package com.soru4;

public class Kasiyer extends Kişi {
	int deskNo;

	public Kasiyer(String tckn, String nameSurname, String phoneNum, int deskNo) {
		super(tckn, nameSurname, phoneNum);
		this.deskNo = deskNo;
	}

	public int getDeskNo() {
		return deskNo;
	}

	public void setDeskNo(int deskNo) {
		this.deskNo = deskNo;
	}

}
