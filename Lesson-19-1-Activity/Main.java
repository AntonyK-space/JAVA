class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  
  void print(Object o){System.out.println(o);}
  void printt(Object o){System.out.print(o);}

  void init(){
      String x = rollDice();
      System.out.println(x);
      String y = lotto();
      System.out.println(y);
    
  }

  String rollDice(){
    String bld = "";
    String space = " ";
    for(int x = 1; x <= 2; x++){
      bld += (int)(Math.random() * 7) + 1 + space;
    }
    return bld;
  }

  String lotto(){
    String bld = "";
    String space = " ";
    for(int x = 1; x <= 5; x++){
      bld += (int)(Math.random() * 49) + 1 + space;
    }
    return bld;
  }

}