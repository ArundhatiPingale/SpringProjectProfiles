package com.springboot.demo;

public class Course {
	private long id;
	private String author;
	private String book;
	
	public Course(long id, String author, String book) {
		super();
		this.id = id;
		this.author = author;
		this.book = book;
	}
	public long getId() {
		return id;
	}
	
	public String getAuthor() {
		return author;
	}
	
	
	public String getBook() {
		return book;
	}
	
	@Override
	public String toString() {
		return "Course [id=" + id + ", author=" + author + ", book=" + book + "]";
	}
	

}
