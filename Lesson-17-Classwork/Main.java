class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
        String x = swapLetter("Feed me");
        System.out.println(x);

    
  }

  String swapLetter(String txt){
    String bld = "";
    for(int x = 0; x <= txt.length()-1; x++){
      String letter = txt.substring(x, x+1);
      if(letter.equals("e")){
        bld += "%";
      }
      else{
        bld += "letter";
      }
    }
    return bld;
  }

  String encryption2(String s){
      String bld = "";
      int y = s.length();
      String firstHalf = s.substring(0, y);
      String secondHalf = s.substring(y);
      for(int x = 0; x <= firstHalf.length(); x++){
          
      }
  
    }
  //will use reverse for problem 3
  String reverse(String s){
    String bld="";
    for(int x=s.length()-1; x>=0; x--)
      bld+=s.substring(x,x+1);

    return bld;
  }


}