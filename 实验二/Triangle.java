package project1;

public class Triangle {
	public static String classify(int a,int b,int c) {
		if (a<1||a>100||b<1||b>100||c<1||c>100) {
			return "�������";
		}
		if(!((a + b>c)&&(a+c>b)&&(b+c>a))) {
			return "��������";
		}
		else if (a == b &&a ==c && b ==c ) {
			return "�ȱ�������"; 
		}
		else if (a!=b&&a!=c&&b!=c) {
			return "���ȱ�������";
		}else {
			return "����������";
		}
	}

}
