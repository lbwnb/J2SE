package com.shiyanlou.course;

public class Student {
private String name="wx",sex="Ů";
private int age = 19;

public Student(String name,String sex,int age) {
	this.name = name;
	this.sex = sex;
	this.age = age;
}
public Student() {
	
}
public String getName() {
	return name;
}
public String getSex() {
	return sex;
}
public int getAge() {
	return age;
}
public void run() {
	System.out.println("����"+this.name);
	System.out.println("����"+this.age);
	System.out.println("�Ա�"+this.sex);
}
public static void main(String[] args) {
	Student a = new Student();
	a.run();
}
}
