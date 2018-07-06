package StringUtil;

public class DoubleCompare {
	public static void main(String[] args) {
		String s_1 = "123.321";
		String s_2 = "567.765";

		Double num_1 = Double.parseDouble(s_1);
		Double num_2 = Double.parseDouble(s_2);
		// 定义了Double类型的数据，并将字符串转换为双精度浮点数赋予其值

		System.out.println("number 1:" + num_1);
		System.out.println("number 2:" + num_2);

		//compareTo(Double anotherDouble)也是Double类提供的一个方法，用于比较两个Double类型数据的大小，
		//返回值为int类型，-1、0、1分别代表小于、等于和大于。
		switch (num_1.compareTo(num_2)) {
		case -1:
			System.out.println("数字A比数字B小");
			break;
		case 0:
			System.out.println("数字A和数字B相等");
			break;
		case 1:
			System.out.println("数字A比数字B大");
			break;
		}
	}

}
