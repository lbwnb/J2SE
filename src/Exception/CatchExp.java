package Exception;

public class CatchExp {
public static void main(String[] args) {
	try {
		System.out.println("����try����");
		
		Class<?> tempClass = Class.forName("");
		//����һ���յ�Class������������"��δ�����쳣"
		
		System.out.println("�뿪try����");
		
		
	} catch (ClassNotFoundException e) {
		// TODO: handle exception
		System.out.println("����catch����");
		
		e.printStackTrace();
		//��ӡ�쳣��Ϣ�ڳ�������λ�ü�ԭ��
		
		System.out.println("�뿪catch����");
	}finally {
		
		System.out.println("����finally����");
	}
}
}
