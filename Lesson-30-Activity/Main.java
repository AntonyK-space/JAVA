class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  
  void print(Object o){System.out.println(o);}
  void printt(Object o){System.out.print(o);}

  void init(){
    Car car1 = new Car("Ford", "2026 Ford F-150", 39330);
    Car car2 = new Car("Toyota", "2026 Toyota RAV4", 31900);

    car1.carnoises();
    car2.carnoises();
  }


  

  
  int randInt(int lower, int upper){
    int range = upper - lower;
    return (int)(Math.random()*range+lower);
  }


}