package p1;
//�� ���� �ܾ �Է¹޾Ƽ� �Ųٷ� ������ ����ϴ� �۾��� �ݺ��ϴٰ� "END"��� �Է��� �Ǹ� �����ϴ� ���α׷��� �ۼ��Ͻÿ�.
//�Է¹޴� �ܾ��� ���̴� 20�����̴�.
import java.util.Scanner;

public class reverseWord {

	
	public static void main(String []args) {
		
		
		Scanner scanner = new Scanner(System.in);
		String word= new String(); // �ܾ�
		
		String temp[]= new String[100];// �Է� ���� �ܾ� �迭�� �ֱ� 
		
		int num=0; // �Է� ���� �ܾ� ���� 
		
		
		for(int i=0; i<100;i++) {
		 
		word = scanner.next();// �ܾ� �Է� 
		//END �Է½� �Է� ����	
		if(word.equals("END"))break; //if(word=="END")break;-> Ʋ�� == �����ڴ� ���۷��� �� �� , ���� �� �ƴ�
		 
		temp[i]= word; //�Է¹��� �ܾ� �迭�� �ֱ�  
		
		num+=1; // �Է¹��� �ܾ� ���� 
		 
		}
		
	//// �迭 ũ�� �����
		
		
		
		
		for(int i=0; i<num;i++) {
			for(int j=temp[i].length()-1;j>=0;j--) { // �Է¹��� �ܾ���� �Ųٷ� ��� 
				
				
				System.out.print(temp[i].charAt(j));
				
		}
			System.out.print('\n');
		}
		
		
		scanner.close();
	}
	
	
	
	
	
}