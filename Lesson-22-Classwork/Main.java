class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
   String[] friends = {"Barthomelew", "Daniel", "Thomas", "Micheal"};
   System.out.println(friends[0]);
   double[] tempc = {79.5, 39.7, 29.3, 29.8};
   double[] tempf = celsiusToFarhenheit(temp);
   System.out.println(tempf);
  }

  

  double[] celsiusToFarhenheit(double[] c){
    double[] f = new double[c.length]; 
    for(int x = 0; x <= c.length; x++){
      f[x]=c[x]*9/5.0+32;

    }
        return f;
  }
}