package Exception;

import java.util.Arrays;

public class ArrayExptionTest {
public static void main(String[] args) {
	int[] array = new int[5];
	
	Arrays.fill(array,8);
	//������������Ԫ�ظ�ֵΪ8
	
	for(int i = 0; i < 6; i++) {
		System.out.println("array[" + i +"] = " + array[i]);
	}
}
}
