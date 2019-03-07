package p1;

import java.util.*;

public class editWord {

	
	public static void main(String []args) {
		
		Scanner scanner = new Scanner(System.in);
		
		// 18 
			
			int num= scanner.nextInt();// 고쳐야 할 문자 수 입력 받기 
			String old []= new String[num]; // 기존 문자열 
			String newest[] = new String[num]; // 수정 문자열
			
			for (int i = 0; i<num; i++) {
				
				
				old[i]=scanner.next(); // a(기존 )  A(바꿀꺼)
				newest[i]=scanner.next();
			
				
			}
			
			

			int Snum= scanner.nextInt();// 문자열 총 개수 입력 
			
			String c[]= new String [Snum];//  문자열 
		
			for (int i=0; i <Snum;i++) {
				
				c[i]= scanner.next(); // 문자열 입력  배열 크기  Snum 크기 하나에 한문자씩 들어있음 
				
				
			}
		
			for (int i =0 ; i < Snum;i++) {
				for (int j =0; j<num;j++) {
					if(c[i].equals(old[j]))
						{c[i]= newest[j];
								break;};
			
			
				}
				
				
				
				  System.out.print(c[i]);
			}
		
			
		
		
		
		scanner.close();
	}
	
	
	// 궁금증 
	// 숫자 입력도 문자열 처리
	// 대소문자
	//nextLine
	
	
}
