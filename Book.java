package com.lgcns.test05;

public class Book {
	public String bookName;
	public int bookPrice;
	public double bookDiscountRate;

	public Book() {	
	}
	public Book ( String bookName, int bookPrice, double bookDiscountRate)
	 {
		 this.bookName=bookName;
		 this.bookPrice=bookPrice;
		 this.bookDiscountRate=bookDiscountRate;
	 }
	
	public void setbookPrice(int bookPrice)
	 {
		 this.bookPrice=bookPrice;
	 }
	public int getbookPrice()
	 {
		 return bookPrice;
	 }
	public void setbookDiscountRate(double bookDiscountRate)
	 {
		 this.bookDiscountRate=bookDiscountRate;
	 }
	public double getbookDiscountRate()
	 {
		 return bookDiscountRate;
	 }
	

	






}