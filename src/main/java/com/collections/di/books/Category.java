package com.collections.di.books;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Category {
	private static final Logger logger = LoggerFactory.getLogger(Category.class);
	private long id; 
	private String name;
	private Set<Book> booksSet;
	private List<Book> booksList; 
	private Map<String, Book> booksMap;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<Book> getBooksSet() {
		return booksSet;
	}
	public void setBooksSet(Set<Book> booksSet) {
		this.booksSet = booksSet;
	}
	public List<Book> getBooksList() {
		return booksList;
	}
	public void setBooksList(List<Book> booksList) {
		this.booksList = booksList;
	}
	public Map<String, Book> getBooksMap() {
		return booksMap;
	}
	public void setBooksMap(Map<String, Book> booksMap) {
		this.booksMap = booksMap;
	}
	

	public void displayInfo(String type) {
		switch(type) {
		case "set":
			logger.info("====== Books Set Output Start =====");
			logger.info("Category -- Id: " + this.id + ", Name:" + this.name + ", Books Set:[ " + logData(booksSet, "set") + "]");
			logger.info(" ===== Books Set Output End =====");
		    break;
		    
		case "list":
			logger.info("===== Books List Output Start =====");
			logger.info("Category -- Id: " + this.id + ", Name:" + this.name + ", Books List:[ " + logData(booksList, "list") + "]");
			logger.info("===== Books List Output End =====");
		    break;
		    
		case "map":
			logger.info("===== Books Map Output Start ===== ");
			logger.info("Category -- Id: " + this.id + ", Name:" + this.name + ", Books Map:{ " + logData(booksMap, "map") + "}");
			logger.info("===== Books Map Output End =====");
		    break;
	}
}
	
	private String logData(Object obj, String type) {
		StringBuffer response= new StringBuffer();
		switch(type) {
		case "set":
			HashSet<Book> bookSet= (HashSet<Book>)obj;
			for(Book book: bookSet) {
				response.append(",[Book-Id:").append(book.getId()).append(", ISBN:").append(book.getIsbn()).append(", Title:").append(book.getTitle()).append(", Price:").append(book.getPrice()).append("]");
			}
		    break;
		    
		case "list":
			List<Book> bookList= (List<Book>)obj;
			for(Book book: bookList) {
				response.append(",[Book-Id:").append(book.getId()).append(", ISBN:").append(book.getIsbn()).append(", Title:").append(book.getTitle()).append(", Price:").append(book.getPrice()).append("]");
			}
		    break;
		    
		case "map":
			HashMap<String,Book> bookMap= (HashMap<String,Book>)obj;
			for(Entry<String, Book> entry : bookMap.entrySet()) {
				response.append(",{").append(entry.getKey()).append("= Book-Id:").append(entry.getValue().getId()).append(", ISBN:").append(entry.getValue().getIsbn()).append(", Title:").append(entry.getValue().getTitle()).append(", Price:").append(entry.getValue().getPrice()).append("}");
			}
		    break;
	}
		return response.toString().replaceFirst(",", "");
		
	}
	
}
