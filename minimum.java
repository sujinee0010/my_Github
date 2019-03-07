package p1;

import java.util.*;

public class minimum {
	public static void main(String []args) {
		
	Scanner scanner = new Scanner(System.in); 	
		
	int num = scanner.nextInt(); // 배열 개수 입력
	
	// A 배열 만들기
	int A []= new int [num];    
	
	// AA 배열 만들기
	int AA []= new int [num]; // 큰 순서대로 정렬한 배열
	
	// B 배열 만들기 
	int B []= new int [num];
	
	// BB 배열 만들기 
	int BB []= new int [num]; // B 
	 
	
	for(int i =0; i<num;i++) {
		
		A[i]= scanner.nextInt(); /// 11160 ->11016
	}                             // 61110
	
	for(int i =0; i<num;i++) {
		
		B[i]= scanner.nextInt(); //27831  
	}
	
	
	for(int i =0; i<BB.length;i++)
		BB[i]=B[i]; // B배열 복사 
	
	
	
	//A를 큰 순서대로 재정렬한 배열 AA ->61110
	
	
	
	for(int j=0; j<num;j++) {
	// a 배열 정렬
	int temp=0;
	// 인엑스 번호 기록
	int index =0;
	//제일 큰거를 0 인덱스에 
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
		
	
	} // 이거 돌리 면 제일 큰수 나옴 
	
		AA[j]=temp ;    // 가장 큰 수를  첫번째인덱스에 넣음 
		A[index]=-1; //  젤큰거 -1로 초기화 해줌 
	
	}
	
	
	/// 11160 ->11016
	
	
	// AA 는 61110 상태 
		
	
	
	
	
	// B 인덱스의 가장 큰 수의 인덱스 번호를 알아내고 그 인덱스 위치와 동일하게 A배열을 정렬 
	

	for(int j=0; j<num;j++) {
	// BB 배열 정렬
	int temp=0;
	// 인엑스 번호 기록
	int index =0;
	//제일 큰거를 끝 인덱스에 
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
		
	
	} // 이거 돌리 면 제일 큰수 나옴 
	
		A[index]=AA[num-1-j] ;    // AA의 가장 큰수[마지막 인텍스]를 BB 배열 중 가장 큰 수가 있는 인덱스 번호 와 같은 번호에 A배열에 넣어줌  
		BB[index]=-1; //  젤큰거 -1로 초기화 해줌 
		
	}
	
	
// A는 정렬 됨. B는 그대로 
	

	int S =0; // A 배열 B 배열 값 곱한거  저장 
	
	for(int i=0; i<num ;i++)
	{
		
		S+= A[i]* B[i];
		
	}
	
	

	
	System.out.println(S);
	
	scanner.close();
	
	}
	
	
	
	
}
