package com.soru2;

import java.util.Arrays;

public class Dizi {

	static int dizi[] = new int[0];
	static int boyut = 0;

	public static int[] ekle(int sayi) {
		boyut++;
		int[] taslak = new int[boyut];
		for (int i = 0; i < boyut - 1; i++) {
			taslak[i] = dizi[i];
		}
		taslak[boyut - 1] = sayi;
		dizi = taslak;
		return dizi;
	}

	public static int[] arayaEkle(int sayı, int sıra) {

		boyut++;
		int[] taslak = new int[boyut];
		for (int i = 0, j = 0; i < boyut; i++, j++) {
			if (sıra == i)
				i++;
			taslak[i] = dizi[j];

		}
		taslak[sıra] = sayı;
		dizi = taslak;
		return dizi;

	}

	public static int[] sil(int sayi) {

		int sıra = -1;
		for (int i = 0; i < boyut; i++) {
			if (dizi[i] == sayi) {
				sıra = i;
				boyut--;
				break;
			}
		}

		int[] taslak = new int[boyut];
		for (int i = 0, j = 0; i < dizi.length; i++, j++) {
			if (sıra == i)
				i++;
			taslak[j] = dizi[i];

		}
		dizi = taslak;
		return dizi;

	}

	public static void listele(int[] dizi) {
		System.out.println(Arrays.toString(dizi));
	}

}