package com.soru5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.stream.Collectors;

import com.soru4.Kiralama;

public class Metotlar {

	public static void main(String[] args) {

	}

	public Musteri idBilgisiVerilmisKitapKimTarafındanKiralanmis(int id) {
		Musteri customer = null;
		Kiralama renting = new Kiralama();
		renting.rentedBooks.stream().map(s -> {
			if (s.getId() == id) {
				return s.cs.get(s.cs.size() - 1);
			}
			return customer;
		});
		return customer;
	}

	public Musteri adiVerilenKitapDahaOnceKimlerTarafindanKiralanmıs(String title) {
		List<Musteri> customerList = null;
		Kiralama renting = new Kiralama();
		renting.rentedBooks.stream().map(s -> {
			if (s.getTitle().equalsIgnoreCase(title)) {
				return s.cs;
			}
			return customerList;
		});
		return customerList;
	}

	}

	public void IleBaşlayabMusterilerinListesini(String ahm) {
		Kiralama renting = new Kiralama();
		List<Musteri> customerStartsWithListAhm = new ArrayList<Musteri>();
		customerStartsWithListAhm = renting.customers.stream().filter(s -> s.getName().startsWith("ahm"))
				.collect(Collectors.toList());
		return customerStartsWithListAhm;
	}

	}

	public void idVerilenMusterininKiraladigiKitaplarinListesini(int id) {

	}
}]