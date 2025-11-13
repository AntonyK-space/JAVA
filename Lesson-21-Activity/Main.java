class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  
  void print(Object o){System.out.println(o);}
  void printt(Object o){System.out.print(o);}

  void init(){
    double x = pennyDouble();
    System.out.println(x);
  }

  double pennyDouble(){
    double p = 0.01;
    int day = 1;
    while(p <= 5){
        p *= 2;
        day++;
    }
    return day;
  }

  double addTwoNumbers(){
    
  }
  
  int randInt(int lower, int upper){
    int range = upper - lower;
    return (int)(Math.random()*range+lower);
  }

}