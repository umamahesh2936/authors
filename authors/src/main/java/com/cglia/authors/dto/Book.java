package com.cglia.authors.dto;

//Generated 09-Jun-2023, 9:53:22 am by Hibernate Tools 4.3.6.Final

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

/**
 * Book generated by hbm2java
 */
@Entity
@Table(name = "book", catalog = "umamahesh")
public class Book implements java.io.Serializable {

	private int bookId;
	private Author author;
	private String bookName;
	private Date publishedDate;
	private double bookPrice;

	public Book() {
	}

	public Book(int bookId) {
		this.bookId = bookId;
	}

	public Book(int bookId, Author author, String bookName, Date publishedDate, double bookPrice) {
		this.bookId = bookId;
		this.author = author;
		this.bookName = bookName;
		this.publishedDate = publishedDate;
		this.bookPrice = bookPrice;
	}

	@Id

	@Column(name = "book_id", unique = true, nullable = false)
	public int getBookId() {
		return this.bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "author_id")
	public Author getAuthor() {
		return this.author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	@Column(name = "book_name", length = 45)
	public String getBookName() {
		return this.bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "published_date", length = 10)
	public Date getPublishedDate() {
		return this.publishedDate;
	}

	public void setPublishedDate(Date publishedDate) {
		this.publishedDate = publishedDate;
	}

	@Column(name = "book_price", length = 45)
	public double getBookPrice() {
		return this.bookPrice;
	}

	public void setBookPrice(Double bookPrice) {
		this.bookPrice = bookPrice;
	}

}
