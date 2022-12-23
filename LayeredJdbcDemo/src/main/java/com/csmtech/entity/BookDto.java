package com.csmtech.entity;

	import java.io.Serializable;
	import java.util.Date;

	public class BookDto implements Serializable {
		private Long book_Id;
		private String book_name;
		private Date  book_date;
		private Double book_price;
		public Long getBook_Id() {
			return book_Id;
		}
		public void setBook_Id(Long book_Id) {
			this.book_Id = book_Id;
		}
		public String getBook_name() {
			return book_name;
		}
		public void setBook_name(String book_name) {
			this.book_name = book_name;
		}
		public Date getBook_date() {
			return book_date;
		}
		public void setBook_date(Date book_date) {
			this.book_date = book_date;
		}
		public Double getBook_price() {
			return book_price;
		}
		public void setBook_price(Double book_price) {
			this.book_price = book_price;
		}
		@Override
		public String toString() {
			return "BookDto [book_Id=" + book_Id + ", book_name=" + book_name + ", book_date=" + book_date
					+ ", book_price=" + book_price + "]";
		}
		
}