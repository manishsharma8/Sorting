import java.util.Scanner;

public class newSort {
	
	void selectionSort(int arr[], int n){ 
        
        for (int i = 0; i < n-1; i++){
            int min_idx = i; 
            for (int j = i+1; j < n; j++) 
                if (arr[j] < arr[min_idx]) 
                    min_idx = j; 
 
            int temp = arr[min_idx]; 
            arr[min_idx] = arr[i]; 
            arr[i] = temp; 
        } 
    }

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of elements you want to store: ");  
		n=sc.nextInt();
		
		int[] arr = new int[n];
		System.out.println("Enter the elements of the array: ");  
		for(int i=0; i<n; i++){
			arr[i]=sc.nextInt();  
		}
		
		newSort ss = new newSort();
		ss.selectionSort(arr, n);
		
		
		System.out.println("Sorted Array: ");    
		for (int i=0; i<n; i++){
			System.out.print(arr[i] + " ");  
		}
	}

}
