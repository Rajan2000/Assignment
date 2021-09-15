package String;

public class EqualString {
	public static void main(String args[]){  
		String s1="Rajan";  
		String s2="Rajan";  
		String s3="RAJAN";  
		String s4="Sid";  
		System.out.println(s1.equals(s2));//true because content and case is same  
		System.out.println(s1.equals(s3));//false because case is not same  
		System.out.println(s1.equals(s4));//false because content is not same  
		}}  
