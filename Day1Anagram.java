package com.bridgelabz.DailyPracticeProblems;

import java.util.*;

public class Day1Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc = new Scanner (System.in);
         String s1, s2;
         System.out.println("enter the first word");
         s1 = sc.next();
         
         System.out.println("enter the second word");
         s2 = sc.next();
         
         // convert string into character array to use sort method
         char c1[]=s1.toCharArray();
         char c2[]=s2.toCharArray();
         
         // check length is same or not
         if(c1.length != c2.length)
         {
        	 System.out.println("not anagram");
         System.exit(0);       //program will exit here
         }
          // sorting method
         Arrays.sort(c1);
         Arrays.sort(c2);
         
         // checking string is same or not
         for (int i = 0; i < c1.length; i ++)
         {
        	 if (c1[i]!=c2[i])
        	 {
        		 System.out.println("not anagram");
        		 System.exit(0);   // program will exit here
        		 
        	 }
         }
         
         System.out.println("Anagram");
         sc.close();
	}

}
