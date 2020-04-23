package project1;

import java.text.DecimalFormat;
import java.text.ParseException;

public class TelFee {
	public static String bill(String startDate,String endDate) {
		
		double telFee;	
		HoldingTime ht;
		try {
			ht = new HoldingTime(startDate,endDate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			return "格式错误";
		}
		
		DecimalFormat    df   = new DecimalFormat("######0.00");
		
		long minute = ht.getHoldingTime();
		//计算话费
		if (minute ==0) {
			return "时间错误，时限范围不对！";
		}
		if(minute <= 20){
			telFee = 0.05*minute;
		}else{
			telFee = 1.00 + (minute - 20)*0.1;
		}
		return df.format(telFee);
	}
}