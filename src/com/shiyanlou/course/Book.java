package com.shiyanlou.course;

public class Book {
private String name; //����
private String author; //����
private  String ISBN; //����
//Tips: ISBN�ǹ��ʱ�׼��ţ�ÿ���鱳��������뼴Ϊ����

public Book(String name,String author,String ISBN) {
	//���ù��췽����ʼ����
	this.name = name;
	this.author = author;
	this.ISBN = ISBN;
}
public String getName() {
	return name;
}
public String getAuthor() {
	return author;
}
public String getISBN() {
	return ISBN;
}

}