package p1;

import java.util.*;
public class test01 {
	public static void main(String [] args) {
		Scanner scanner = new Scanner (System.in);
		
		
		// ���� �Է�
		
		int num = scanner.nextInt();
	
		//��� �� ���
		int result =0;	
		
	   	if(num<100)
	   	{result=num; // 2�ڸ� ���� 1-99 ���� �� �����ϱ� 
	   	System.out.println(result);}
	   	
	   	
	   	else  // 3 �ڸ� // 100-999
	   		{ 
	   		
	   		
	   		result=99; //�⺻���� 99�� ���� 
	   		
	   		for(int i=100;i<=num;i++) {
	   			
	   		int C =0; // ������ ���� �� ���� �����ϴ� ���� 
	   		
	   		int nums[]= new int[3]; //�迭 ����
	   		
	   			for(int j=0,m=2,k=i;j<3;j++,m--) {
	   			nums[j]= (int) (k/(Math.pow(10, m )));
	   			k=(int) (k%(Math.pow(10, m )));    // 3�ڸ����� �� �ڸ����� �迭�� �־���
	   			
	   			}
	   		
	   		
	   		
	   		
	   		
	   		int sub[]= new int[2];//���� ���� �迭nums.length-1
	   		
	   		
	   			for(int j=0; j<2;j++)
	   			{
	   				sub[j]= nums[j]-nums[j+1]; // �� ���� ����, ���� �迭
	   			}
	   		
	   			for(int j=0;j<1;j++) {//sub.length-1
	   				if(sub[j]==sub[j+1]) // ���� ���� ��쿡 c ������ ���� 
	   					C++;
	   			}
	   			
	   			if(C==1)//  
	   				result+=1;
	   			
	   			
	   		
	   		
	   		}
	   		
	   		System.out.println(result);
	   		
	   	}
	
		scanner.close();
		
	}

	

}
