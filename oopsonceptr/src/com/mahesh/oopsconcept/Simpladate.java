package com.mahesh.oopsconcept;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

class mahesh {
	private Date date;

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
}

public class Simpladate {
	public static void main(String[] args) {

		mahesh mm = new mahesh();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		Date date = null;
		try {
			date = sdf.parse("4-05-97");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		mm.setDate(date);
		String dob = sdf.format(mm.getDate());
		System.out.println(dob);

	}
}
