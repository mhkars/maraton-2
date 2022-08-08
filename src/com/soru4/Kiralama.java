package com.soru4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Kiralama implements IRepository {

	public Map<Kitap, Musteri> rentedBooks = new HashMap<Kitap, Musteri>();
	List<Kitap> books = new ArrayList<Kitap>();
	List<Musteri> customers = new ArrayList<Musteri>();
	List<Kasiyer> cashiers = new ArrayList<Kasiyer>();
	Random rd = new Random();

	@Override
	public void kiralananKitapListesi() {

		rentedBooks.entrySet().forEach(s -> System.out.println(s));

	}

	@Override
	public void müşteriAra(String no) {
		for (int i = 0; i < customers.size(); i++) {
			if (customers.get(i).getTckn().equals(no)) {
				System.out.println(customers.get(i));
				return;

			}
		}
		System.out.println("The customer doesnt exist.");
	}

	@Override
	public void kitapAra(String title) {
		Kitap bk1 = null;
		for (int i = 0; i < books.size(); i++) {
			if (books.get(i).getTitle().equalsIgnoreCase(title)) {
				bk1 = books.get(i);
				if (bk1.isAvaliable()) {
					System.out.println(bk1 + "Book is avaliable.");
					return;
				} else {
					System.out.println(bk1 + "Book isnt avaliable until " + bk1.cs.peek().getDeadline());
					return;
				}
			}

		}
		System.out.println("The book title doesnt exist in library.");
	}

	@Override
	public void kiralamaYap() {
		Musteri rdCs = customers.get(rd.nextInt(customers.size()));
		Kitap rdBk = books.get(rd.nextInt(books.size()));
		rdBk.addStack(rdCs);
		rentedBooks.put(rdBk, rdCs);
		rdBk.setAvaliable(false);
	}

}
