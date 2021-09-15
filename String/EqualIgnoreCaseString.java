package String;

public class EqualIgnoreCaseString {
	public static void main(String args[]){  
		String s1="python";  
		String s2="python";  
		String s3="PYTHON";  
		String s4="java";  
		System.out.println(s1.equalsIgnoreCase(s2));//true because content and case both are same  
		System.out.println(s1.equalsIgnoreCase(s3));//true because case is ignored  
		System.out.println(s1.equalsIgnoreCase(s4));//false because content is not same  
		}
}