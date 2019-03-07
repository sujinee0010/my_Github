package p1;

import java.util.*;

public class findAlpa {



	public static void main(String []args) {
		
	Scanner scanner = new Scanner(System.in);
	
	
	String word = scanner.next();// 단어 입력 받기
	// 알파벳 배열 97~122 생성
	int al []= new int [26];
	
	for(int i=0, j='a' ;i<al.length;i++,j++) {
		
		al[i]=j;
		
	}
	
	// 출력 배열생성
	int result[]= new int[26];
	for(int i=0;i<result.length;i++) {result[i]=-1;}
	
	// 입력받은 string 인덱스 0~ 끝 까지 알파벳 배열과 비교 후  결과값 배열에 해당 인덱스 번호 저장 
	for(int i=0; i<al.length;i++) {
		for(int j=0; j<word.length();j++) { 
			if(al[i]==word.charAt(j))
			{		
				result[i]=j;
				break;
			}
			
		}
		}
	
	// 출력
	for(int i= 0; i<result.length;i++)
	System.out.print(result[i]);
	
	
	
	scanner.close();
	}
}
