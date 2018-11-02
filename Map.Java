/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	HashMap<String,String> wordMap=new HashMap<>();
	String input="Gopi";
	StringBuffer str=new StringBuffer();
	int charoffset=2;
	wordMap.put("Gopi","sgn");
	wordMap.put("Gopinath","sgn");
	if(wordMap.containsKey(input)){
		
		//Replace if Found
		input=wordMap.get(input);
		System.out.println(input);
	}
	else{
		//CheckNumber
		try{
		int temp = Integer.parseInt(input);
		
		 System.out.println(temp*charoffset); 
		}
        
        catch (NumberFormatException e) 
        { 
            //NOT A Valid Num
            
            for(int i=0;i<input.length();i++){
            	int a=(int)input.charAt(i)+charoffset;
        	str.append((char)a);
            }
            
        } 
         System.out.println(str);
        
		
	}
	}
}
