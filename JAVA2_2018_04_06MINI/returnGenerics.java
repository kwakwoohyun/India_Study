package JAVA2_2018_04_06MINI;

//���׸� <T>�� ����ϰ� ����Ÿ�Ե� T�� ���
public class returnGenerics {
	public static <T> T printAndReturn(T tp) {
		System.out.println(tp);
		return tp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 10;
		char c = 'j';
		System.out.println("Printing Integer");
		System.out.println(printAndReturn(i));
		System.out.println("Printing Character");
		System.out.println(printAndReturn(c));
	}

}
