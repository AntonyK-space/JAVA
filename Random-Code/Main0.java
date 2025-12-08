class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
    //Input.writeFile("Encoded.txt", );
    String rome = Input.readFile("Original.txt");
    String encoded = encode(rome);
    System.out.println(encoded);
  }

  String encode(String x){
    String bld = "";
    char ch = ' ';
    for(int i = 0; i < x.length(); i++){
       ch = x.charAt(i);
      if(x.length() != 100){
        int ascii = (int) ch;
        ch = (char) (ascii - 3);
        bld += ch;
      }
    }
    return bld;
  }








}