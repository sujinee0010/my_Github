package p1;

import java. util.*;
public class secretLetter {
	
	
	public static void main(String []args) {
	Scanner scanner = new Scanner (System.in);
	
	int charnum= scanner.nextInt();// ����� ������� �Է� 
	String code= scanner.next();//    0,1 �� �� ����ڵ� �Է� �ޱ�
	String result[]= new String [charnum];// ��� ���� �迭 
	int wrongIndex=0; // Ʋ�� �ڵ� ��ġ ��Ÿ���� ���� 

	//	a b c d e f g h ��  string al  �迭�� ���� 
	String al[] = {"000000", "001111","010011","011100","100110","101001","110101","111010"};
	
		
	for(int i=0,j=0;i<code.length() ;i+=6,j++) {
	// ��� �ڵ� 6���� �߶� ���ϱ� 	
	char temp[]= {code.charAt(i),code.charAt(i+1),code.charAt(i+2),code.charAt(i+3),code.charAt(i+4),code.charAt(i+5)};	
	// 6���� ���� �迭�� ���� 
	String s= new String(temp);
	// ��Ʈ������ ���� �� ��	
		
	// ��Ʈ��s�� al �迭�� A~H���� �ϳ��� ��
	// Ʋ�����ڰ� 0 �̰ų� 1 �̸� �ν� ���� �ڵ� �̹Ƿ�  A~H �� �ϳ��� ���� 
	// ��� Ʋ�� ���ڰ����� 1�� �̻��̸�  ���� �ڵ� �̹Ƿ� �ش� ��ġ �����ϰ� �ݺ��� ����
	
		 for(int m=0; m<al.length; m++) { // �迭�� 0~�� ���� (A~H)���� �� 
			 int count=0; // Ʋ�� ���� �˻��ϴ� ���� 
			 for(int h=0;h<s.length();h++) { // ���� �ϳ��� �� 
				
				 if( s.charAt(h)!=al[m].charAt(h)) // Ʋ�� ���  
				 	{count+=1;} // Ʋ�� ���� ���� ���� 
				
				}
			 
			if(count<=1) { // Ʋ�� ���� ������ 0 �̰ų� 1 �̸� 
				if(m==0){result[j]="A";}
				else if(m==1){result[j]="B";}	// �ش� ���ĺ� ���� 
				else if(m==2){result[j]="C";}
				else if(m==3){result[j]="D";}
				else if(m==4){result[j]="E";}
				else if(m==5){result[j]="F";}
				else if(m==6){result[j]="G";}
				else if(m==7){result[j]="H";}
				break; // ������ ���� ���� �ڵ� Ž��
			}
			
			else if(count>1) { // a.. h �� �� �غôµ� �� 1 �̻� �̸� 
				if(m==al.length-1) { wrongIndex=j+1;break; } // ���� �ڵ��̹Ƿ� Ʋ�� ���� ��ġ �����ϰ�  �ݺ��� ����
			
			}
		 
		}	
		
	 if(wrongIndex!=0)break; // Ʋ�� �ڵ� ������ �ݺ��� ���� 
		 
	}
		 
	
	
	if(wrongIndex!=0) // Ʋ�� �ڵ� ���� �� 
		System.out.print(wrongIndex); // �ش� ��ġ ���
	
	else{// �ڵ� �� �ؼ� ���� �� 
		
		for(int i=0;i<result.length;i++) // ��� ���� ��� 
			{System.out.print(result[i]);}
	}
	
	scanner.close ();
	
	
	
	}
}
