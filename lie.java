package p1;

import java.util.*;
public class lie {
	
	public static void main(String []args) {
	
	Scanner scanner = new Scanner(System.in);
	int n = scanner.nextInt(); // ��Ƽ�� �����ϴ� ��� ����� �� 
	int m = scanner.nextInt(); // ��� ��Ƽ�� �� 
	int result=0;// ������ �� �� �ִ� ��Ƽ�� �� = ��� ��
	
	
	int truenum = scanner.nextInt(); // ������ �ƴ� ����� �� 

	 
	int truepnum[]= new int[truenum]; // ������ �ƴ� ����� ��ȣ���� �Է� �ް�  �迭�� ����
	
	if(truenum<=n) {
	for (int i= 0; i<truepnum.length;i++)
		 truepnum[i]= scanner.nextInt(); 

	
//	������ ��Ƽ m �� ��ŭ �Է� �ޱ� 
    for(int i =0; i<m;i++) {  
    	
    	int num =scanner.nextInt(); // �������� �Է� 
    	
    	int pnum[]=new int[num]; // ���� ����� ��ȣ ������ �迭 ����
    	
    	for(int j=0;j<num;j++) //
    	{	pnum[j]= scanner.nextInt(); 
    		
    	}
    	
    	
    	int trueman=0;// ������ �����ϴ� ��Ƽ���� �˾Ƴ� �� �ִ� ����  
    	
    	// �� ��Ƽ�� ���� ��� ��ȣ�� ������ �ƴ� ����� ��ȣ�� ������  ������ �����ϴ� ��Ƽ 
    	for(int j=0;j<num;j++) { // (��Ƽ ���� ��ȣ )
    		for(int h=0;h<truenum;h++ ) { // (���� �ƴ� ��� ��ȣ )
    			if( pnum[j]==truepnum[h]) {// ��ȣ�� ������ (��Ƽ�� ���� �ƴ� ��� ������)
    							
    				trueman+=1; // ���� +1 �ϰ� 
    				break;  //�ݺ��� ����
    				
    			}
    		
    		
    		}
    		if(trueman==1)break; // �̹� ��Ƽ�� 3 ���� ���Ե��ֱ� ������
    								//� ��ȣ�� ����  �ֵ� �ϴ� ������ ��ġ�� ��Ƽ�ϱ� �ݺ��� ����
    		}
    	
    	
    	   	if(trueman==0) // ���� ��ȭ ���� ��, �� �����ϴ� ��� ��ȣ �߿� ���� �ƴ� ����� ���ٸ� 
    	   	  {result+=1;} 	// ������ ���Ҽ� �ִ� ��Ƽ 
 
    }
    
	}
    	System.out.print(result);// �� ������ ���� �� �ִ� ��Ƽ ���
    	scanner.close();
	
	}
	
	
}
