package p1;

import java.util.*;
public class aptKing {

	
	public static void main(String []args) {
		Scanner scanner = new Scanner(System.in);
		
		
		int r[][]= new int [15][14]; // ����Ʈ�� ������ �迭��  0�� ~ 14 ��, 0ȣ (1ȣ )13 ȣ(14ȣ) 
		
		for(int i =0,j=1;i<14;i++,j++) // 0�� ��� ���� 
			r[0][i]=j;
		
		for(int i =1;i<15;i++) {// 1��-14�� ��� ���� 
			for(int j=0;j<14;j++)//0ȣ-13 ȣ // 1�� 1ȣ - 1�� 2 ȣ // 0 �� 1 2 ȣ // ��  3 
		{
			for(int m=0;m<=j;m++)
				r[i][j] += r[i-1][m];
			
		}	
		}
		
		
		int T = scanner.nextInt(); // �� ���� ���̽�  
		
		int result[]=new int [T]; // ��� ��� �迭
		
		int k=0;// ��
		int n=0;// ȣ
		
		for(int i=0;i<T;i++)
		{	
			k=scanner.nextInt(); // �� �Է�
			n=scanner.nextInt(); // ȣ �Է�
			
			result[i]=r[k][n-1]; // ��� �迭�� �� �ֱ�, n-1 ȣ�ΰ� ������ 1���� 14ȣ�ε� �迭���� 0���� 13 ȣ����  
			
		}
		
		for(int i =0; i<result.length;i++)
		System.out.println(result[i]);
		
		scanner.close();
	}
}
