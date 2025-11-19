class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
   String[] friends = {"Barthomelew", "Daniel", "Thomas", "Micheal"};
   double[] tempc = {79.5, 39.7, 29.3, 29.8, 10};
   double[] tempf = celsiusToFarhenheit(tempc);
    for(int i = 0; i <= tempf.length; i++)
      System.out.println(tempf[i]);
  }

  

  double[] celsiusToFarhenheit(double[] c){
    double[] f = new double[c.length]; 
    for(int i = 0; i <= c.length; i++){
      f[i]=c[i]*9/5.0+32;

    }
        return f;
  }
}