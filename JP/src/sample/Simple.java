package sample;

public class Simple {
	public static void main(String args[] ) {
        int noOfElements=5;
        int n1=2;
        int[] n= {1,2,3,4,5};
        int index=noOfElements-n1;
        String s1="";
        for(int i=0;i<n.length;i++){
            s1=s1+n[i];
        }
        String s2=s1.substring(index);
        s2 =s2+s1.substring(0,index);
        String s3="";
        for(int i=0;i<s2.length();i++) {
        	s3=s3+s2.charAt(i)+" ";
        }
        System.out.println(s3);
	}
}
