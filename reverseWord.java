package p1;
//한 개의 단어를 입력받아서 거꾸로 뒤집어 출력하는 작업을 반복하다가 "END"라고 입력이 되면 종료하는 프로그램을 작성하시오.
//입력받는 단어의 길이는 20이하이다.
import java.util.Scanner;

public class reverseWord {

	
	public static void main(String []args) {
		
		
		Scanner scanner = new Scanner(System.in);
		String word= new String(); // 단어
		
		String temp[]= new String[100];// 입력 받은 단어 배열에 넣기 
		
		int num=0; // 입력 받은 단어 개수 
		
		
		for(int i=0; i<100;i++) {
		 
		word = scanner.next();// 단어 입력 
		//END 입력시 입력 멈춤	
		if(word.equals("END"))break; //if(word=="END")break;-> 틀림 == 연산자는 레퍼런스 를 비교 , 내용 비교 아님
		 
		temp[i]= word; //입력받은 단어 배열에 넣기  
		
		num+=1; // 입력받은 단어 개수 
		 
		}
		
	//// 배열 크기 게충격
		
		
		
		
		for(int i=0; i<num;i++) {
			for(int j=temp[i].length()-1;j>=0;j--) { // 입력받은 단어들을 거꾸로 출력 
				
				
				System.out.print(temp[i].charAt(j));
				
		}
			System.out.print('\n');
		}
		
		
		scanner.close();
	}
	
	
	
	
	
}