import java.util.*;

public class Domino{
public static void main(String args[]){
  Scanner scanner = new Scanner(System.in);

//  ù ��° �ٿ��� ���̳��� ���� N(1��N��40)�� �Էµȴ�.
//  �� ���� �ٺ��� N+1���� �ٿ��� ���̳뿡 ���� 2���� ���ڰ� �Էµȴ�.
//  ���̳뿡 ���� ���ڴ� 0 �̻� 9 �����̴�.
 


int count= scanner.nextInt(); //N�� �Է�

int nums[]= new int[count];//���� �� �迭
int result[]= new int[count];// ��� ��� ��� �迭
int sort[]= new int[count];// ������ �迭

for(int i =0; i<nums.length;i++)
{
    int num1= scanner.nextInt();
    int num2= scanner.nextInt();
    int sum = num1 +num2;

  nums[i]=sum;
}// ���� �ΰ� �Է¹ް� nums�� ������ 




int temp=0; // ���� ū �� 
int c=0; // ū ���� �ε���
for(int j=0;j<nums.length;j++){
  for(int i=0;i<nums.length-1;i++){

    if(i==0){
    if(nums[0]<nums[1])
    { temp=nums[1];
    	c=1;
    }
    else 
    {temp=nums[0];
    c=0;
    }
  }
  
  else{  
  if(temp<nums[i+1])
    {temp=nums[i+1];
    c=i+1;}
  
  
    }
    }
sort[j]= temp; // ���� ū ��  sort�迭 0 �ε��� ���� ���� 

nums[c]=-1;// �������� ū �� ���ϱ����� -1 �� �ʱ�ȭ 

 

}

//sort��ū������� �����س���

// sort �Ǹ����� �ε������� ��� (���������� ���)�ϰ� result�� ���������� �ֱ�
for(int i=count-1;i>=0;i--){
  if(sort[i]>=10){ // ���ڸ����϶� 
	if(i!=0){
	result[i]+=sort[i]-10; //���ڸ��� �ش� �ε��� ����
	result[i-1]+=1; // �����ڸ����� ���� �ε��� ����
	}
	else{
	result[i]+=sort[i];// �ε��� 0 �� �϶��� �׳� ���� 
	}
    }
 else// ���ڸ����� 
{result[i]+=sort[i];} // �ش��ε����� �׳� ���� 
  
  
}




// �� 0 �϶� 0
int sum=0;
for(int i=0;i<result.length;i++) {
	sum+=result[i];
}


if(sum==0)System.out.print(0);

else{
for(int i=0;i<result.length;i++) {
System.out.print(result[i]);
	
}
}
 

scanner.close();

}
} 

