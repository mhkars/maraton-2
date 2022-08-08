package com.soru4;

import java.util.Stack;

public class Kitap {
	int id;
	String title;
	String writer;
	String genre;
	boolean avaliable;
	Stack<Musteri> cs = new Stack<Musteri>();

	public Kitap(int id, String title, String writer, String genre, boolean avaliable) {
		super();
		this.id = id;
		this.title = title;
		this.writer = writer;
		this.genre = genre;
		this.avaliable = avaliable;

	}

	public Stack addStack(Musteri ms) {
		this.cs.add(ms);
		return cs;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	@Override
	public String toString() {
		return "Kitap [id=" + id + ", title=" + title + ", writer=" + writer + ", genre=" + genre + "]";
	}

	public boolean isAvaliable() {
		return avaliable;
	}

	public void setAvaliable(boolean avaliable) {
		this.avaliable = avaliable;
	}

}
