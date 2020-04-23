package project1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
 
public class HoldingTime {
	private String startingTime;
	private String endingTime;
	private long minute;//ͨ��ʱ��
	public Date startT;
	public Date endT;
	public  HoldingTime(String startingTime,String endingTime) throws ParseException{
		this.startingTime = startingTime;
		this.endingTime = endingTime;
		this.startT = StrToDate(this.startingTime);
		this.endT = StrToDate(this.endingTime);
	}
	
	public Date StrToDate(String str) throws ParseException {
		   SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		   Date date = null;
		   date = format.parse(str);
		   return date;
		}
	public long getHoldingTime(){
		long between;
		Calendar cal1 = Calendar.getInstance();
		cal1.setTime(startT);
		Calendar cal2 = Calendar.getInstance();
		cal2.setTime(endT);
		
		between = cal2.getTime().getTime()-cal1.getTime().getTime();
		if(between<0)
			minute =( (cal2.getTime().getTime()-cal1.getTime().getTime())/1000)/60;//�õ�ͨ��ʱ��
		else
			minute = (between/1000+59)/60;
		//�жϽ�ͨʱ���Ƿ��ڷ���ת��������
		if((cal1.get(Calendar.MONTH) ==Calendar.MARCH && cal1.get(Calendar.DATE) >= 29 && cal1.get(Calendar.DATE) <= 31 && cal1.get(Calendar.DAY_OF_WEEK)==Calendar.SUNDAY)
			|| ((cal1.get(Calendar.MONTH) ==Calendar.APRIL && cal1.get(Calendar.DATE) >= 1 && cal1.get(Calendar.DATE) <= 4 && cal1.get(Calendar.DAY_OF_WEEK)==Calendar.SUNDAY)))
		{
			System.out.println("��Ҫת��1");
			if(cal1.get(Calendar.HOUR_OF_DAY)<2 && cal2.get(Calendar.HOUR_OF_DAY)>=3)
				minute -=60;//ʱ���2��ת����3���ȥ1h
		}else{
			if((cal2.get(Calendar.MONTH) ==Calendar.MARCH && cal2.get(Calendar.DATE) >= 29 && cal2.get(Calendar.DATE) <= 31 && cal2.get(Calendar.DAY_OF_WEEK)==Calendar.SUNDAY)
					|| ((cal2.get(Calendar.MONTH) ==Calendar.APRIL && cal2.get(Calendar.DATE) >= 1 && cal2.get(Calendar.DATE) <= 4 && cal2.get(Calendar.DAY_OF_WEEK)==Calendar.SUNDAY)))
				//�жϽ���ʱ���Ƿ���ת��������
			{
				if(cal2.get(Calendar.HOUR_OF_DAY)>3 )
					minute -=60;
			}
		}
		//��λ��ת����ʱ����ڵ�ʱ�䶼�����Ѿ�ת��֮���
		if(cal1.get(Calendar.MONTH) ==Calendar.OCTOBER && cal1.get(Calendar.DATE) >= 25 && cal1.get(Calendar.DATE) <= 31 && cal1.get(Calendar.DAY_OF_WEEK)==Calendar.SUNDAY)
		{
			if(cal1.get(Calendar.HOUR_OF_DAY) ==2){
						minute +=60;
			}
		}else{
			if(cal2.get(Calendar.MONTH) ==Calendar.OCTOBER && cal2.get(Calendar.DATE) >= 25 && cal2.get(Calendar.DATE) <= 31 && cal2.get(Calendar.DAY_OF_WEEK)==Calendar.SUNDAY)
			{
				if(cal2.get(Calendar.HOUR_OF_DAY)==2)
				{
						minute +=60;
				}
			}
		}
		if(minute>1800 || minute <0){
			return 0;
		}else{
			//System.out.println("�����ȷ");
			return minute;
		}
	}
}