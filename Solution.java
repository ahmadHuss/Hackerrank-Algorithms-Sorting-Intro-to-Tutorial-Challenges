import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {

    
        Scanner s = new Scanner(System.in);
	 
		 int searchValue = s.nextInt();
		 s.nextLine();
		 int n = s.nextInt();
		 int onLocation =0;
		 int arr[] = new int[n];
		 
		 int length = arr.length;
		 //For Input
		 for(int i =0;i<length;i++){
			 
			 arr[i] = s.nextInt();
		 }
		 
		 //Search Index
		 for(int i=0;i<length;i++){
			 
			 
			 if(arr[i]==searchValue){
				 
				 onLocation = i;
			 }
			 
			 
		 }
		 
		 System.out.println(onLocation);
	
	
	}

}