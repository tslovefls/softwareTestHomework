package project1;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 * @Title: CommissionTest.java
 * @Package cn.edu.ctgu.junitTest
 * @Description: Commission������
 * @author tiger
 * @version V1.0
 */
// ������������
@RunWith(Parameterized.class)
public class CommissionTest {
	private int locks, stocks, barrels;
	private String commission;

	@Before
	public void setUp() throws Exception {
	}

	public CommissionTest(int locks,int stocks,int barrels, String commission) {
		this.locks = locks;
		this.stocks = stocks;
		this.barrels = barrels;
		this.commission = commission;
	}

	@Parameters
	public static Collection<Object[]> getData() {
		return Arrays.asList(
				new Object[][] { 
					{ -1, 25, 30, "�������ۻ�ѽ���" }, 
					{ 5, 81, 25, "�Բ���ǹ��������Ϊ�����ҳ�������һ�����������80����" }, 
					{ 71, 30, 45, "�Բ���ǹ��������Ϊ�����ҳ�������һ�����������70����" }, 
					{ 12, 31, 92, "�Բ���ǹ��������Ϊ�����ҳ�������һ�����������90����" },
					{ 13, 5, 4, "83.5" }, 
					{ 20, 18, 10, "203.5" }, 
					{ 20, 25,15, "265.0" }, 
					{ 5, -1, 35, "�Բ���ǹ��������Ϊ�����ҳ�������һ�����������80����" },
		});
	}

	@Test
	public void Commission() {
		assertEquals(this.commission, Commission.getCommission(locks, stocks, barrels));
	}
}
