package com.shiyanlou.course;

public class teacher extends Student {
private String name="��",sex="��";
private int age = 19;
public int workingage=6;

public teacher(int workingage) {
	this.workingage = workingage;
}
public void a() {
	System.out.println("��������" + workingage);
}
public static void main(String[] args) {
	teacher a = new teacher(45);
	Student b = new Student("��", "��", 20);
	a.a();
	b.run();
	
	
}
}
