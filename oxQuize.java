package p1;

import java.util.*;
public class oxQuize {

	public static void main (String []args) {
		Scanner scanner = new Scanner (System.in);
		
		
	int num = scanner.nextInt();// 몇개 케이스 입력 할건지 
	int result []= new int [num];// 합산 결과 출력 배열 
	
	
	for(int i=0 ; i<num;i++) // 총 케이스 수만큼 도는 것
	{	
		result[i]=0;
		int Onum =0; // O 계산 
		String cases  = scanner.next(); // 케이스 입력 받기 OOXXOXXOOO
		
		for(int j =0;j<cases.length();j++) { // 케이스 스트링 길이 만큼 인덱스 순차적 접근
			
			if(cases.charAt(j)=='O')
				{
				
				Onum++; // O 일경우 숫자 증가 
				result[i]+=Onum; // 결과 계산
				
				}
			else
				{
				Onum=0; //X 일경우  0으로 설정 
				result[i]+=Onum;
				}
		}
		
		
		
	
	}
	
	
	for(int i =0;i<result.length;i++)
		System.out.println(result[i]);
	// 각 체이스 입력
		
		
		
		
		
		
		
		scanner.close();
	}
}
