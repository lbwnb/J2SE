package GenericStack;

public class GenericArrayTest {
	public static void main(String[] args) {
		GenericArray<Integer> array = new GenericArray<Integer>();
		array.put(0, 0);
		array.put(1, 2);
		array.put(2, 4);
		//�������Ԫ�ص�ջ��
		
		
		System.out.println(array.get(2));
		//��ȡָ��λ�õ�����Ԫ��

	}
}
