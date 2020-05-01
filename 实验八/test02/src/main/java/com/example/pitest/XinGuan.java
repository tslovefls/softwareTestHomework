package com.example.pitest;

public class XinGuan{
	public static String diagnose(String symptom,String contact) {
		if (symptom.equals("发热")||symptom.equals("咽喉痛")||symptom.equals("咳嗽")||symptom.equals("鼻塞")||symptom.equals("流鼻涕")||symptom.equals("胸闷")||symptom.equals("气急")||symptom.equals("呼吸困难")||symptom.equals("全身酸痛")||symptom.equals("乏力")||symptom.equals("腹泻")){
			if (contact.equals("有武汉（湖北）等疫区旅游史或居住史")||contact.equals("有接触过来自武汉（湖北）、温州、台州的人员") || contact.equals ("有接触过疑似或确诊新型冠状病毒感染者") || contact.equals ("身边有多人出现发热、乏力、咳嗽、咽痛等")) {
				return "建议立刻发热门诊就诊，并且佩戴好口罩做好防护。佩戴医用外科口罩或N95口罩，避免乘坐公共交通工具。";
			}
			if (contact.equals("没有接触史")){
				return"结合你提供的病情症状及接触史特点，建议继续在家监测体温，可适当服用治疗感冒的中成药，注意手卫生，多饮水，休息为主。若体温持续不退或体温大于38℃或不适症状加重，及时就诊。";
			}
		} 
		if (symptom.equals ("没有典型症状")) {
			if (contact.equals ("有武汉（湖北）等疫区旅游史或居住史")||contact.equals("有接触过来自武汉（湖北）、温州、台州的人员") || contact.equals ("有接触过疑似或确诊新型冠状病毒感染者") || contact.equals ("身边有多人出现发热、乏力、咳嗽、咽痛等")) {
				return "建议你们全家及密切接触者居家隔离至少2周，在家期间建议戴口罩交流，条件允许时，尽量单独居住或居住在通风良好的单人房间。\r\n" + 
						"多休息，多饮水，注意手卫生和常用物品卫生消毒。若出现发热及呼吸道症状，需马上前往医院就诊。";
			}
			if (contact.equals ("没有接触史")){
				return "建议您戴口罩、勤洗手，避免人群聚集，减少不必要外出。";
			}
		} 
		return "输入错误";
	}
}