package p1;

import java.util.*;
public class oxQuize {

	public static void main (String []args) {
		Scanner scanner = new Scanner (System.in);
		
		
	int num = scanner.nextInt();// � ���̽� �Է� �Ұ��� 
	int result []= new int [num];// �ջ� ��� ��� �迭 
	
	
	for(int i=0 ; i<num;i++) // �� ���̽� ����ŭ ���� ��
	{	
		result[i]=0;
		int Onum =0; // O ��� 
		String cases  = scanner.next(); // ���̽� �Է� �ޱ� OOXXOXXOOO
		
		for(int j =0;j<cases.length();j++) { // ���̽� ��Ʈ�� ���� ��ŭ �ε��� ������ ����
			
			if(cases.charAt(j)=='O')
				{
				
				Onum++; // O �ϰ�� ���� ���� 
				result[i]+=Onum; // ��� ���
				
				}
			else
				{
				Onum=0; //X �ϰ��  0���� ���� 
				result[i]+=Onum;
				}
		}
		
		
		
	
	}
	
	
	for(int i =0;i<result.length;i++)
		System.out.println(result[i]);
	// �� ü�̽� �Է�
		
		
		
		
		
		
		
		scanner.close();
	}
}
