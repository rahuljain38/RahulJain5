package com.mahesh.oopsconcept;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

class Employee1 {
	private Date date;

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}

public class DateFormateConcept {
	public static void main(String[] args) {
		Employee1 e1 = new Employee1();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date date = null;
		try {
			date = sdf.parse("1/1/20");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		e1.setDate(date);
		String m = sdf.format(e1.getDate());
		System.out.println(m);

	}
}
