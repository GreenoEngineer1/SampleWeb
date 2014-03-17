package com;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.sql.Date;

public class DateConversion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		/*DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Calendar cal = Calendar.getInstance();				  
	    String minDate = dateFormat.format(cal.getTime());
	    
	    
	    java.sql.Date sqlDate_validUpto = null;
	    String strDate = minDate;
	       java.util.Date util_date = null;
	       try {
	    	   util_date = dateFormat.parse(strDate);
			 sqlDate_validUpto =  new Date(util_date.getTime());
	       } catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	       }
		System.out.println(sqlDate_validUpto);*/
		
		/*DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Calendar cal = Calendar.getInstance();
		   System.out.println(dateFormat.format(cal.getTime()));*/
		// TODO Auto-generated method stub
		
		/*DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		java.util.Date date = new Date();
//		String date = ""+date1;
	    // Create date 17-04-2011 - 00h00
	    String minDate = dateFormat.format(date);
	   */ 
			String strDate = "03/11/2013";
	       DateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	       java.util.Date util_date = null;
	       java.sql.Date sqlDate_validUpto = null;
	       try {
	    	   
	    	   util_date = sdf.parse(strDate);
	    	   sqlDate_validUpto = new Date(util_date.getTime());
		      
	       } catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	       }
	       System.out.println("converted java.sql.Date :" + sqlDate_validUpto);
	}

}
