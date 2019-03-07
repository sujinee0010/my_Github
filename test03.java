package p1;

import java.util.*;
public class test03 {

	public static void main (String []args) {
		
		Scanner scanner = new Scanner (System.in);
		
		
		int num= scanner.nextInt();
		
		
		double nums[]= new double[num];
		
		for(int i=0; i<num;i++) {
			
			nums[i]=scanner.nextInt();
			
		}
		
		
		double tmp=0;
		
		for(int i=0;i<num-1;i++) {
			
			if(i==0) {
				if(nums[0]<nums[1])
				tmp=nums[1];
				else
				tmp=nums[0];
			}
			
			
			if(tmp<nums[i+1])
				tmp=nums[i+1];
		
		
		
		
		}// 최댓값 구하기
		
		
	//	System.out.println(tmp);
		
		for(int i=0;i<num;i++) {
			
			nums[i]=nums[i]/tmp*100;
			
			
		}
		
		double arg=0;
		
		for(int i=0 ;i<num;i++) {
			
			arg+=nums[i];
			
		}
		
		arg/=num;
		
		System.out.println(arg);
		
		scanner.close();
	}
	
}

