
import java.io.IOException;
import java.sql.*;
//For compiling on the shell on repl: Same on mac
//javac -cp sqlite-jdbc-3.23.1.jar: Main.java

//Use for windows
//javac -cp sqlite-jdbc-3.23.1.jar; ServerExample.java
class Main {

 public static void main(String[] args)throws IOException{
    (new Main()).init();
  }

  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init() {
   

    String queryResult="";
    String sql ="";

		Database db = new Database("jdbc:sqlite:" );	
    
    sql="Select StudentID From Students" +
        "Update Students" +
        "Set Room = 122, Period = 3" +
        "Where StudentID = 'STUDENT1001' And Period = '3';" ;
    queryResult = db.runSQL(sql, "table-auto");
    print(queryResult);
     
      }    
}