package sample;

public class CountOfOddAndEven {
	public static void main(String[] args) {
		int oddCount=0;
		int evenCount=0;
		for(int i=1;i<71;i++) {
			if(i%2==0) {
				evenCount++;
			}
			else
				oddCount++;
		}
		System.out.println(oddCount);
		System.out.println(evenCount);
	}
}
