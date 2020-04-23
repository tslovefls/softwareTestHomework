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
 * @Title: TriangleTest.java
 * @Package cn.edu.ctgu.junitTest
 * @Description: nextdata测试类
 * @author tiger
 * @version V1.0
 */
// 参数化运行器
@RunWith(Parameterized.class)
public class NextDateTest {
	private int month, day, year;
	private String nextdate;

	@Before
	public void setUp() throws Exception {
	}

	public NextDateTest(int month, int day, int year, String nextdate) {
		this.month = month;
		this.day = day;
		this.year = year;
		this.nextdate = nextdate;
	}

	@Parameters
	public static Collection<Object[]> getData() {
		return Arrays.asList(
				new Object[][] { 
					{ 03, 03, 2020, "3-4-2020" }, 
					{ 2, 29, 2020, "3-1-2020" }, 
					{ 2, 30, 2020, "日期错误" }, 
					{ 12, 31, 2020, "1-1-2021" },
					{ 13, 5, 2019, "月份错误" }, 
					{ 3, 8, 785, "年份错误" }, 
					{ 2, 28, 2019, "3-1-2019" }, 
					{ 5, 31, 2020, "6-1-2020" },
		});
	}

	@Test
	public void NextData() {
		assertEquals(this.nextdate, NextDate.getDate(month, day, year));
	}

}
