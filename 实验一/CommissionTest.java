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
 * @Description: Commission测试类
 * @author tiger
 * @version V1.0
 */
// 参数化运行器
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
					{ -1, 25, 30, "当月销售活动已结束" }, 
					{ 5, 81, 25, "对不起，枪托数不能为负数且厂商限制一个月最多卖出80个！" }, 
					{ 71, 30, 45, "对不起，枪机数不能为负数且厂商限制一个月最多卖出70个！" }, 
					{ 12, 31, 92, "对不起，枪管数不能为负数且厂商限制一个月最多卖出90个！" },
					{ 13, 5, 4, "83.5" }, 
					{ 20, 18, 10, "203.5" }, 
					{ 20, 25,15, "265.0" }, 
					{ 5, -1, 35, "对不起，枪托数不能为负数且厂商限制一个月最多卖出80个！" },
		});
	}

	@Test
	public void Commission() {
		assertEquals(this.commission, Commission.getCommission(locks, stocks, barrels));
	}
}
