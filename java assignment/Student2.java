package javademo;

class StudentRec{
	String name;
	int rollNum;
	String mobileNum;
	String address;
	void studentDetails(String name,int rollNum,String mobileNum,String address) {
		name=name;
		rollNum=rollNum;
		mobileNum=mobileNum;
		address=address;
		System.out.println("Name : "+name+"\nRoll number : "+rollNum+"\nMobile Number : "+mobileNum+"\nAddress : "+address+"\n");
	}
	
}
public class Student2 {
	public static void main(String args[]) {
		//Creating object for student sam
		StudentRec studentRec=new StudentRec();
		studentRec.studentDetails("Sam",1,"7376748373","VENICE");
		
		StudentRec studentRec1=new StudentRec();
		studentRec1.studentDetails("John",2,"837464638","LA");
	}

}