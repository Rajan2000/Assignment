package javademo;



public class Constructor {
	Constructor(){
		System.out.println("Students marks");//0-argument constructor
	}
	Constructor(String name,int rollno){
		System.out.println("Student name :"+ name + " Student rollno : "+ rollno);//parameterized constructor
	}
	Constructor(int ml,int java,int cloud){
		System.out.println("Total marks "+ (ml+java+cloud) );//constructor overloading
	}
	public static void main(String ar[]) {
		Constructor student = new Constructor();
		Constructor student_name_and_rollno = new Constructor("Rajan",158);
		Constructor student_total_marks = new Constructor(55,89,98);
	}

}
