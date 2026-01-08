class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  
  void print(Object o){System.out.println(o);}
  void printt(Object o){System.out.print(o);}

  void init(){
    Car car1 = new Car("Ford", "2026 Ford F-150", "Gray metal", 2026, 39330);
    Car car2 = new Car("Toyota", "2026 Toyota RAV4", "White", 2026, 31900);

    car1.honk();
    car2.honk();
  }


  

  
  int randInt(int lower, int upper){
    int range = upper - lower;
    return (int)(Math.random()*range+lower);
  }


}