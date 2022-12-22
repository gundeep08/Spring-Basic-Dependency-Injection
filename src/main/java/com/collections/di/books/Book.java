package com.collections.di.books;

public class Book {
	
	private long id;
	private String isbn;
	private String title;
	private float price;
	
	public Book(long id, String isbn, String title, float price) {
		super();
		this.id = id;
		this.isbn = isbn;
		this.title = title;
		this.price = price;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}


}
