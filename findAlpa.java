package p1;

import java.util.*;

public class findAlpa {



	public static void main(String []args) {
		
	Scanner scanner = new Scanner(System.in);
	
	
	String word = scanner.next();// �ܾ� �Է� �ޱ�
	// ���ĺ� �迭 97~122 ����
	int al []= new int [26];
	
	for(int i=0, j='a' ;i<al.length;i++,j++) {
		
		al[i]=j;
		
	}
	
	// ��� �迭����
	int result[]= new int[26];
	for(int i=0;i<result.length;i++) {result[i]=-1;}
	
	// �Է¹��� string �ε��� 0~ �� ���� ���ĺ� �迭�� �� ��  ����� �迭�� �ش� �ε��� ��ȣ ���� 
	for(int i=0; i<al.length;i++) {
		for(int j=0; j<word.length();j++) { 
			if(al[i]==word.charAt(j))
			{		
				result[i]=j;
				break;
			}
			
		}
		}
	
	// ���
	for(int i= 0; i<result.length;i++)
	System.out.print(result[i]);
	
	
	
	scanner.close();
	}
}
