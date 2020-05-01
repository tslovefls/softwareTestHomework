package com.example.pitest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class XinGuanTest {

	@ParameterizedTest
	@CsvFileSource(resources = "/新冠肺炎测试用例.csv",numLinesToSkip = 1)
	public void testXinGuan(Integer num,String symptom, String contact,String result ) {
		assertEquals(result,XinGuan.diagnose(symptom, contact));
	}
}
