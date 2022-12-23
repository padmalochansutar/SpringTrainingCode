package com.csmtech.entity;

public class BookVo {
      private String bookId;
      private String bookName;
      private String bookPrice;
      private String bookDate;
	public String getBookId() {
		return bookId;
	}
	public void setBookId(String bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(String bookPrice) {
		this.bookPrice = bookPrice;
	}
	public String getBookDate() {
		return bookDate;
	}
	public void setBookDate(String bookDate) {
		this.bookDate = bookDate;
	}
	@Override
	public String toString() {
		return "BookVo [bookId=" + bookId + ", bookName=" + bookName + ", bookPrice=" + bookPrice + ", bookDate="
				+ bookDate + "]";
	}
      
      
      
      
}
