package p1;
import java.util.*;
public class  Sequence {

	

	public static void main(String []args)
	{
		
		Scanner scanner = new Scanner(System.in);
		
//������1 -> ������2 -> ������3 ->������4 ->...		
//������//1 1 2 4 7 12 21 37	
//������ // 1 2 3 5 9 16 28
//   
//
// �ϴ� 1�� 2�� 3����  1�� ���� .....
//
// 4���� 1���� 2 ���� ����
// 5���� 2 ���� 3���� ����
// 6���� 3���� 4���� ����
//7���� 4���� 5���� ���� 
//8���� (�Ƹ�) 5���� 6���� ��
//9���� 6���� 7��  
		
		
		//���̽��ѹ� �Է¹ޱ� 
		
		int caseNum = scanner.nextInt();
		
		// int �� �ϸ� ���� ����!
		long nums[]= new long[100]; // �� ����  �迭
		long result[]= new long[caseNum];// ��� ��� �迭 
		
		// 1�� ~3���� �ﰢ�� ���� ���� 1�� ���� 
		nums[0]=1; 
		nums[1]=1;
		nums[2]=1;
	
		
		//�ﰢ�� �� ���� ��� 
		for(int i=3,j=0; i<100;i++,j++) {
			
			nums[i]=nums[j]+nums[j+1];
			//4���� �� ����  = 1�� ° +2�� °
			//5��° �� ����  = 2�� �� +3�� �� 
			
		}
		
		
		for(int i=0;i<caseNum;i++) {
			
			int num = scanner.nextInt();// ��� ° �� �Է� �ޱ� 
			result[i]=nums[num-1];// �ش� ���� �� ����  ��� ��� �迭�� ���� 
			
			
		}

		// ��� ���
		for(int i=0;i<result.length;i++) {
			
			System.out.println(result[i]);
		}
	
		scanner.close();
	}

	
	}

