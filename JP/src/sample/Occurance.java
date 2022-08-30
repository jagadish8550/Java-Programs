package sample;

public class Occurance {
	public static void main(String[] args) {
		/*Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		sc.close();
		for (int i = 0; i < s.length(); i++) {
			int occurance=1;
			for (int j = 0; j < s.length(); j++) {
				if(s.charAt(i)==s.charAt(j)) {
					occurance++;
				}
			}
			
		}*/
		/* String str;  
		int i, len;  
		int counter[] = new int[256];  
		Scanner scanner = new Scanner(System.in);  
		System.out.print("Please enter a string: ");  
		//reading a string from the user  
		str = scanner.nextLine();  
		scanner.close();
		//finds the length of the string  
		len = str.length();  
		// loop through the string and count frequency of every character and store it in counter array  
		for (i = 0; i < len; i++)   
		{  
		counter[(int) str.charAt(i)]++;  
		}  
		//print Frequency of characters  
		for (i = 0; i < 256; i++)   
		{  
		if (counter[i] != 0)   
		{  
		//prints frequency of characters      
		System.out.println((char) i + " has occured " + counter[i]+" times");  
		}  
		}  */
		
		String s="karnataka";
		int a[]=new int[256];
		for(int i=0;i<s.length();i++) {
			a[(int)s.charAt(i)]++;
		}
		for(int i=0;i<a.length;i++) {
			if(a[i]!=0)
			System.out.println((char)i+"-->"+ a[i]+" times");
		}
	}
}
