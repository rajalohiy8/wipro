import java.util.*;
public class AlphaNumeric {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
String str =sc.next();
System.out.println(getAlphaNumeric(str));
}
public static int getAlphaNumeric(String input1){
	int k=0,p=0,j,sum_alpha=0,sum_num=0;
	char arr[]=input1.toCharArray();
	int alpha[]=new int[input1.length()];
	int num[]=new int[input1.length()];
	for(int i=0;i<input1.length();i++){
		if((arr[i]>='A'&&arr[i]<='Z')||(arr[i]>='a'&&arr[i]<='z'))
		{
			alpha[k]=i;
			k++;
		}
		else if(Character.getNumericValue(arr[i])>=0&&Character.getNumericValue(arr[i])<=9){
			num[p]=Character.getNumericValue(arr[i]);
			p++;
		}
	}
	if(p%3!=0)
		return -10;
	else{
		for(int i=0;i<=p-3;i=i+3){
			sum_num=sum_num+(num[i]+num[i+1])*num[i+2];
		}
	}
	for( j=0;j<k-1;j++){
		if(alpha[j]+1!=alpha[j+1])
			continue;
		else break;
		}
	if(j!=k-1)
		return -20;
	else{
		if(alpha[0]==0)
			sum_alpha=1;
			else
				sum_alpha=alpha[0]+1;
	}
		for(int i=1;i<k;i++){
	      		sum_alpha=sum_alpha+(Character.getNumericValue(arr[alpha[i]-1]))+alpha[i]+1;
		}
		return (sum_num+sum_alpha);
	}
	
}

