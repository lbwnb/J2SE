package StringUtil;

public class DoubleCompare {
	public static void main(String[] args) {
		String s_1 = "123.321";
		String s_2 = "567.765";

		Double num_1 = Double.parseDouble(s_1);
		Double num_2 = Double.parseDouble(s_2);
		// ������Double���͵����ݣ������ַ���ת��Ϊ˫���ȸ�����������ֵ

		System.out.println("number 1:" + num_1);
		System.out.println("number 2:" + num_2);

		//compareTo(Double anotherDouble)Ҳ��Double���ṩ��һ�����������ڱȽ�����Double�������ݵĴ�С��
		//����ֵΪint���ͣ�-1��0��1�ֱ����С�ڡ����ںʹ��ڡ�
		switch (num_1.compareTo(num_2)) {
		case -1:
			System.out.println("����A������BС");
			break;
		case 0:
			System.out.println("����A������B���");
			break;
		case 1:
			System.out.println("����A������B��");
			break;
		}
	}

}
