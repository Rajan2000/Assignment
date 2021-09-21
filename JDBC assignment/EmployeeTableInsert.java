package JdbcAssignment;
 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
 
public class EmployeeTableInsert {
    public static void main(String args[]) {
        Connection connection= null;
        final String username="sa";
        final String password="";
        final String jdbcurl="jdbc:h2:~/test";
        String selectsql="";
        try {
            Class.forName("org.h2.Driver");
            connection= DriverManager.getConnection(jdbcurl,username,password);
            Statement statement=connection.createStatement();

            //String insert="INSERT INTO dept VALUES(112,'it','gurugram')";

            //String sql1="CREATE TABLE emp"+ "(empno INTEGER,"+"ename varchar(255),"+ "job varchar(255),"+"mgr INTEGER,"
                    //+"hiredate date,"+"sal INTEGER,"+"comm INTEGER,"+"deptno INTEGER,"+"constraint pk_emp primary key (empno),"
                            //+"constraint fk_deptno foreign key (deptno) references dept (deptno))";*/


            String insert1="INSERT INTO emp VALUES(1874,'Sumitesh','developer',7342,'2020-06-25',1500,40,112)";
            statement.executeUpdate(insert1);
            System.out.println("insert complete..");

        }
        catch(Exception e) {
            e.printStackTrace();
        }
 

}
}