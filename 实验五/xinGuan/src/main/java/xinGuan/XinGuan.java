package xinGuan;

public class XinGuan{
	public static String diagnose(String symptom,String contact) {
		if (symptom.equals("����")||symptom.equals("�ʺ�ʹ")||symptom.equals("����")||symptom.equals("����")||symptom.equals("������")||symptom.equals("����")||symptom.equals("����")||symptom.equals("��������")||symptom.equals("ȫ����ʹ")||symptom.equals("����")||symptom.equals("��к")){
			if (contact.equals("���人������������������ʷ���סʷ")||contact.equals("�нӴ��������人�������������ݡ�̨�ݵ���Ա") || contact.equals ("�нӴ������ƻ�ȷ�����͹�״������Ⱦ��") || contact.equals ("����ж��˳��ַ��ȡ����������ԡ���ʹ��")) {
				return "�������̷�����������������ÿ������÷��������ҽ����ƿ��ֻ�N95���֣��������������ͨ���ߡ�";
			}
			if (contact.equals("û�нӴ�ʷ")){
				return"������ṩ�Ĳ���֢״���Ӵ�ʷ�ص㣬��������ڼҼ�����£����ʵ��������Ƹ�ð���г�ҩ��ע��������������ˮ����ϢΪ���������³������˻����´���38�����֢״���أ���ʱ���";
			}
		} 
		if (symptom.equals ("û�е���֢״")) {
			if (contact.equals ("���人������������������ʷ���סʷ")||contact.equals("�нӴ��������人�������������ݡ�̨�ݵ���Ա") || contact.equals ("�нӴ������ƻ�ȷ�����͹�״������Ⱦ��") || contact.equals ("����ж��˳��ַ��ȡ����������ԡ���ʹ��")) {
				return "��������ȫ�Ҽ����нӴ��߾ӼҸ�������2�ܣ��ڼ��ڼ佨������ֽ�������������ʱ������������ס���ס��ͨ�����õĵ��˷��䡣\r\n" + 
						"����Ϣ������ˮ��ע���������ͳ�����Ʒ���������������ַ��ȼ�������֢״��������ǰ��ҽԺ���";
			}
			if (contact.equals ("û�нӴ�ʷ")){
				return "�����������֡���ϴ�֣�������Ⱥ�ۼ������ٲ���Ҫ�����";
			}
		} 
		return "�������";
	}
}