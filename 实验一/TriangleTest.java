package project1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;



/**
 * @Title: TriangleTest.java
 * @Package cn.edu.ctgu.junitTest
 * @Description: �����β�����
 * @author tiger
 * @version V1.0
 */

public class TriangleTest {

	@ParameterizedTest
	@CsvFileSource(resources = "������������������.csv",numLinesToSkip = 1)
	public void testTriangle(Integer num,Integer a,Integer b,Integer c,String type) {
		assertEquals(type, Triangle.classify(a, b, c));
	}

}
