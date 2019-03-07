package p1;

import java.util.*;
public class plate {
	
	public static void main (String[]args) {

		Scanner scanner = new Scanner(System.in);
		int result= 0;// 결과 값
		
		String answer = new String(scanner.next());// 괄호 입력 받기 
		
		
		if((answer.length()>=3 )&&(answer.length()<=50))// 길이 제한 
		{
		char c =answer.charAt(0); // string의 첫번째 문자 
		
		if((c=='(')|| (c==')')){ // 초기 값 10 
			result= 10 ;
		}
	
		
		for(int i=1; i<answer.length();i++)// 입력값 길이 만큼 
		{
			
			if(answer.charAt(i-1)==answer.charAt(i))
				{result += 5;}
			
			else//(answer.charAt(i-1)!=answer.charAt(i))
			{	result += 10;}
		
		}
		
		System.out.println(result);
		
		
		
		
		}scanner.close();
	}		
	}	

