class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  
  void print(Object o){System.out.println(o);}
  void printt(Object o){System.out.print(o);}

  void init(){
      String x = rollDice();
      System.out.println(x);

    
  }

  String rollDice(){
    String bld ="";
    for(int x = 1; x <= 2; x++){
      bld += (int)(Math.random() * 6) + 1 ;
    }
    return bld;
  }


}