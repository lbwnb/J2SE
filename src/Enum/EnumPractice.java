package Enum;

public class EnumPractice {
public static void main(String[] args) {
	/**
	 * for (ѭ���������� ѭ���������� : Ҫ�������Ķ���) {
               ѭ����
         }
	 */
	for(Week week : Week.values()) {
		System.out.println("ö��Ԫ�ص�˳��" + week + "is" + week.ordinal());
		//ordinal() ö��Ԫ�ص�˳��
		
		System.out.println("Compare to MONDAY ��" + week.compareTo(Week.MONDAY));
		//compareTo()��������ǰö��Ԫ����Week.MONDAY�Ƚ�
		
		System.out.println("Equal to MONDAY ? " + week.equals(Week.MONDAY));
		//equals()��������ǰö��Ԫ����Week.MONDAY�Ƚ�
		
		System.out.println("Equal to MONDAY by == ? " + ( week == Week.MONDAY));
		//�ñȽ������==������ǰö��Ԫ����Week.MONDAY�Ƚ�
		
		System.out.println("Nmae : " + week.name());
		//ʹ��name()�������ö��Ԫ�ص�����
		
		System.out.println("Abbreviation : " + week.getAbbr());
		//ʹ���Զ����getAbbr()����������ڵ���д
		
		System.out.println("------------------");
	}
}
}
