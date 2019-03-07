package p1;

import java.util.*;
public class scoreAverage {

	
	public static void  main(String []args) {
		Scanner scanner = new Scanner(System.in);

		int result=0;// 결과값
		// 학생 점수 입력받기 
		int score[]= new int[5];
		
		for(int i= 0 ; i<5; i++)
		score[i]=scanner.nextInt();
		//40미만 40 점 처리 
		for(int i = 0; i<5; i++) {
		if (score[i]<40)
		{
		 score[i]=40;
		}
		
		}
			
		// 평균 점수 구하기 
		
		for(int i = 0 ;i<score.length;i++)
			result+=score[i];
		
		System.out.print(result/5);
		
		
	scanner.close();
	}
	
	
}
