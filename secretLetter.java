package p1;

import java. util.*;
public class secretLetter {
	
	
	public static void main(String []args) {
	Scanner scanner = new Scanner (System.in);
	
	int charnum= scanner.nextInt();// 몇글자 출력할지 입력 
	String code= scanner.next();//    0,1 로 된 비밀코드 입력 받기
	String result[]= new String [charnum];// 결과 글자 배열 
	int wrongIndex=0; // 틀린 코드 위치 나타내는 변수 

	//	a b c d e f g h 를  string al  배열이 넣음 
	String al[] = {"000000", "001111","010011","011100","100110","101001","110101","111010"};
	
		
	for(int i=0,j=0;i<code.length() ;i+=6,j++) {
	// 비밀 코드 6개씩 잘라서 비교하기 	
	char temp[]= {code.charAt(i),code.charAt(i+1),code.charAt(i+2),code.charAt(i+3),code.charAt(i+4),code.charAt(i+5)};	
	// 6개의 문자 배열로 만들어서 
	String s= new String(temp);
	// 스트링으로 만든 후 비교	
		
	// 스트링s와 al 배열의 A~H까지 하나씩 비교
	// 틀린숫자가 0 이거나 1 이면 인식 가능 코드 이므로  A~H 중 하나로 지정 
	// 모든 틀린 숫자개수가 1개 이상이면  없는 코드 이므로 해당 위치 저장하고 반복문 나감
	
		 for(int m=0; m<al.length; m++) { // 배열의 0~끝 까지 (A~H)까지 비교 
			 int count=0; // 틀린 숫자 검색하는 변수 
			 for(int h=0;h<s.length();h++) { // 숫자 하나씩 비교 
				
				 if( s.charAt(h)!=al[m].charAt(h)) // 틀릴 경우  
				 	{count+=1;} // 틀린 숫자 개수 증가 
				
				}
			 
			if(count<=1) { // 틀린 숫자 개수가 0 이거나 1 이면 
				if(m==0){result[j]="A";}
				else if(m==1){result[j]="B";}	// 해당 알파벳 지정 
				else if(m==2){result[j]="C";}
				else if(m==3){result[j]="D";}
				else if(m==4){result[j]="E";}
				else if(m==5){result[j]="F";}
				else if(m==6){result[j]="G";}
				else if(m==7){result[j]="H";}
				break; // 나가서 다음 분할 코드 탐색
			}
			
			else if(count>1) { // a.. h 다 비교 해봤는데 다 1 이상 이면 
				if(m==al.length-1) { wrongIndex=j+1;break; } // 없는 코드이므로 틀린 글자 위치 저장하고  반복문 나감
			
			}
		 
		}	
		
	 if(wrongIndex!=0)break; // 틀린 코드 있으면 반복문 나감 
		 
	}
		 
	
	
	if(wrongIndex!=0) // 틀린 코드 있을 시 
		System.out.print(wrongIndex); // 해당 위치 출력
	
	else{// 코드 다 해석 했을 떄 
		
		for(int i=0;i<result.length;i++) // 결과 글자 출력 
			{System.out.print(result[i]);}
	}
	
	scanner.close ();
	
	
	
	}
}
