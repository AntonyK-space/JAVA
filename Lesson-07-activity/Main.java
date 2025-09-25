
class Main {
	public static void main(String[] args) {
    	(new Main()).init();
	}

  void init(){
/*  
    Challenge 1:
    1) Create the variables, ask the user for the variable values, write the equation in file EQ1-act6 and display the equation value.
*/
  System.out.println("Input Variable x");
  int x = Input.readInt();
  double y = Math.pow( x , 7);
  System.out.println(y);

/*  
    Challenge 2:
    1) Create the variables, ask the user for the variable values, write the equation in fileEQ1.1-act6 and display the equation value.
*/
  System.out.println("Input Variable z");
  int z = Input.readInt();
  double q = Math.pow( z , 3) + 5.0;
  System.out.println(q);


/*  
    Challenge 3:
    Create the variables, ask the user for the variable values, write the equation in file EQ2-act6 and display the equation value..
    
*/
  System.out.println("Input Variables t and r");
  int t = Input.readInt();
  int r = Input.readInt();
  double s = Math.pow( t , 5) * Math.pow( r + 2 , 4);
  System.out.println(s);

 

/*  
    Challenge 4:
    Create the variables, ask the user for the variable values, write the equation in file EQ3-act6 and display the equation value..
    
*/
  System.out.println("Input Variables A and B");
  int A = Input.readInt();
  int B = Input.readInt();
  double C = Math.sqrt( A + B );
  System.out.println(C);


/*  
    Challenge 5:
    Create the variables, ask the user for the variable values, write the equation in file EQ4-act6 and display the equation value..
    
*/
  System.out.println("Input Variables x1, y1, x2, and y2");
  int x1 = Input.readInt();
  int x2 = Input.readInt();
  int y1 = Input.readInt();
  int y2 = Input.readInt();
  double d = Math.sqrt(Math.pow( x2 - x1, 2) + Math.pow( y2 - y1, 2));
  System.out.println(d);



/*  
    Challenge 6:
    Create the variables, ask the user for the variable values, write the equation g=sin(deg) and display the equation value..
    
*/
  System.out.println("Input Degrees");
  int deg = Input.readInt();
  double g = Math.sin(deg);
  System.out.println(g);




/*  
    Challenge 7:
    Create the variables, ask the user for the variable values, write the equation in file EQ5-act6 and display the equation value.
    
*/
  System.out.println("Input Variables n and m");
  int n = Input.readInt();
  int m = Input.readInt();
  double k = Math.pow( m , 5) / (Math.sqrt(n + 1));
  System.out.println(k);

/*  
    *** Bonus Challenge ***:
    Create the variables, ask the user for the variable values, write the equation in file Ch-act6 and display the equation value.

    HINT: What does the "plus minus: after "-b" mean.
*/
  System.out.println("Input Variables a, b, and c");
  int a = Input.readInt();
  int b = Input.readInt();
  int c = Input.readInt();
  double xx = ((-1 * b) + Math.sqrt(Math.pow( b , 2) - (4*a*c))) / (2*a);
  double xxx = ((-1 * b) - Math.sqrt(Math.pow( b , 2) - (4*a*c))) / (2*a);
  System.out.println(xx);
  System.out.println(xxx);




    // **************************************************
    // **** Don't write any code below here.  ***********
    // **************************************************
  }
}