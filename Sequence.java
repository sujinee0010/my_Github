package p1;
import java.util.*;
public class  Sequence {

	

	public static void main(String []args)
	{
		
		Scanner scanner = new Scanner(System.in);
		
//정방향1 -> 역방향2 -> 정방향3 ->역방향4 ->...		
//정방향//1 1 2 4 7 12 21 37	
//역방향 // 1 2 3 5 9 16 28
//   
//
// 일단 1번 2번 3번을  1로 설정 .....
//
// 4번은 1번과 2 번을 합함
// 5번은 2 번과 3번을 합함
// 6번은 3번과 4번을 합함
//7번은 4번과 5번을 합함 
//8번은 (아마) 5번과 6번의 합
//9버은 6번과 7번  
		
		
		//케이스넘버 입력받기 
		
		int caseNum = scanner.nextInt();
		
		// int 로 하면 오류 주의!
		long nums[]= new long[100]; // 변 길이  배열
		long result[]= new long[caseNum];// 결과 출력 배열 
		
		// 1번 ~3번쨰 삼각형 변의 길이 1로 설정 
		nums[0]=1; 
		nums[1]=1;
		nums[2]=1;
	
		
		//삼각형 변 길이 계산 
		for(int i=3,j=0; i<100;i++,j++) {
			
			nums[i]=nums[j]+nums[j+1];
			//4번쨰 변 길이  = 1번 째 +2번 째
			//5번째 변 길이  = 2번 쨰 +3번 쨰 
			
		}
		
		
		for(int i=0;i<caseNum;i++) {
			
			int num = scanner.nextInt();// 몇번 째 수 입력 받기 
			result[i]=nums[num-1];// 해당 순서 변 길이  결과 출력 배열에 저장 
			
			
		}

		// 결과 출력
		for(int i=0;i<result.length;i++) {
			
			System.out.println(result[i]);
		}
	
		scanner.close();
	}

	
	}

