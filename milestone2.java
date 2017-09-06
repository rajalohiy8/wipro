import java.io.*;
import  java.util.*;

// Read only region start
class UserMainCode
{

	public long OTPGen(int[] input1,int input2){
		// Read only region end
		// Write code here..
		
		String[] arr=new String[input2];
        for(int i=0;i<input2;i++)
        {
            arr[i]=Integer.toString(input1[i]);
        }
        TreeSet<Integer> tSet=new TreeSet<Integer>();
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length()-2;j++)
            {
                tSet.add(Integer.parseInt(arr[i].substring(j,j+3)));
            }
        }
        int set1=0;
        
        if(tSet.size()!=0)
        set1=tSet.first();
        //-------------------------
        TreeSet<Integer> tSet2=new TreeSet<Integer>();
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length();j++)
            {
                tSet2.add(arr[i].charAt(j)-'0');
            }
        }
        
        Iterator<Integer> it=tSet.iterator();
        
        
        int set2=0;
        int small=tSet2.first();
        int big=tSet2.last();
        if(small!=big)
            set2=small+big;
       
        return Long.parseLong(""+set1+set2);
        
    }
}