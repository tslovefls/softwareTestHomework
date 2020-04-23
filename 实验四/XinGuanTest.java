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
					{"发热","有武汉（湖北）等疫区旅游史或居住史","建议立刻发热门诊就诊，并且佩戴好口罩做好防护。佩戴医用外科口罩或N95口罩，避免乘坐公共交通工具。"},
					{"发热","没有接触史","结合你提供的病情症状及接触史特点，建议继续在家监测体温，可适当服用治疗感冒的中成药，注意手卫生，多饮水，休息为主。若体温持续不退或体温大于38℃或不适症状加重，及时就诊。"}
		});
	}

	@Test
	public void testClassify() {
		assertEquals(this.result, XinGuan.diagnose(symptom, contact));
	}
}
