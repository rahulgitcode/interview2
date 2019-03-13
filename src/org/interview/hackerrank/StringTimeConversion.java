package org.interview.hackerrank;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringTimeConversion {
	public static void main(String[] args) {
		String s = "12:00:45AM";
		DateFormat readFormat = new SimpleDateFormat("hh:mm:ssaa");
		DateFormat writeFormat = new SimpleDateFormat("HH:mm:ss");
		
		Date date = null;
		
		try {
			date = readFormat.parse(s);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String out = writeFormat.format(date);
		System.out.println(out);
		
	}
}
