package com;

import java.text.DecimalFormat;

public class DecimalRound {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			DecimalFormat df = new DecimalFormat("0.00");
	        String decimal = df.format(364565.14542353255);
//	        System.out.println(decimal);
	        
	        double kilobytes = 1205;
	        double newKB = Math.round(kilobytes*100.0)/100.0;
	        
//	        System.out.println(newKB);
	        
	        double d = 2000;
	        d = Math.round(d*100)/100.0d;
//	        System.out.println(d);
	        DecimalFormat f = new DecimalFormat("##.00");
	        String s = f.format(d);
	        System.out.println(s);
	        System.out.println(Double.parseDouble(s));
//	        System.out.println(f.format(d));
	        
	}

}
