package com.soru1;

import java.util.Scanner;

public class Aritmetik {
	static Scanner scanner = new Scanner(System.in);
	static int secim2;
	static int ilknum;
	static int ikincinum;
	static Integer ans;

	public static int toplama(Integer sayi) {
		if (ans == null) {
			System.out.println("lutfen islem yapmak istediginiz ilk sayiyi giriniz");
			ilknum = scanner.nextInt();
			System.out.println("lutfen islem yapmak istediginiz ikinci sayiyi giriniz");
			ikincinum = scanner.nextInt();
			ans = ilknum + ikincinum;
			System.out.println("Isleminizin sonucu...: " + ans);
			scanner.nextLine();
			return ans;

		} else {
			System.out.println("lutfen islem yapmak istediginiz sayiyi giriniz");
			ikincinum = scanner.nextInt();
			ans = ans + ikincinum;
			System.out.println("Isleminizin sonucu...: " + ans);
			scanner.nextLine();
			return ans;
		}
	}

	public static int cikartma(Integer sayi) {
		if (ans == null) {
			System.out.println("lutfen islem yapmak istediginiz ilk sayiyi giriniz");
			ilknum = scanner.nextInt();
			System.out.println("lutfen islem yapmak istediginiz ikinci sayiyi giriniz");
			ikincinum = scanner.nextInt();
			ans = ilknum - ikincinum;
			System.out.println("Isleminizin sonucu...: " + ans);
			return ans;

		} else {
			System.out.println("lutfen islem yapmak istediginiz sayiyi giriniz");
			ikincinum = scanner.nextInt();
			ans = ans - ikincinum;
			System.out.println("Isleminizin sonucu...: " + ans);
			return ans;
		}
	}

	public static int carpma(Integer sayi) {
		if (ans == null) {
			System.out.println("lutfen islem yapmak istediginiz ilk sayiyi giriniz");
			ilknum = scanner.nextInt();
			System.out.println("lutfen islem yapmak istediginiz ikinci sayiyi giriniz");
			ikincinum = scanner.nextInt();
			ans = ilknum * ikincinum;
			System.out.println("Isleminizin sonucu...: " + ans);
			scanner.nextLine();
			return ans;

		} else {
			System.out.println("lutfen islem yapmak istediginiz sayiyi giriniz");
			ikincinum = scanner.nextInt();
			ans = ans * ikincinum;
			System.out.println("Isleminizin sonucu...: " + ans);
			return ans;
		}
	}

	public static int bolme(Integer sayi) {
		if (ans == null) {
			System.out.println("lutfen islem yapmak istediginiz ilk sayiyi giriniz");
			ilknum = scanner.nextInt();
			System.out.println("lutfen islem yapmak istediginiz ikinci sayiyi giriniz");
			ikincinum = scanner.nextInt();
			ans = ilknum / ikincinum;
			System.out.println("Isleminizin sonucu...: " + ans);
			return ans;

		} else {
			System.out.println("lutfen islem yapmak istediginiz sayiyi giriniz");
			ikincinum = scanner.nextInt();
			ans = ans / ikincinum;
			System.out.println("Isleminizin sonucu...: " + ans);
			return ans;
		}
	}

}
