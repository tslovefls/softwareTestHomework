package project1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;



/**
 * @Title: TriangleTest.java
 * @Package cn.edu.ctgu.junitTest
 * @Description: 三角形测试类
 * @author tiger
 * @version V1.0
 */

public class TriangleTest {

	@ParameterizedTest
	@CsvFileSource(resources = "三角形最坏情况测试用例.csv",numLinesToSkip = 1)
	public void testTriangle(Integer num,Integer a,Integer b,Integer c,String type) {
		assertEquals(type, Triangle.classify(a, b, c));
	}

}
