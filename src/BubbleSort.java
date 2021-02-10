import java.util.Scanner;

public class BubbleSort {
	
	void Sort(int arr[], int n){
        for (int i = 0; i < n-1; i++){
            for (int j = 0; j < n-i-1; j++){
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
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
		
		BubbleSort bs = new BubbleSort();
		bs.Sort(arr, n);
		
		
		System.out.println("Sorted Array: ");    
		for (int i=0; i<n; i++){
			System.out.print(arr[i] + " ");  
		}

	}

}