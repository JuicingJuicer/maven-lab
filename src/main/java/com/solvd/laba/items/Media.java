package com.solvd.laba.items;

import java.util.EnumSet;

import com.solvd.laba.Genre;
import com.solvd.laba.interfaces.Item;

// Base class for classes like books, movies, etc
public abstract class Media implements Item {
	private String title;
	protected int year;
	private EnumSet<Genre> genre;
	protected static int numberOfMedia;
	protected int serialNumber;

	public Media(String title, int year, EnumSet<Genre> genre) {
		this.title = title;
		this.year = year;
		this.genre = genre;
		numberOfMedia++;
		this.serialNumber = this.numberOfMedia;
	}

	static {
		numberOfMedia = 0;
	}

	public String getTitle() {
		return title;
	}

	public EnumSet<Genre> getGenre() {
		return genre;
	}

	public abstract String toString();

	public int getSerialNumber() {
		return this.serialNumber;
	}

}
