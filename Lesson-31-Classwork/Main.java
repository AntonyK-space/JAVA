class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
    Animal ani1 = new Animal("Penguin", 45, 3);
    Animal ani2 = new Animal("Dog", 55, 5);

    System.out.println(ani1.isHealthy());
    System.out.println(ani2.isHealthy());
  }

  int randInt(int lower, int upper){
    int range = upper - lower;
    return (int)(Math.random()*range+lower);
  }

}