package p1;

import java.util.Scanner;

public class divideBy5and3 {

	
	

	public static void main(String []args) {
		
		Scanner scanner = new Scanner(System.in);
	
		
		int num= scanner.nextInt();// ���� �Է� �ޱ�
		int num2=0;// ��� ��
		
		 if(num>=5) //�Է¼���  5 ���� ũ�� 
			   
			 
		 {
			 while(num>=5) {
			
				 num= num - 5 ;// 5�� ����
				 num2++;
			 	}		
			 
			 if(num==0)// �������� 0 �� �� 
			 System.out.print(num2); //0�� ��� . 0�̸� ���� ��� , ���� ������ �� 
			
		 
			else if(num==3) // �������� 3�� �� 
				 	System.out.print(num2+1);
			 
			else //  ��������  1,2,4 �� ��  
			{
			num+=5; 
			int temp=num;// ����
		 	num%=3;// 5 �ٽ� ���ؼ� 3���� ����
		 	
			
		 	
		 		if(num==0)
		 			System.out.print(num2-1+temp/3);
			 	
				 
		 		else 
		 			System.out.print("-1");
			
			}
			 
			
			
		 }
			 
			
		
	
		 
		else if((num>=3)&&(num<5))// �Է� ����  5���� �۰� 3���� ũ��
		 {
			 if(num%3==0)
				 System.out.print("1");
			 else
				 System.out.print("-1");
		 }
		 
		 
		 
		 
		else if (num<3)// �Է¼���   3���� ������ 
			System.out.print("-1");
		
			scanner.close();
		
				
	}
	
	
	
	
}
