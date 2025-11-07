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
      bld += (int)(Math.random() * 6) + 1 + space;
    }
    return bld;
  }

  String lotto(){
    String bld = "";
    String space = " ";
    for(int x = 1; x <= 5; x++){
      bld += (int)(Math.random() * 48) + 1 + space;
    }
    return bld;
  }

  String additionTutor(String playeranswer){
    int firstnum = "";
    int secondnum = "";
    for(int x = 1; x <= 1; x++){
      firstnum = (int)(Math.random() * 999999999) + 1 + space;
      secondnum = (int)(Math.random() * 999999999) + 1 + space;
      String bld = firstnum + secondnum;
      System.out.println(bld);
      if(playeranswer.equals){
        return "correct";
      }
      else{
        return "wrong";
      }
    }
    return bld;
  }

}