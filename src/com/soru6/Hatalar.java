package com.soru6;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Optional;

public class Hatalar {
	public void Kayit(Hatalar log) {
			try {
				FileOutputStream file = new FileOutputStream("C:\\Users\\mhkars\\Desktop\\example.txt");
				ObjectOutputStream write = new ObjectOutputStream(file);
				
				write.writeObject(log);
				write.close();

			} catch (Exception e) {
				System.out.println("Error: " + e.toString());
			}
		}

		public Optional<Hatalar> fileYaz() {
			try {
				FileInputStream file = new FileInputStream("C:\\Users\\mhkars\\Desktop\\example.txt");
				ObjectInputStream read = new ObjectInputStream(file);
				
				Hatalar log = (Hatalar) read.readObject();
				return Optional.of(log);
			} catch (Exception e) {
				
				System.out.println("Error: " + e.toString());
				return Optional.empty();
			}
		}
	}
}
