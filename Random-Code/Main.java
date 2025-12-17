class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
    String rome = Input.readFile("Original.txt");
    String encoded = encode(rome);
    Input.writeFile("Encode1.txt",encoded);
    String sw = Input.readFile("Encode1.txt");
    String swap = paws(sw);
    Input.writeFile("Encode2.txt", swap);
    String sub = Input.readFile("Encode2.txt");
    String substitution = geometry(sub);
    Input.writeFile("Encode3.txt", substitution);
  }

  String encode(String x){
    String bld = "";
    char ch = ' ';
    for(int i = 0; i < x.length(); i++){
       ch = x.charAt(i);
      if( ch == 'v'){
        bld += 'a';
      }
      else if( ch == 'W'){
        bld += 'B';
      }
      else if( ch == 'w'){
        bld += 'b';
      }
      else if( ch == 'X'){
        bld += 'c';
      }
      else if( ch == 'x'){
        bld += 'c';
      }
      else if( ch == 'Y'){
        bld += 'D';
      }
      else if( ch == 'y'){
        bld += 'd';
      }
      else if( ch == 'Z'){
        bld += 'e';
      }
      else if( ch == 'z'){
        bld += 'e';
      }
      else if( ch == 'V'){
        bld += 'A';
      }
      else if( ch == ' '){
        bld += ' ';
      }
      else if( ch == '.'){
        bld += '.';
      }
      else if( ch == ','){
        bld += ',';
      }
      else if( ch == '1'){
        bld += '6';
      }
      else if( ch == '2'){
        bld += '7';
      }
      else if( ch == '3'){
        bld += '8';
      }
      else if( ch == '4'){
        bld += '9';
      }
      else if( ch == '5'){
        bld += '0';
      }
      else if( ch == '6'){
        bld += '1';
      }
      else if( ch == '7'){
        bld += '2';
      }
      else if( ch == '8'){
        bld += '3';
      }
      else if( ch == '9'){
        bld += '4';
      }
      else if( ch == '0'){
        bld += '5';
      }
      else if(x.length() != 999999999){
        int ascii = (int) ch;
        ch = (char) (ascii + 5);
        bld += ch;
      }
    }
    return bld;
  }

    String paws(String x){
      String bld = "";
      char ch = ' ';
      int placement = 0;
      for(int i = 0; i < x.length(); i++){
        placement = i % 2;
        ch = x.charAt(i);
        int ascii = (int) ch;
        if( ch == ' '){
          bld += ' ';
        }
        else if( ch == '.'){
          bld += '.';
        }
        else if( ch == ','){
          bld += ',';
        }
        else if( ch == 'Z' && placement == 0){
          bld += 'A';
        }
        else if( ch == 'z' && placement == 0){
          bld += 'a';
        }
      else if( ch == '1' && placement == 0){
        bld += '2';
      }
      else if( ch == '2' && placement == 0){
        bld += '3';
      }
      else if( ch == '3' && placement == 0){
        bld += '4';
      }
      else if( ch == '4' && placement == 0){
        bld += '5';
      }
      else if( ch == '5' && placement == 0){
        bld += '6';
      }
      else if( ch == '6' && placement == 0){
        bld += '7';
      }
      else if( ch == '7' && placement == 0){
        bld += '8';
      }
      else if( ch == '8' && placement == 0){
        bld += '9';
      }
      else if( ch == '9' && placement == 0){
        bld += '0';
      }
      else if( ch == '0' && placement == 0){
        bld += '1';
      }
        else if( placement == 0){;
          ch = (char) (ascii + 1);
          bld += ch;
        }
        else{
          bld += ch;
        }
      }
      return bld;
    }

    String geometry(String t){
      String bld = "";
      char ch = ' ';
      for(int i = 0; i < t.length(); i++){
       ch = t.charAt(i);
       int ascii = (int) ch;
      if( ascii >= 97 && ascii <= 122){
       int newascii = ascii - 33;
       ch = (char) (newascii + 9632);
       bld += ch;
      }
      else if( ascii >= 65 && ascii <= 90){
       int newAscii = ascii - 65;
       ch = (char) (newAscii + 9632);
       bld += ch;
      }
      else if( ch == ' '){
        bld += ' ';
      }
      else if( ch == '.'){
        bld += '.';
      }
      else if( ch == ','){
        bld += ',';
      }
    }
    return bld;
  }
  }