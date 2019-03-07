package p1;

import java.util.*;
public class aptKing {

	
	public static void main(String []args) {
		Scanner scanner = new Scanner(System.in);
		
		
		int r[][]= new int [15][14]; // 아파트를 이차원 배열로  0층 ~ 14 층, 0호 (1호 )13 호(14호) 
		
		for(int i =0,j=1;i<14;i++,j++) // 0층 사람 설정 
			r[0][i]=j;
		
		for(int i =1;i<15;i++) {// 1층-14층 사람 설정 
			for(int j=0;j<14;j++)//0호-13 호 // 1층 1호 - 1층 2 호 // 0 층 1 2 호 // 합  3 
		{
			for(int m=0;m<=j;m++)
				r[i][j] += r[i-1][m];
			
		}	
		}
		
		
		int T = scanner.nextInt(); // 몇 개의 케이스  
		
		int result[]=new int [T]; // 결과 출력 배열
		
		int k=0;// 층
		int n=0;// 호
		
		for(int i=0;i<T;i++)
		{	
			k=scanner.nextInt(); // 층 입력
			n=scanner.nextInt(); // 호 입력
			
			result[i]=r[k][n-1]; // 결과 배열에 값 넣기, n-1 호인건 실제는 1에서 14호인데 배열에서 0에서 13 호여서  
			
		}
		
		for(int i =0; i<result.length;i++)
		System.out.println(result[i]);
		
		scanner.close();
	}
}
