package sample;

public class ArraySort {
	public static void main(String[] args) {
		int arr[]= {50,30,60,80,10,30};
		//Arrays.sort(arr);
		for (int i = 0; i < arr.length - 1; i++)
            for (int j = 0; j < arr.length - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
			
			
		for (int j = 0; j < arr.length; j++) {
			System.out.println(arr[j]);
		}
	}
}
