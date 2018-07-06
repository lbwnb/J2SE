package com.shiyanlou.course;

public class Test {
public static void main(String[] args) {
	Book book = new Book("This is my 1st book","Peter","1234567890");
	//创建Book对象并设定其各个属性
	
	//输出这本书的信息
	System.out.println("Book Name" + book.getName());
	System.out.println("Book Author" + book.getAuthor());
	System.out.println("ISBN" + book.getISBN());
}
}
