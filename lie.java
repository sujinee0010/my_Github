package p1;

import java.util.*;
public class lie {
	
	public static void main(String []args) {
	
	Scanner scanner = new Scanner(System.in);
	int n = scanner.nextInt(); // 파티에 참석하는 모든 사람의 수 
	int m = scanner.nextInt(); // 모든 파티의 수 
	int result=0;// 거짓말 할 수 있는 파티의 수 = 출력 값
	
	
	int truenum = scanner.nextInt(); // 진실을 아는 사람의 수 

	 
	int truepnum[]= new int[truenum]; // 진실을 아는 사람의 번호들을 입력 받고  배열에 저장
	
	if(truenum<=n) {
	for (int i= 0; i<truepnum.length;i++)
		 truepnum[i]= scanner.nextInt(); 

	
//	열리는 파티 m 개 만큼 입력 받기 
    for(int i =0; i<m;i++) {  
    	
    	int num =scanner.nextInt(); // 몇명오는지 입력 
    	
    	int pnum[]=new int[num]; // 오는 사람들 번호 저장할 배열 생성
    	
    	for(int j=0;j<num;j++) //
    	{	pnum[j]= scanner.nextInt(); 
    		
    	}
    	
    	
    	int trueman=0;// 거짓을 못말하는 파티인지 알아낼 수 있는 변수  
    	
    	// 그 파티에 오는 사람 번호와 진실을 아는 사람의 번호가 같으면  진실을 못말하는 파티 
    	for(int j=0;j<num;j++) { // (파티 참석 번호 )
    		for(int h=0;h<truenum;h++ ) { // (진실 아는 사람 번호 )
    			if( pnum[j]==truepnum[h]) {// 번호가 같으면 (파티에 진실 아는 사람 있으면)
    							
    				trueman+=1; // 변수 +1 하고 
    				break;  //반복문 나감
    				
    			}
    		
    		
    		}
    		if(trueman==1)break; // 이미 파티에 3 번이 포함되있기 때문에
    								//어떤 번호가 남아  있든 일단 거짓말 못치는 파티니까 반복문 나감
    		}
    	
    	
    	   	if(trueman==0) // 변수 변화 없을 때, 즉 참석하는 사람 번호 중에 진실 아는 사람이 없다면 
    	   	  {result+=1;} 	// 거짓을 말할수 있는 파티 
 
    }
    
	}
    	System.out.print(result);// 총 거짓을 말할 수 있는 파티 출력
    	scanner.close();
	
	}
	
	
}
