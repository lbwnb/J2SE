package GenericStack;

public class GenericStackTest {
public static void main(String[] args) {
	GenericStack<String> stack = new GenericStack<String>();
	//�ڴ���GenericStack����ʱ������String���ͣ��������ջ����ֻ�ܴ���ַ���Ԫ��
	//������һ��GenericStack��������Ϊstack
	System.out.println("���һЩ���ʵ�ջ����ȥ");
	stack.push("ShiYanLou");
	System.out.println("ShiYanLou��ӽ�ȥ");
	stack.push("OnlineLearning");
	System.out.println("OnlineLearning��ӽ�ȥ");
	while(!stack.isEmpty()) {
		//��Ҫջ��Ϊ�գ���ȡ�����е�Ԫ�ز���ӡ����
		
		String s = (String)stack.pop();
		//ǿ������ת��
		
		System.out.println("���� ��" + s +"�Ѿ���ȡ������");
	}
}
}
