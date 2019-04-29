
import java.util.*;
public class MergeSort {
	
	
	// 합병 정렬 
	static void  mergeSort(int low, int high, int arr[]) {
		
		
		int mid; 
		
		// 배열 분할 출력 
		System.out.print("분할:");
		for(int i=low;i<=high;i++) {
			
			System.out.print(arr[i]+" ");
		}
		System.out.println("");
		
		
		
		if(low<high) {
			
		mid= (low+high)/2;
		mergeSort(low,mid,arr); // mid기준 왼쪽 배열 분할 
		mergeSort(mid+1,high,arr); //mid 기준 오른쪽 배열 분할  
		
		merge(low,mid,high,arr); // 분할 된 배열 정렬 
		}
	}
	
	// 합병 함수 
	static void merge(int low, int mid, int high,  int arr[] ) {
		
	int s[]= new int[arr.length]; // 결과 배열 생성 
		int i=low,j=mid+1,k=low;
		while((i<=mid)&&(j<=high))
		{
			if(arr[i]<arr[j]) {
				s[k]=arr[i];
				i++;
			}
			else {
				s[k]=arr[j];
				j++;}
			k++;
		}
		
		// 왼쪽 배열순으로 정렬 됬을 때 오른쪽 배열 결과 배열에 복사 
		if (i>mid) {
			
			//j부터 high까지 복사 
			for(int t =j;t<=high;t++)
			{s[k++]=arr[t];}
			}
		

		// 오른쪽 배열순으로 정렬 됬을 때 왼쪽 배열 결과 배열에 복사 
		else  {
		
			
			for(int t=i;t<=mid;t++) {
				s[k++]=arr[t];
				}
		}
		
		
		// 정렬된 배열 원래 배열에 복사 
		
		for(int t=low;t<=high;t++) {
			
			arr[t]=s[t];
			
		}
		
		// 합병 된 배열 출력 
		System.out.print("합병:");
		for(int t=low;t<=high;t++) {
		
			System.out.print(arr[t]+" ");
			
		}
		System.out.println("");
		
	}
	
	
	//27 10 12 20 25 13 15 22
	
	
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		
	
	// 배열크기 입력받기 
	System.out.print("입력학 배열의 크기를 입력하세요");
	int size = scanner.nextInt();
	
	// 크기 만큼 배열 생성 
	int S[]= new int [size];
	
	
	// 배열 입력받기 
	System.out.print("배열 원소를 입력하세요");
	for(int i=0; i<S.length;i++) {
		
		S[i]= scanner.nextInt();
	}
	
	// 배열 합병정렬
	mergeSort(0,S.length-1,S);
	
	// 배열 출력 
	System.out.println("졍렬된 배열을 출력합니다");
	
	for(int i=0;i<size;i++) {
		
		System.out.print(S[i]+" ");
	}
	
	
		scanner.close();
	}
}
