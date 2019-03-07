package p1;

import java.util.*;
public class bingoGame {
	public static void main(String []args) {
		
		Scanner scanner = new Scanner(System.in);
//		
//		첫째 줄부터 다섯째 줄까지 빙고판에 쓰여진 수가 가장 위 가로줄부터 차례대로 한 줄에 다섯 개씩 빈 칸을 사이에 두고 주어진다.
//		여섯째 줄부터 열째 줄까지 사회자가 부르는 수가 차례대로 한 줄에 다섯 개씩 빈 칸을 사이에 두고 주어진다.
//		빙고판에 쓰여진 수와 사회자가 부르는 수는 각각 1부터 25까지의 수가 한 번씩 사용된다.
//		
		
		int bingo[][]= new int [5][5]; // 빙고 판 배열로 만들기
		
	//	00 01 02 03 04
		
		for(int i= 0; i<5;i++) {
			for(int j=0; j<5;j++)
			{
				
				bingo[i][j]=scanner.nextInt();
			
			}
		}
		
		
		//사회자가 부르는거 배열로 만들기
		
		
		int countnum[][]= new int [5][5];
		
		for(int i= 0; i<5;i++) {
			for(int j=0; j<5;j++)
			{
				
				countnum[i][j]=scanner.nextInt();
			
			}
		}
	
		// 숫자 맞췄을 때 1로 바뀌는 변수
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
							right=1;     // 숫자 맞췄을 때 1로 바뀌는 변수
							num+=1;
							break;}
		
					} 
					if(right==1){break;}
				
				}
				
				//가로 다 0 이거나 세로 다 0 이거나 
				//04 13 22 31 40
				//00 11 22 33 44 일 경우 
				// 빙고 
				// 빙고가 3 줄 되면  num 출력 
				
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
				
				
				
				
				
			//샜던 거 또 새게 되는 게 문제..........	샌거가 3개 이하면 0으로 초기화하는것으로 해결!
				
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
				
				if(bingoCount<3){bingoCount=0;} // 숫자 지우고 셌을 떄 빙고 안되면 빙고 개수 초기화  
					
			}
			
			if(bingoCount>=3){break;}
		}
		
		
		
		
		
		System.out.println(num);
		
		
		
		
		
		scanner.close();
		
		
	}
}
