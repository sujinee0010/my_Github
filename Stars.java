package p1;

import java.util.*;
public class Stars {
	
	public static void  main(String []args) {
	Scanner scanner = new Scanner(System.in);
	
	
	// Ȧ�� �Է� ,���� �Է� �ޱ� 
	
	int num = scanner.nextInt(); // �� �� �Է¹ޱ� 
	int kind= scanner.nextInt(); // ���� �Է¹ޱ�
	int temp= num; // �Է� �� ���� 
	
	if(((num%2==0)||(num>100))||((kind<1)||(kind>4))) // �Է¹��� ���� ¦�� �̰ų� 100�� ������ ����, ������ 1~4�� �Է��ؾ���
	{
		System.out.print("INPUT ERROR!");
	}
	
	
	else {
	
//    1���� �� 
	
	if(kind ==1) {
		
		for(int j =1; j<=((num/2)+1);j++) {
			for(int i=0; i<j;i++)//** ���
			{System.out.print("*");}
			 System.out.print("\n");
		}
		
		
		for(int j =((num/2)); j>=1;j--) {
			for(int i=0; i<j;i++)//** ���
			{System.out.print("*");}
			System.out.print("\n");}
		}
	
	// 2���� �� 
	if(kind ==2) {
		
		
		for(int j =1; j<=((num/2)+1);j++) {
			
			for(int i=1; i<=((num/2)+1)-j;i++)//"" "" ���
			{System.out.print(" ");}
			
			for(int i=1; i<=j;i++)//* ���
			{System.out.print("*");}
			 System.out.print("\n");
		}
		
		// 4 �� ° �� ���� 
		// 2 . 1  ������ �� �� 
		for(int j =((num/2)); j>=1;j--) {// 2�� ����
			
			for(int i=1; i<=((num/2)+1)-j;i++)//"" "" ���
			{System.out.print(" ");}
			
			for(int i=1; i<=j;i++)//* ���
			{System.out.print("*");}
			 System.out.print("\n");
		}
		
		
		
		
	}
	
// 3���� ��

	if(kind ==3) {
		
		for(int i=0; i<((temp/2)+1);i++,num--) {
		
			
			int m =num-i; // ��ü ��� num �� ���� i �� , m �� m= num- i ��ǥ ��� ����
			
			for(int j=0;j<i;j++)
				System.out.print(" "); // i ��ŭ  ���� ���
			
			for(int j=0;j<m;j++)
				System.out.print("*"); // m ��ŭ ��ǥ ��� 
			
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
