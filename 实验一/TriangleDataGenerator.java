package project1;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;


public class TriangleDataGenerator {
	private final static String destDir = "src/test/resources/";
	public static void main(String[] args) throws Exception {
		//生成一般边界测试数据
		test1NormalBoundaryValue();
		
		//生成最坏情况边界测试数据
		test2WorstCaseBoundaryValue();
		
		//生成健壮边界测试数据
		test3RobustBoundaryValue();
		
		//生成健壮最坏情况测试用例
		test4RobustWorstCaseBoundaryValue();
	}
	// 一般边界值测试：4n+1
	public static void test1NormalBoundaryValue() throws Exception // Parameters!
	{
		int[] sideA = { 1, 2, 50, 99, 100 };
		int[] sideB = { 1, 2, 50, 99, 100 };
		int[] sideC = { 1, 2, 50, 99, 100 };
		FileOutputStream fos = new FileOutputStream(destDir+"三角形一般边界测试用例.csv");
		OutputStreamWriter osw = new OutputStreamWriter(fos, "utf-8");
		CSVFormat csvFormat = CSVFormat.DEFAULT.withHeader("用例编号", "a", "b", "c", "期望值");
		CSVPrinter csvPrinter = new CSVPrinter(osw, csvFormat);

		int num = 0;
		for (int a : sideA) {
			for (int b : sideB) {
				for (int c : sideC) {
					if (a == b && a == 50 || a == c & a == 50 || b == c && b == 50) {
						csvPrinter.printRecord(++num, a, b, c, Triangle.classify(a, b, c));
					}
				}
			}
		}
		csvPrinter.flush();
		csvPrinter.close();
	}

	// 最坏情况测试：6n+1
	public static void test2WorstCaseBoundaryValue() throws Exception // Parameters!
	{
		int[] sideA = { 0, 1, 2, 50, 99, 100, 101 };
		int[] sideB = { 0, 1, 2, 50, 99, 100, 101 };
		int[] sideC = { 0, 1, 2, 50, 99, 100, 101 };
		FileOutputStream fos = new FileOutputStream(destDir+"三角形最坏情况测试用例.csv");
		OutputStreamWriter osw = new OutputStreamWriter(fos, "utf-8");
		CSVFormat csvFormat = CSVFormat.DEFAULT.withHeader("用例编号", "a", "b", "c", "期望值");
		CSVPrinter csvPrinter = new CSVPrinter(osw, csvFormat);

		int num = 0;
		for (int a : sideA) {
			for (int b : sideB) {
				for (int c : sideC) {
					if (a == b && a == 50 || a == c & a == 50 || b == c && b == 50) {
						csvPrinter.printRecord(++num, a, b, c, Triangle.classify(a, b, c));
					}
				}
			}
		}
		csvPrinter.flush();
		csvPrinter.close();
	}

	// 健壮性边界值测试5的n次方
	public static void test3RobustBoundaryValue() throws Exception // Parameters!
	{
		int[] sideA = { 1, 2, 50, 99, 100 };
		int[] sideB = { 1, 2, 50, 99, 100 };
		int[] sideC = { 1, 2, 50, 99, 100 };
		FileOutputStream fos = new FileOutputStream(destDir+"三角形健壮测试用例.csv");
		OutputStreamWriter osw = new OutputStreamWriter(fos, "utf-8");
		CSVFormat csvFormat = CSVFormat.DEFAULT.withHeader("用例编号", "a", "b", "c", "期望值");
		CSVPrinter csvPrinter = new CSVPrinter(osw, csvFormat);

		int num = 0;
		for (int a : sideA) {
			for (int b : sideB) {
				for (int c : sideC) {
					csvPrinter.printRecord(++num, a, b, c, Triangle.classify(a, b, c));
				}
			}
		}
		csvPrinter.flush();
		csvPrinter.close();
	}

	// 健壮最坏情况测试7的n次方
	public static void test4RobustWorstCaseBoundaryValue() throws Exception // Parameters!
	{

		int[] sideA = { 0, 1, 2, 50, 99, 100, 101 };
		int[] sideB = { 0, 1, 2, 50, 99, 100, 101 };
		int[] sideC = { 0, 1, 2, 50, 99, 100, 101 };
		FileOutputStream fos = new FileOutputStream(destDir+"三角形健壮性最坏情况测试用例.csv");
		OutputStreamWriter osw = new OutputStreamWriter(fos, "utf-8");
		CSVFormat csvFormat = CSVFormat.DEFAULT.withHeader("用例编号", "a", "b", "c", "期望值");
		CSVPrinter csvPrinter = new CSVPrinter(osw, csvFormat);

		int num = 0;
		for (int a : sideA) {
			for (int b : sideB) {
				for (int c : sideC) {
					csvPrinter.printRecord(++num, a, b, c, Triangle.classify(a, b, c));
				}
			}
		}
		csvPrinter.flush();
		csvPrinter.close();

	}
}