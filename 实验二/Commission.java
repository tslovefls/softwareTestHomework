package project1;

public class Commission {
	public static String getCommission(int locks,int stocks,int barrels) {
		double lockprice = 45;
		double stockprice = 30;
		double barrelprice = 25;
		if (locks==-1) {
			return "当月销售活动已结束";
		}
		if (locks !=-1) {
			if (locks<1||locks>70) {
				return "对不起，枪机数不能为负数且厂商限制一个月最多卖出70个！";
			}
			if (stocks<=1||stocks>80) {
				return "对不起，枪托数不能为负数且厂商限制一个月最多卖出80个！";
			}
			if (barrels<=1||barrels>90) {
				return "对不起，枪管数不能为负数且厂商限制一个月最多卖出90个！";
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
