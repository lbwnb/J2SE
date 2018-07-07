package Enum;

public class EnumPractice {
public static void main(String[] args) {
	/**
	 * for (循环变量类型 循环变量名称 : 要被遍历的对象) {
               循环体
         }
	 */
	for(Week week : Week.values()) {
		System.out.println("枚举元素的顺序" + week + "is" + week.ordinal());
		//ordinal() 枚举元素的顺序
		
		System.out.println("Compare to MONDAY ：" + week.compareTo(Week.MONDAY));
		//compareTo()方法将当前枚举元素与Week.MONDAY比较
		
		System.out.println("Equal to MONDAY ? " + week.equals(Week.MONDAY));
		//equals()方法将当前枚举元素与Week.MONDAY比较
		
		System.out.println("Equal to MONDAY by == ? " + ( week == Week.MONDAY));
		//用比较运算符==来将当前枚举元素与Week.MONDAY比较
		
		System.out.println("Nmae : " + week.name());
		//使用name()方法获得枚举元素的名称
		
		System.out.println("Abbreviation : " + week.getAbbr());
		//使用自定义的getAbbr()方法输出星期的缩写
		
		System.out.println("------------------");
	}
}
}
