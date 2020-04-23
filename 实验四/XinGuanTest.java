package project1;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class XinGuanTest {
	private String symptom,contact,result;
	
	@Before
	public void setUp() throws Exception {
	}
	
	public XinGuanTest(String symptom,String contact,String result) {
		this.symptom = symptom;
		this.contact = contact;
		this.result = result;
	}
	@Parameters
	public static Collection<Object[]> getResult() {
		return Arrays.asList(
				new Object[][] { 
					{"����","���人������������������ʷ���סʷ","�������̷�����������������ÿ������÷��������ҽ����ƿ��ֻ�N95���֣��������������ͨ���ߡ�"},
					{"����","û�нӴ�ʷ","������ṩ�Ĳ���֢״���Ӵ�ʷ�ص㣬��������ڼҼ�����£����ʵ��������Ƹ�ð���г�ҩ��ע��������������ˮ����ϢΪ���������³������˻����´���38�����֢״���أ���ʱ���"}
		});
	}

	@Test
	public void testClassify() {
		assertEquals(this.result, XinGuan.diagnose(symptom, contact));
	}
}
