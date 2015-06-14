package test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MyTest2 {

	public static void main(String[] args) {

//		String[] strings = { "hh" };
//		int[] a = { 12, 3, 4, 56 };
//
//		StringBuffer sb = new StringBuffer();
//		for (int i : a) {
//			sb.append(i);
//			sb.append(",");
//		}
//		String string = sb.toString();
//		sb.deleteCharAt(sb.length() - 1);
//		System.out.println(sb);
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
//		String dateString = "2012-12-30:12:23:12";
		String dateString = "";
		Date date;
		try {
			date = dateFormat.parse(dateString);
			Object value = dateFormat.format(date);
			
			System.out.println(value);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		
	}

}
