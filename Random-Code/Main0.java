class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
    Input.writeFile("Encoded.txt", 999999);
    Input.readFile("Original.txt");
    String rome = Input.readFile("Original.txt");
    String encoded = encode(rome);
    System.out.println(encoded);
  }

  String encode(String x){
    String bld = "";
    char ch = ' ';
    for(int i = 0; i < x.length(); i++){
       ch = x.charAt(i);
      if(x.length() != 121000){
        int ascii = (int) ch;
        ch = (char) (ascii - 5);
        bld += ch;
      }
      else if( ch == 'v'){
        bld += a;
      }
      else if( ch == 'W'){
        bld += B;
      }
      else if( ch == 'w'){
        bld += b;
      }
      else if( ch == 'X'){
        bld += c;
      }
      else if( ch == 'x'){
        bld += c;
      }
      else if( ch == 'Y'){
        bld += D;
      }
      else if( ch == 'y'){
        bld += d;
      }
      else if( ch == 'Z'){
        bld += e;
      }
      else if( ch == 'z'){
        bld += e;
      }
      else if( ch == 'V'){
        bld += A;
      }
    }
    return bld;
  }








}