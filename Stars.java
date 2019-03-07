package p1;

import java.util.*;
public class Stars {
	
	public static void  main(String []args) {
	Scanner scanner = new Scanner(System.in);
	
	
	// 홀수 입력 ,종류 입력 받기 
	
	int num = scanner.nextInt(); // 줄 수 입력받기 
	int kind= scanner.nextInt(); // 종류 입력받기
	int temp= num; // 입력 수 저장 
	
	if(((num%2==0)||(num>100))||((kind<1)||(kind>4))) // 입력받은 수가 짝수 이거나 100을 넘으면 에러, 종류는 1~4만 입력해야함
	{
		System.out.print("INPUT ERROR!");
	}
	
	
	else {
	
//    1번일 때 
	
	if(kind ==1) {
		
		for(int j =1; j<=((num/2)+1);j++) {
			for(int i=0; i<j;i++)//** 출력
			{System.out.print("*");}
			 System.out.print("\n");
		}
		
		
		for(int j =((num/2)); j>=1;j--) {
			for(int i=0; i<j;i++)//** 출력
			{System.out.print("*");}
			System.out.print("\n");}
		}
	
	// 2번일 때 
	if(kind ==2) {
		
		
		for(int j =1; j<=((num/2)+1);j++) {
			
			for(int i=1; i<=((num/2)+1)-j;i++)//"" "" 출력
			{System.out.print(" ");}
			
			for(int i=1; i<=j;i++)//* 출력
			{System.out.print("*");}
			 System.out.print("\n");
		}
		
		// 4 번 째 줄 부터 
		// 2 . 1  순으로 출 력 
		for(int j =((num/2)); j>=1;j--) {// 2로 만듦
			
			for(int i=1; i<=((num/2)+1)-j;i++)//"" "" 출력
			{System.out.print(" ");}
			
			for(int i=1; i<=j;i++)//* 출력
			{System.out.print("*");}
			 System.out.print("\n");
		}
		
		
		
		
	}
	
// 3번일 때

	if(kind ==3) {
		
		for(int i=0; i<((temp/2)+1);i++,num--) {
		
			
			int m =num-i; // 전체 출력 num 중 공백 i 개 , m 은 m= num- i 별표 출력 개수
			
			for(int j=0;j<i;j++)
				System.out.print(" "); // i 만큼  공백 출력
			
			for(int j=0;j<m;j++)
				System.out.print("*"); // m 만큼 별표 출력 
			
			System.out.println("");
			
			if(i==temp/2)
				break;
			
			}
		
			
		num+=1;
		
		for(int i= ((temp/2)-1) ;i>=0;i--,num++) {
			int m =num-i;			
			for(int j=0;j<i;j++)
				System.out.print(" ");	
			
			for(int j=0;j<m;j++)
				System.out.print("*");
		
			System.out.println("");
		
		}
		
}
	

	if(kind ==4) {
		
		
		for(int i=0;i<((temp/2)+1);i++) {
			
			int m = ((temp/2)+1)-i;
			
			for(int j= 0;j<i;j++)
			System.out.print(" ");
			
			for(int j= 0;j<m;j++)
			System.out.print("*");
			
			System.out.println("");
			
			}

		num= (num/2)+2;
		 
		for(int i=temp/2; num<=temp ;num++) {
			
			int m = num-i;
			
			for(int j= 0;j<i;j++)
			System.out.print(" ");
			
			for(int j= 0;j<m;j++)
			System.out.print("*");
		
			System.out.println("");
			
			}
		
		
		
		
	}
	
	
	
	}
	
	
	scanner.close();
	}
}
