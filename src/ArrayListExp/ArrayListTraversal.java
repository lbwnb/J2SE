package ArrayListExp;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTraversal {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		// �����б�list

		for (int i = 0; i < 10; i++) {
			list.add(i);
			// ʹ��add()������ͨ��forѭ����list������10��Ԫ�ء�
		}
		System.out.println("Ԫ��");
		System.out.println(list);
		// ����б���ȫ����Ԫ��

		System.out.println("���������Ԫ��");
		for (int i = 1; i < list.size(); i += 2) {
			System.out.print(list.get(i) + "  ");
			// ʹ��get()������list��ȡ��Ԫ��
		}
	}
}
