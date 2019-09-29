package org.bankaccount.converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateConverter {

	private static final String DATE_FORME = "dd/MM/yyyy";
	
	public static Date convertToDate(String date) throws ParseException {
		SimpleDateFormat formatter = new SimpleDateFormat(DATE_FORME);
		return formatter.parse(date);
	}
	
	public static final String convertDateToString(Date date) {
		SimpleDateFormat formatter = new SimpleDateFormat(DATE_FORME);
		return formatter.format(date);
	}
	
	private DateConverter() {
		throw new IllegalStateException("Utility class");
	}
}
