package project1;

public class Commission {
	public static String getCommission(int locks,int stocks,int barrels) {
		double lockprice = 45;
		double stockprice = 30;
		double barrelprice = 25;
		if (locks==-1) {
			return "�������ۻ�ѽ���";
		}
		if (locks !=-1) {
			if (locks<1||locks>70) {
				return "�Բ���ǹ��������Ϊ�����ҳ�������һ�����������70����";
			}
			if (stocks<=1||stocks>80) {
				return "�Բ���ǹ��������Ϊ�����ҳ�������һ�����������80����";
			}
			if (barrels<=1||barrels>90) {
				return "�Բ���ǹ��������Ϊ�����ҳ�������һ�����������90����";
			}
		}
		double locksales = lockprice*locks;
		double stocksales = stockprice*stocks;
		double barrelsales = barrelprice*barrels;
		double sales = locksales+stocksales+barrelsales;
		double commission = 0;
		if (sales>1800) {
			commission = 0.10*1000;
			commission = commission + 0.15*800;
			commission = commission + 0.20*(sales-1800);
			return Double.toString(commission);
		}
		else if (sales>1000) {
			commission = 0.10*1000;
			commission = commission + 0.15*(sales-1000);
			return Double.toString(commission);
		}
		else {
			commission = 0.10*sales;
			return Double.toString(commission);
		}
	}

}
