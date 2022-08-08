package com.soru4;

import java.time.LocalDate;

public class Musteri extends Kişi {

	String adress;
	LocalDate checkInDate;
	LocalDate deadline;
	int periodDay;

	public Musteri(String tckn, String nameSurname, String phoneNum, String adress, int periodDay) {
		super(tckn, nameSurname, phoneNum);
		this.adress = adress;
		this.checkInDate = LocalDate.now();
		this.deadline = checkInDate.plusDays(periodDay);
		this.periodDay = periodDay;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public LocalDate getCheckInDate() {
		return checkInDate;
	}

	public void setCheckInDate(LocalDate checkInDate) {
		this.checkInDate = checkInDate;
	}

	public LocalDate getDeadline() {
		return deadline;
	}

	public void setDeadline(LocalDate deadline) {
		this.deadline = deadline;
	}

	public int getPeriodDay() {
		return periodDay;
	}

	public void setPeriodDay(int periodDay) {
		this.periodDay = periodDay;
	}

	@Override
	public String toString() {
		return "Musteri [adress=" + adress + ", checkInDate=" + checkInDate + ", deadline=" + deadline + ", periodDay="
				+ periodDay + ", tckn=" + tckn + ", nameSurname=" + nameSurname + ", phoneNum=" + phoneNum + "]";
	}

}
