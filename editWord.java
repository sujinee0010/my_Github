package p1;

import java.util.*;

public class editWord {

	
	public static void main(String []args) {
		
		Scanner scanner = new Scanner(System.in);
		
		// 18 
			
			int num= scanner.nextInt();// ���ľ� �� ���� �� �Է� �ޱ� 
			String old []= new String[num]; // ���� ���ڿ� 
			String newest[] = new String[num]; // ���� ���ڿ�
			
			for (int i = 0; i<num; i++) {
				
				
				old[i]=scanner.next(); // a(���� )  A(�ٲܲ�)
				newest[i]=scanner.next();
			
				
			}
			
			

			int Snum= scanner.nextInt();// ���ڿ� �� ���� �Է� 
			
			String c[]= new String [Snum];//  ���ڿ� 
		
			for (int i=0; i <Snum;i++) {
				
				c[i]= scanner.next(); // ���ڿ� �Է�  �迭 ũ��  Snum ũ�� �ϳ��� �ѹ��ھ� ������� 
				
				
			}
		
			for (int i =0 ; i < Snum;i++) {
				for (int j =0; j<num;j++) {
					if(c[i].equals(old[j]))
						{c[i]= newest[j];
								break;};
			
			
				}
				
				
				
				  System.out.print(c[i]);
			}
		
			
		
		
		
		scanner.close();
	}
	
	
	// �ñ��� 
	// ���� �Էµ� ���ڿ� ó��
	// ��ҹ���
	//nextLine
	
	
}
