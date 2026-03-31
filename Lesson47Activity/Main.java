import com.sun.net.httpserver.HttpContext;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;
import java.io.IOException;
import java.sql.*;

import java.net.InetSocketAddress;
import java.util.Map;

//For compiling on the shell on repl: Same on mac
//javac -cp sqlite-jdbc-3.23.1.jar: Main.java
//java -cp sqlite-jdbc-3.23.1.jar: Main

//Use for windows
//javac -cp sqlite-jdbc-3.23.1.jar; Main.java
class Main {

 public static void main(String[] args)throws IOException{
    (new Main()).init();
  }


  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init() throws IOException{
   

    // create a port - our Gateway
    int port = 8500;
      
    //create the HTTPserver object
    HttpServer server = HttpServer.create(new InetSocketAddress(port),0);

    // create the database object
    Database db = new Database("jdbc:sqlite:chinook.db");
    String customers = "Select * From customers";
    String employees = "Select * From employees";
    String albumsinfo = "Select * From tracks";
    albumsinfo += "Inner Join albums On tracks.AlbumId = albums.AlbumId";
    albumsinfo += "Limit 10";
    String customersongs = "Select customer.FirstName , customer.LastName , invoices.InvoiceDate , tracks.Name From tracks";
    customersongs += "Inner Join invoice_items On tracks.UnitPrice = invoice_items.UnitPrice";
    customersongs += "Inner Join invoices On invoices.InvoiceId = invoice_items.InvoiceId";
    customersongs += "Inner Join customers On customers.CustomerId = invoices.CustomerId";
    customersongs += "Limit 10";

    server.createContext("/", new RouteHandler("You are connected, but route not given or incorrect...."));
    server.createContext("/employees", new RouteHandler(db, employees));
    server.createContext("/customers", new RouteHandler(db , customers));
    server.createContext("/albumsinfo", new RouteHandler(db, albumsinfo));
    server.createContext("/customersongs", new RouteHandler(db , customersongs));

   // Add your  code here
  

    //Start the server
    server.start();

    System.out.println("Server is listening on port "+port);
       
      
    }    
}


