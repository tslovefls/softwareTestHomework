package project1;

public class NextDate {

	private static boolean leapyear(int year) {
		if ((year % 4 == 0 && year % 100 != 0) || year % 400 ==0) {
			return true;
		}
		else {
			return false;
		}
	}
	private static String date(int month,int day,int year) {
		String  date= Integer.toString(month)+"-"+Integer.toString(day)+"-"+Integer.toString(year);
		return date;
	}
	
	public static String getDate(int month,int day,int year) {
		while (!(year>=1900&&year<=2050)) {
			return"年份错误";
		}
		if(month>12||month<1) {
			return "月份错误";
		}
		if(month==1||month==3||month==5||month==7||month==8||month==10||month==12) {
			while (day>31||day<1) {
				return "日期错误";
			}
		}
		if (month == 4||month == 6||month == 9||month == 11) {
			while (day>30||day<1) {
				return "日期错误";
			}
		}
		if (leapyear(year)) {
			if(month==2) {
				if (day>29) {
					return "日期错误";
				}
				else {
					if (day == 29) {
						day = 1;
					}
					else day++;
				}
			}
		}
		else {
			if (month == 2) {
				if (day>28) {
					return "日期错误";
				}
				else {
					if (day == 28) {
						day = 1;
					}
					else day++;
				}
			}
		}
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
			if (day == 31) {
				int nextMonth = month+1;
				int nextDay = 1;
				int nextYear = year;
				String nextdate = date(nextMonth,nextDay,nextYear);
				return nextdate;
			}
			else {
				int nextMonth = month;
				int nextDay = day + 1;
				int nextYear = year;
				String nextdate = date(nextMonth,nextDay,nextYear);
				return nextdate;
			}
		case 2:
			if (day == 1) {
				int nextMonth = month+1;
				int nextDay = day;
				int nextYear = year;
				String nextdate = date(nextMonth,nextDay,nextYear);
				return nextdate;
			}
			else {
				int nextMonth = month;
				int nextDay = day;
				int nextYear = year;
				String nextdate = date(nextMonth,nextDay,nextYear);
				return nextdate;
			}
			case 4:
			case 6:
			case 9:
			case 11:
				if (day == 30) {
					int nextMonth = month+1;
					int nextDay = 1;
					int nextYear = year;
					String nextdate = date(nextMonth,nextDay,nextYear);
					return nextdate;
				}
				else {
					int nextMonth = month;
					int nextDay = day + 1;
					int nextYear = year;
					String nextdate = date(nextMonth,nextDay,nextYear);
					return nextdate;
				}
			case 12:
				if (day == 31) {
					int nextMonth = 1;
					int nextDay = 1;
					int nextYear = year+1;
					String nextdate = date(nextMonth,nextDay,nextYear);
					return nextdate;
				}
				else {
					int nextMonth = month;
					int nextDay = day + 1;
					int nextYear = year;
					String nextdate = date(nextMonth,nextDay,nextYear);
					return nextdate;
				}
		}
		return null;
	}
}
