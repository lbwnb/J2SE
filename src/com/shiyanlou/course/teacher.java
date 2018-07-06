package com.shiyanlou.course;

public class teacher extends Student {
private String name="张",sex="男";
private int age = 19;
public int workingage=6;

public teacher(int workingage) {
	this.workingage = workingage;
}
public void a() {
	System.out.println("工作年龄" + workingage);
}
public static void main(String[] args) {
	teacher a = new teacher(45);
	Student b = new Student("张", "男", 20);
	a.a();
	b.run();
	
	
}
}
