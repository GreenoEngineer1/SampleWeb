package com;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AlphabetOrder {

	static int a;
	static String s;
	
    public static void main(String[] args) {
    	
    	
    	
    	int a = 0,        
    			b = 9;       		
    	
    	System.out.println();
    	System.out.println(s);
        String nameArray[] = {
            new String("AALIM MUHAMMED SALEGH COLLEGE OF ENGINEERING"),
            new String("ARM COLLEGE OF ENGINEERING AND TECHNOLOGY"),
            new String("AALIM MUHAMMED SALEGH ACADEMY OF ARCHITECTURE"),
            new String("ADHI COLLEGE OF ENGINEERING AND TECHNOLOGY"),new String("ARIGNAR ANNA INSTITUTE OF SCIENCE AND TECHNOLOGY"),
            new String("ANAND INSTITUTE OF HIGHER TECHNOLOGY"),new String("APOLLO ENGINEERING COLLEGE"),new String("ALPHA COLLEGE OF ENGINEERING"),new String("ARM COLLEGE OF ENGINEERING AND TECHNOLOGY"),
        };

        List<String> names = Arrays.asList(nameArray);
        Collections.sort(names);
//        System.out.println(names);		
        
       /* if ((a > b)
        		|| (a < b)
        	|| (a == b)){
        	System.out.println();
        }*/
    }
}
