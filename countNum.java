package p1;
import java.util.*;
public class countNum {

	public static void main(String []args)
	{
		
		Scanner scanner = new Scanner(System.in);
		
		
		
	// ������ ���� �ޱ�
		int num1 = scanner.nextInt();
		int num2= scanner.nextInt();
		int num3 = scanner.nextInt();
		
	// ���� ���ϱ�
	int val = num1*num2*num3;
	//3020403050
	//01234---
	
	
	String s = Integer.toString(val); // ������ ���ڿ���  
	
	char numbers []= {'0','1','2','3','4','5','6','7','8','9'};

	int result []= new int [10];// �� � ���ִ��� ��¹迭

	// 0���� 9 ���� ���ʷ� ���� ���� ���ؽ� 0 ������ ������ �˻��Ͽ� ���� ��� 
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
