package GenericStack;

public class GenericArrayTest {
	public static void main(String[] args) {
		GenericArray<Integer> array = new GenericArray<Integer>();
		array.put(0, 0);
		array.put(1, 2);
		array.put(2, 4);
		//添加数组元素到栈里
		
		
		System.out.println(array.get(2));
		//获取指定位置的数组元素

	}
}
