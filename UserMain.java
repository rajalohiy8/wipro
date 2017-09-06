package sumofsumofdigits;

public class UserMain {

	public static void main(String[] args) {
		int input1=826574;
		int input2=6;
		long output1=new UserMain().sumOfSumOfDigits(input1, input2 );
		System.out.println(output1);
		input1=12345;
		input2=5;
		 output1=new UserMain().sumOfSumOfDigits(input1, input2 );
		System.out.println(output1);
		}
		public long sumOfSumOfDigits(int input1, int input2 ){
		long sum=0;
		int num=input1;
		if(input2==6){
			int sumof1_digits=0;
			int sumof2_digits=0;
			int sumof3_digits=0;
			int sumof4_digits=0;
			int sumof5_digits=0;
			int sumof6_digits=0;
			
			int srr[]=new int[6];
			int i=5;
			while(input1>0){
				srr[i]=input1%10;
				input1=input1/10;
				i--;
			}
			sumof1_digits=srr[0]+srr[1]+srr[2]+srr[3]+srr[4]+srr[5];
			sumof2_digits=(srr[0]*10+srr[1])+(srr[1]*10+srr[2])+(srr[2]*10+srr[3])+(srr[3]*10+srr[4])+(srr[4]*10+srr[5]);
			sumof3_digits=(srr[0]*100+srr[1]*10+srr[2])+(srr[1]*100+srr[2]*10+srr[3])+(srr[2]*100+srr[3]*10+srr[4])+(srr[3]*100+srr[4]*10+srr[5]);
			sumof4_digits=(srr[0]*1000+srr[1]*100+srr[2]*10+srr[3])+(srr[1]*1000+srr[2]*100+srr[3]*10+srr[4])+(srr[2]*1000+srr[3]*100+srr[4]*10+srr[5]);
			sumof5_digits=(srr[0]*10000+srr[1]*1000+srr[2]*100+srr[3]*10+srr[4])+(srr[1]*10000+srr[2]*1000+srr[3]*100+srr[4]*10+srr[5]);
			sumof6_digits=num;
			sum=-sumof1_digits+ sumof2_digits - sumof3_digits  + sumof4_digits  - sumof5_digits  + sumof6_digits ;
		}
		
		else if(input2==5){
			int sumof1_digits=0;
			int sumof2_digits=0;
			int sumof3_digits=0;
			int sumof4_digits=0;
			int sumof5_digits=0;
			
			int arr[]=new int[5];
			int i=4;
			while(input1>0){
				arr[i]=input1%10;
				input1=input1/10;
				i--;
			}
			sumof1_digits=arr[0]+arr[1]+arr[2]+arr[3]+arr[4];
			sumof2_digits=(arr[0]*10+arr[1])+(arr[1]*10+arr[2])+(arr[2]*10+arr[3])+(arr[3]*10+arr[4]);
			sumof3_digits=(arr[0]*100+arr[1]*10+arr[2])+(arr[1]*100+arr[2]*10+arr[3])+(arr[2]*100+arr[3]*10+arr[4]);
			sumof4_digits=(arr[0]*1000+arr[1]*100+arr[2]*10+arr[3])+(arr[1]*1000+arr[2]*100+arr[3]*10+arr[4]);
			sumof5_digits=num;
			
			sum=-sumof1_digits  + sumof2_digits  - sumof3_digits + sumof4_digits  - sumof5_digits ;
		}
	
		return sum;
		}


	

}
