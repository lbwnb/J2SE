package ArrayListExp;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTraversal {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		// 创建列表list

		for (int i = 0; i < 10; i++) {
			list.add(i);
			// 使用add()方法，通过for循环向list中增加10个元素。
		}
		System.out.println("元素");
		System.out.println(list);
		// 输出列表中全部的元素

		System.out.println("输出奇数的元素");
		for (int i = 1; i < list.size(); i += 2) {
			System.out.print(list.get(i) + "  ");
			// 使用get()方法从list中取出元素
		}
	}
}
