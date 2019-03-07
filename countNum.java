package p1;
import java.util.*;
public class countNum {

	public static void main(String []args)
	{
		
		Scanner scanner = new Scanner(System.in);
		
		
		
	// 세개의 정수 받기
		int num1 = scanner.nextInt();
		int num2= scanner.nextInt();
		int num3 = scanner.nextInt();
		
	// 정수 곱하기
	int val = num1*num2*num3;
	//3020403050
	//01234---
	
	
	String s = Integer.toString(val); // 정수를 문자열로  
	
	char numbers []= {'0','1','2','3','4','5','6','7','8','9'};

	int result []= new int [10];// 각 몇개 써있는지 출력배열

	// 0에서 9 부터 차례로 곱한 값의 인텍스 0 번부터 끝까지 검사하여 개수 출력 
	for(int i=0; i<10;i++) {
		int count=0;
		for(int j=0; j<s.length();j++) {
		
			if(numbers[i]==s.charAt(j)) {
			
			count+=1;
			result[i]=count;
			
		}
	}
	}
	
	
	for(int i =0;i<result.length;i++) {
	System.out.println(result[i]);
	}	
	
	
	
	scanner.close();
	}
}
