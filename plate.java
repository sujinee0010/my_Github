package p1;

import java.util.*;
public class plate {
	
	public static void main (String[]args) {

		Scanner scanner = new Scanner(System.in);
		int result= 0;// ��� ��
		
		String answer = new String(scanner.next());// ��ȣ �Է� �ޱ� 
		
		
		if((answer.length()>=3 )&&(answer.length()<=50))// ���� ���� 
		{
		char c =answer.charAt(0); // string�� ù��° ���� 
		
		if((c=='(')|| (c==')')){ // �ʱ� �� 10 
			result= 10 ;
		}
	
		
		for(int i=1; i<answer.length();i++)// �Է°� ���� ��ŭ 
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

