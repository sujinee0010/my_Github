package p1;

import java.util.*;

public class minimum {
	public static void main(String []args) {
		
	Scanner scanner = new Scanner(System.in); 	
		
	int num = scanner.nextInt(); // �迭 ���� �Է�
	
	// A �迭 �����
	int A []= new int [num];    
	
	// AA �迭 �����
	int AA []= new int [num]; // ū ������� ������ �迭
	
	// B �迭 ����� 
	int B []= new int [num];
	
	// BB �迭 ����� 
	int BB []= new int [num]; // B 
	 
	
	for(int i =0; i<num;i++) {
		
		A[i]= scanner.nextInt(); /// 11160 ->11016
	}                             // 61110
	
	for(int i =0; i<num;i++) {
		
		B[i]= scanner.nextInt(); //27831  
	}
	
	
	for(int i =0; i<BB.length;i++)
		BB[i]=B[i]; // B�迭 ���� 
	
	
	
	//A�� ū ������� �������� �迭 AA ->61110
	
	
	
	for(int j=0; j<num;j++) {
	// a �迭 ����
	int temp=0;
	// �ο��� ��ȣ ���
	int index =0;
	//���� ū�Ÿ� 0 �ε����� 
		for(int i =0;i<num-1 ;i++)
		{
		
			if(i>0)
			{
				if(temp < A[i+1])
				{temp=A[i+1];
				index=i+1;}
		
			
			}
			
		else {	
				if (A[i]< A[i+1])
				{temp=A[i+1];
				index=i+1;}
		
				else
				{temp=A[i];
				index=i;}
		}
		
	
	} // �̰� ���� �� ���� ū�� ���� 
	
		AA[j]=temp ;    // ���� ū ����  ù��°�ε����� ���� 
		A[index]=-1; //  ��ū�� -1�� �ʱ�ȭ ���� 
	
	}
	
	
	/// 11160 ->11016
	
	
	// AA �� 61110 ���� 
		
	
	
	
	
	// B �ε����� ���� ū ���� �ε��� ��ȣ�� �˾Ƴ��� �� �ε��� ��ġ�� �����ϰ� A�迭�� ���� 
	

	for(int j=0; j<num;j++) {
	// BB �迭 ����
	int temp=0;
	// �ο��� ��ȣ ���
	int index =0;
	//���� ū�Ÿ� �� �ε����� 
		for(int i =0;i<num-1 ;i++)
		{
		
			if(i>0)
			{
				if (temp < BB[i+1])
				{temp=BB[i+1];
				index=i+1;}
		
			
			}
			
		else {	
				if (BB[i]< BB[i+1])
				{temp=BB[i+1];
				index=i+1;}
		
				else
				{temp=BB[i];
				index=i;}
		}
		
	
	} // �̰� ���� �� ���� ū�� ���� 
	
		A[index]=AA[num-1-j] ;    // AA�� ���� ū��[������ ���ؽ�]�� BB �迭 �� ���� ū ���� �ִ� �ε��� ��ȣ �� ���� ��ȣ�� A�迭�� �־���  
		BB[index]=-1; //  ��ū�� -1�� �ʱ�ȭ ���� 
		
	}
	
	
// A�� ���� ��. B�� �״�� 
	

	int S =0; // A �迭 B �迭 �� ���Ѱ�  ���� 
	
	for(int i=0; i<num ;i++)
	{
		
		S+= A[i]* B[i];
		
	}
	
	

	
	System.out.println(S);
	
	scanner.close();
	
	}
	
	
	
	
}
