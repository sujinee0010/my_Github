
import java.util.*;
public class MergeSort {
	
	
	// �պ� ���� 
	static void  mergeSort(int low, int high, int arr[]) {
		
		
		int mid; 
		
		// �迭 ���� ��� 
		System.out.print("����:");
		for(int i=low;i<=high;i++) {
			
			System.out.print(arr[i]+" ");
		}
		System.out.println("");
		
		
		
		if(low<high) {
			
		mid= (low+high)/2;
		mergeSort(low,mid,arr); // mid���� ���� �迭 ���� 
		mergeSort(mid+1,high,arr); //mid ���� ������ �迭 ����  
		
		merge(low,mid,high,arr); // ���� �� �迭 ���� 
		}
	}
	
	// �պ� �Լ� 
	static void merge(int low, int mid, int high,  int arr[] ) {
		
	int s[]= new int[arr.length]; // ��� �迭 ���� 
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
		
		// ���� �迭������ ���� ���� �� ������ �迭 ��� �迭�� ���� 
		if (i>mid) {
			
			//j���� high���� ���� 
			for(int t =j;t<=high;t++)
			{s[k++]=arr[t];}
			}
		

		// ������ �迭������ ���� ���� �� ���� �迭 ��� �迭�� ���� 
		else  {
		
			
			for(int t=i;t<=mid;t++) {
				s[k++]=arr[t];
				}
		}
		
		
		// ���ĵ� �迭 ���� �迭�� ���� 
		
		for(int t=low;t<=high;t++) {
			
			arr[t]=s[t];
			
		}
		
		// �պ� �� �迭 ��� 
		System.out.print("�պ�:");
		for(int t=low;t<=high;t++) {
		
			System.out.print(arr[t]+" ");
			
		}
		System.out.println("");
		
	}
	
	
	//27 10 12 20 25 13 15 22
	
	
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		
	
	// �迭ũ�� �Է¹ޱ� 
	System.out.print("�Է��� �迭�� ũ�⸦ �Է��ϼ���");
	int size = scanner.nextInt();
	
	// ũ�� ��ŭ �迭 ���� 
	int S[]= new int [size];
	
	
	// �迭 �Է¹ޱ� 
	System.out.print("�迭 ���Ҹ� �Է��ϼ���");
	for(int i=0; i<S.length;i++) {
		
		S[i]= scanner.nextInt();
	}
	
	// �迭 �պ�����
	mergeSort(0,S.length-1,S);
	
	// �迭 ��� 
	System.out.println("���ĵ� �迭�� ����մϴ�");
	
	for(int i=0;i<size;i++) {
		
		System.out.print(S[i]+" ");
	}
	
	
		scanner.close();
	}
}
