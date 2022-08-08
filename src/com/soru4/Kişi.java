package com.soru4;

public class Kişi {
	String tckn;
	String nameSurname;
	String phoneNum;

	public Kişi(String tckn, String nameSurname, String phoneNum) {
		super();
		this.tckn = tckn;
		this.nameSurname = nameSurname;
		this.phoneNum = phoneNum;
	}

	public String getTckn() {
		return tckn;
	}

	public void setTckn(String tckn) {
		this.tckn = tckn;
	}

	public String getNameSurname() {
		return nameSurname;
	}

	public void setNameSurname(String nameSurname) {
		this.nameSurname = nameSurname;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	@Override
	public String toString() {
		return "Kişi [tckn=" + tckn + ", nameSurname=" + nameSurname + ", phoneNum=" + phoneNum + "]";
	}

}
