import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
		/*
		if map have key the replace input with map value
		else
		if num multiply with charoffset
		else
		replace with ASCII + charoffset
		 (if A -> C)
		Skip if ITS a SYMBOL 
		
		*/
		
	HashMap<String,String> wordMap=new HashMap<>();
	String input="Gopi";
		//Sample Input
	StringBuffer str=new StringBuffer();
		//For Mutable String
	int charoffset=2;
	wordMap.put("Gopi","sgn");
	wordMap.put("Gopinath","sgn");
		//Sample Values in Map
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
		    
		    if(input.charAt(i)>33 && input.charAt(i)<44){
		    //Skips if Its a Special cahr
		    continue;
		    }
		   
            	   int a=(int)input.charAt(i)+charoffset;
		    //For Type Casting
        	   str.append((char)a);
            }
            
        } 
         System.out.println(str);
        
		
	}
	}
}
