package p1;

import java.util.Scanner;

public class divideBy5and3 {

	
	

	public static void main(String []args) {
		
		Scanner scanner = new Scanner(System.in);
	
		
		int num= scanner.nextInt();// 숫자 입력 받기
		int num2=0;// 결과 값
		
		 if(num>=5) //입력수가  5 보다 크면 
			   
			 
		 {
			 while(num>=5) {
			
				 num= num - 5 ;// 5를 뺀다
				 num2++;
			 	}		
			 
			 if(num==0)// 나머지가 0 일 떄 
			 System.out.print(num2); //0의 경우 . 0이면 갯수 출력 , 나눠 떨어질 때 
			
		 
			else if(num==3) // 나머지가 3일 떄 
				 	System.out.print(num2+1);
			 
			else //  나머지가  1,2,4 일 떼  
			{
			num+=5; 
			int temp=num;// 저장
		 	num%=3;// 5 다시 더해서 3으로 나눔
		 	
			
		 	
		 		if(num==0)
		 			System.out.print(num2-1+temp/3);
			 	
				 
		 		else 
		 			System.out.print("-1");
			
			}
			 
			
			
		 }
			 
			
		
	
		 
		else if((num>=3)&&(num<5))// 입력 수가  5보단 작고 3보다 크면
		 {
			 if(num%3==0)
				 System.out.print("1");
			 else
				 System.out.print("-1");
		 }
		 
		 
		 
		 
		else if (num<3)// 입력수가   3보다 작으면 
			System.out.print("-1");
		
			scanner.close();
		
				
	}
	
	
	
	
}
