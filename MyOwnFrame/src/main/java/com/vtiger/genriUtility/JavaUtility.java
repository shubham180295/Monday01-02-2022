package com.vtiger.genriUtility;

import java.util.Date;
import java.util.Random;

public class JavaUtility {
	
	public int getRandomNumber() {
Random ra =new Random();
int random = ra.nextInt();
return random;
}
	public String  getCurrentDate() {
		Date d=new Date();
		String date = d.toString();
		return date;
	}
	public String getCurrentDateFormate() {
		Date d=new Date();
		String getcurrentDateFormat = d.toString();
		System.out.println(getcurrentDateFormat);
		String[] s = getcurrentDateFormat.split(" ");
		String dd = s[2];
				String yy = s[5];
				int mm = d.getMonth()+1;
				String finalformat=(yy+"-"+dd+"-"+mm);
				return finalformat;
	}
}