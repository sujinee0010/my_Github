package p1;

import java.util.*;
public class scoreAverage {

	
	public static void  main(String []args) {
		Scanner scanner = new Scanner(System.in);

		int result=0;// �����
		// �л� ���� �Է¹ޱ� 
		int score[]= new int[5];
		
		for(int i= 0 ; i<5; i++)
		score[i]=scanner.nextInt();
		//40�̸� 40 �� ó�� 
		for(int i = 0; i<5; i++) {
		if (score[i]<40)
		{
		 score[i]=40;
		}
		
		}
			
		// ��� ���� ���ϱ� 
		
		for(int i = 0 ;i<score.length;i++)
			result+=score[i];
		
		System.out.print(result/5);
		
		
	scanner.close();
	}
	
	
}
