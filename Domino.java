import java.util.*;

public class Domino{
public static void main(String args[]){
  Scanner scanner = new Scanner(System.in);

//  첫 번째 줄에는 도미노의 개수 N(1≤N≤40)이 입력된다.
//  그 다음 줄부터 N+1개의 줄에는 도미노에 적힌 2개의 숫자가 입력된다.
//  도미노에 적힌 숫자는 0 이상 9 이하이다.
 


int count= scanner.nextInt(); //N개 입력

int nums[]= new int[count];//숫자 합 배열
int result[]= new int[count];// 계산 결과 출력 배열
int sort[]= new int[count];// 정렬한 배열

for(int i =0; i<nums.length;i++)
{
    int num1= scanner.nextInt();
    int num2= scanner.nextInt();
    int sum = num1 +num2;

  nums[i]=sum;
}// 숫자 두개 입력받고 nums에 합저장 




int temp=0; // 가장 큰 수 
int c=0; // 큰 수의 인덱스
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
sort[j]= temp; // 가장 큰 수  sort배열 0 인데스 부터 저장 

nums[c]=-1;// 다음으로 큰 수 구하기위해 -1 로 초기화 

 

}

//sort에큰순서대로 정렬해놓음

// sort 맨마지막 인덱스부터 계산 (작은값부터 계산)하고 result에 마지막부터 넣기
for(int i=count-1;i>=0;i--){
  if(sort[i]>=10){ // 두자리수일때 
	if(i!=0){
	result[i]+=sort[i]-10; //뒷자리수 해당 인덱스 저장
	result[i-1]+=1; // 십의자리수는 다음 인덱스 저장
	}
	else{
	result[i]+=sort[i];// 인덱스 0 번 일때는 그냥 저장 
	}
    }
 else// 한자리수면 
{result[i]+=sort[i];} // 해당인덱스에 그냥 저장 
  
  
}




// 다 0 일땐 0
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

