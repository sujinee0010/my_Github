package p1;

import java.util.*;
public class bingoGame {
	public static void main(String []args) {
		
		Scanner scanner = new Scanner(System.in);
//		
//		ù° �ٺ��� �ټ�° �ٱ��� �����ǿ� ������ ���� ���� �� �����ٺ��� ���ʴ�� �� �ٿ� �ټ� ���� �� ĭ�� ���̿� �ΰ� �־�����.
//		����° �ٺ��� ��° �ٱ��� ��ȸ�ڰ� �θ��� ���� ���ʴ�� �� �ٿ� �ټ� ���� �� ĭ�� ���̿� �ΰ� �־�����.
//		�����ǿ� ������ ���� ��ȸ�ڰ� �θ��� ���� ���� 1���� 25������ ���� �� ���� ���ȴ�.
//		
		
		int bingo[][]= new int [5][5]; // ���� �� �迭�� �����
		
	//	00 01 02 03 04
		
		for(int i= 0; i<5;i++) {
			for(int j=0; j<5;j++)
			{
				
				bingo[i][j]=scanner.nextInt();
			
			}
		}
		
		
		//��ȸ�ڰ� �θ��°� �迭�� �����
		
		
		int countnum[][]= new int [5][5];
		
		for(int i= 0; i<5;i++) {
			for(int j=0; j<5;j++)
			{
				
				countnum[i][j]=scanner.nextInt();
			
			}
		}
	
		// ���� ������ �� 1�� �ٲ�� ����
		int num=0;
		int bingoCount=0;
		
		
		for(int i= 0; i<5;i++) {
			for(int j=0; j<5;j++)
			{
				 
				
				int right=0;
				
				
				
				for(int m= 0; m<5;m++) {
					for(int h=0; h<5;h++)
					{
		
						if(bingo[m][h]==countnum[i][j]) {
							
							bingo[m][h]=0;
							right=1;     // ���� ������ �� 1�� �ٲ�� ����
							num+=1;
							break;}
		
					} 
					if(right==1){break;}
				
				}
				
				//���� �� 0 �̰ų� ���� �� 0 �̰ų� 
				//04 13 22 31 40
				//00 11 22 33 44 �� ��� 
				// ���� 
				// ���� 3 �� �Ǹ�  num ��� 
				
//				for(int i= 0; i<5;i++) {
//					for(int j=0; j<5;j++)
//					{
//				
				
				
				
				for(int m=0;m<5;m++)
				{
					if ((bingo[m][0]==0)&&
						(bingo[m][1]==0)&&
						(bingo[m][2]==0)&&
						(bingo[m][3]==0)&&
						(bingo[m][4]==0))
						
					{ bingoCount+=1;  
					
					if(bingoCount>=3)
					{break;}
					
					}
					
				}
				
				if(bingoCount>=3){break;}
				
				for(int m=0;m<5;m++)
				{
					if((bingo[0][m]==0)&&
						(bingo[1][m]==0)&&
						(bingo[2][m]==0)&&
						(bingo[3][m]==0)&&
						(bingo[4][m]==0))
					{ bingoCount+=1; 
					if(bingoCount>=3){break;}
					
					}
				}
				
				
				if(bingoCount>=3){break;}
				
				
				
				
				
			//���� �� �� ���� �Ǵ� �� ����..........	���Ű� 3�� ���ϸ� 0���� �ʱ�ȭ�ϴ°����� �ذ�!
				
				if ((bingo[0][0]==0)&&
					(bingo[1][1]==0)&&
					(bingo[2][2]==0)&&
					(bingo[3][3]==0)&&
					(bingo[4][4]==0))
					
					{ bingoCount+=1;					
					if(bingoCount>=3){break;}
					}
				
			else if((bingo[0][4]==0)&&
					(bingo[1][3]==0)&&
					(bingo[2][2]==0)&&
					(bingo[3][1]==0)&&
					(bingo[4][0]==0))
						
					{ bingoCount+=1;
				
					
					if(bingoCount>=3){break;}
					}
				
				if(bingoCount<3){bingoCount=0;} // ���� ����� ���� �� ���� �ȵǸ� ���� ���� �ʱ�ȭ  
					
			}
			
			if(bingoCount>=3){break;}
		}
		
		
		
		
		
		System.out.println(num);
		
		
		
		
		
		scanner.close();
		
		
	}
}
