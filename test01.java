package p1;

import java.util.*;
public class test01 {
	public static void main(String [] args) {
		Scanner scanner = new Scanner (System.in);
		
		
		// 숫자 입력
		
		int num = scanner.nextInt();
	
		//결과 값 출력
		int result =0;	
		
	   	if(num<100)
	   	{result=num; // 2자리 수는 1-99 까지 다 등차니까 
	   	System.out.println(result);}
	   	
	   	
	   	else  // 3 자리 // 100-999
	   		{ 
	   		
	   		
	   		result=99; //기본값이 99개 부터 
	   		
	   		for(int i=100;i<=num;i++) {
	   			
	   		int C =0; // 등차가 같을 떄 마다 증가하는 변수 
	   		
	   		int nums[]= new int[3]; //배열 생성
	   		
	   			for(int j=0,m=2,k=i;j<3;j++,m--) {
	   			nums[j]= (int) (k/(Math.pow(10, m )));
	   			k=(int) (k%(Math.pow(10, m )));    // 3자리수의 각 자리수를 배열에 넣어줌
	   			
	   			}
	   		
	   		
	   		
	   		
	   		
	   		int sub[]= new int[2];//등차 저장 배열nums.length-1
	   		
	   		
	   			for(int j=0; j<2;j++)
	   			{
	   				sub[j]= nums[j]-nums[j+1]; // 수 간의 차이, 등차 배열
	   			}
	   		
	   			for(int j=0;j<1;j++) {//sub.length-1
	   				if(sub[j]==sub[j+1]) // 값이 같을 경우에 c 변수가 증가 
	   					C++;
	   			}
	   			
	   			if(C==1)//  
	   				result+=1;
	   			
	   			
	   		
	   		
	   		}
	   		
	   		System.out.println(result);
	   		
	   	}
	
		scanner.close();
		
	}

	

}
