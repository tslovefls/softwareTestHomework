package project1;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;


public class TriangleDataGenerator {
	private final static String destDir = "src/test/resources/";
	public static void main(String[] args) throws Exception {
		//����һ��߽��������
		test1NormalBoundaryValue();
		
		//���������߽��������
		test2WorstCaseBoundaryValue();
		
		//���ɽ�׳�߽��������
		test3RobustBoundaryValue();
		
		//���ɽ�׳������������
		test4RobustWorstCaseBoundaryValue();
	}
	// һ��߽�ֵ���ԣ�4n+1
	public static void test1NormalBoundaryValue() throws Exception // Parameters!
	{
		int[] sideA = { 1, 2, 50, 99, 100 };
		int[] sideB = { 1, 2, 50, 99, 100 };
		int[] sideC = { 1, 2, 50, 99, 100 };
		FileOutputStream fos = new FileOutputStream(destDir+"������һ��߽��������.csv");
		OutputStreamWriter osw = new OutputStreamWriter(fos, "utf-8");
		CSVFormat csvFormat = CSVFormat.DEFAULT.withHeader("�������", "a", "b", "c", "����ֵ");
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

	// �������ԣ�6n+1
	public static void test2WorstCaseBoundaryValue() throws Exception // Parameters!
	{
		int[] sideA = { 0, 1, 2, 50, 99, 100, 101 };
		int[] sideB = { 0, 1, 2, 50, 99, 100, 101 };
		int[] sideC = { 0, 1, 2, 50, 99, 100, 101 };
		FileOutputStream fos = new FileOutputStream(destDir+"������������������.csv");
		OutputStreamWriter osw = new OutputStreamWriter(fos, "utf-8");
		CSVFormat csvFormat = CSVFormat.DEFAULT.withHeader("�������", "a", "b", "c", "����ֵ");
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

	// ��׳�Ա߽�ֵ����5��n�η�
	public static void test3RobustBoundaryValue() throws Exception // Parameters!
	{
		int[] sideA = { 1, 2, 50, 99, 100 };
		int[] sideB = { 1, 2, 50, 99, 100 };
		int[] sideC = { 1, 2, 50, 99, 100 };
		FileOutputStream fos = new FileOutputStream(destDir+"�����ν�׳��������.csv");
		OutputStreamWriter osw = new OutputStreamWriter(fos, "utf-8");
		CSVFormat csvFormat = CSVFormat.DEFAULT.withHeader("�������", "a", "b", "c", "����ֵ");
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

	// ��׳��������7��n�η�
	public static void test4RobustWorstCaseBoundaryValue() throws Exception // Parameters!
	{

		int[] sideA = { 0, 1, 2, 50, 99, 100, 101 };
		int[] sideB = { 0, 1, 2, 50, 99, 100, 101 };
		int[] sideC = { 0, 1, 2, 50, 99, 100, 101 };
		FileOutputStream fos = new FileOutputStream(destDir+"�����ν�׳��������������.csv");
		OutputStreamWriter osw = new OutputStreamWriter(fos, "utf-8");
		CSVFormat csvFormat = CSVFormat.DEFAULT.withHeader("�������", "a", "b", "c", "����ֵ");
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