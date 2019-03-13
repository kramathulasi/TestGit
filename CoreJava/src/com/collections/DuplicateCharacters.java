package com.collections;
	import java.util.*;
	public class DuplicateCharacters {

	    public static void main(String[] args) {
	        // TODO Auto-generated method stub

	    	int []str = {1,4,2,2,6,8,6,4};
	        for(int i=0;i<str.length;i++)
	        {
	        	int flag=0;
	            for(int j=i;j<str.length;j++)
	            {
	            	if(i != j)
	            	{
	            	if(str[i] ==str[j])
	            	{
	            		flag =1;
	            		break;
	            	}
	            	}
	            }
	            if(flag ==1)
	            {
	            	System.out.println(str[i]);
	            }
	        }
	        
/*   
	    	ArrayList<Integer> al = new ArrayList<>();
	    int []arr = {1,2,4,2,5,5,3,5};
	    int k = arr.length;
	    for (int i = 0; i< arr.length; i++) 
            arr[(arr[i]%k)] += k; 
	   // System.out.println(arr.toString());
	    for(int i=0; i<arr.length; i++)
	    {
	    	System.out.println(arr[i]);
	    }
	    // Find index of the maximum repeating element 
        int max = arr[0], result = 0; 
        for (int i = 1; i < arr.length; i++) 
        { 
            if (arr[i] > max) 
            { 
                max = arr[i]; 
                result = i; 
            } 
        } 
	    
        System.out.println(result);
        */
	        //Duplicate characters in a String
	        String str1 = "abcdesacb";
	        Map<Character, Integer> dupMap = new HashMap<Character, Integer>(); 
	        char[] chrs = str1.toCharArray();
	        for(Character ch:chrs){
	            if(dupMap.containsKey(ch)){
	                dupMap.put(ch, dupMap.get(ch)+1);
	            } else {
	                dupMap.put(ch, 1);
	            }
	        }
	        Set<Character> keys = dupMap.keySet();
	        for(Character ch:keys){
	            if(dupMap.get(ch) > 1){
	                System.out.println(ch+"--->"+dupMap.get(ch));
	            }
	            else{
	            	System.out.println(ch);
	            }
	        }
	    }

	}
