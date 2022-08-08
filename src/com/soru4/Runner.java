package com.soru4;

public class Runner {
	public static void main(String[] args) {
		Kiralama rent = new Kiralama();
		Kitap bk;
		Musteri cs;
		bk = new Kitap(001, "Kasagi", "Omer Seyfeddin", "Roman", true);
		rent.books.add(bk);
		bk = new Kitap(002, "Kurk Mantolu Madonna", "Sabahaddin ali", "Roman", true);
		rent.books.add(bk);
		bk = new Kitap(003, "Saatelri Ayarlama Enstitusu", "Ahmet Hamdi Tanpinar", "Dram", true);
		rent.books.add(bk);

		cs = new Musteri("45668596218", "Ahmet AYAZ", "05255255363", "Cankaya", 30);
		rent.customers.add(cs);
		cs = new Musteri("48569721536", "Mehmet AYAZ", "05486972563", "Kizilay", 60);
		rent.customers.add(cs);
		cs = new Musteri("96548721368", "Selim AYAZ", "05486972315", "Etimesgut", 30);
		rent.customers.add(cs);

		rent.kiralamaYap();
		rent.kiralamaYap();
		rent.kiralamaYap();
		rent.kiralananKitapListesi();
		rent.kitapAra("kasagi");
		rent.müşteriAra("48569721536");

	}
}
