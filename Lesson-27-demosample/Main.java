class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
    char[] sub = new char[5];
    sub[0] = 'a';
    sub[1] = 'e';
    sub[2] = 'i';
    sub[3] = 'l';
    sub[4] = 'o';

    char[] sub2 = new char[5];
    sub2[0] = '4';  // Club
    sub2[1] = '3';  // Spade
    sub2[2] = '1';  // Heart
    sub2[3] = '1';  // Diamond
    sub2[4] = '0';  // Bralle symbol

    
    // Encoding message
    String file = Input.readFile("test.txt");

    //substituion
    String encodedMsg1 = subEncryption(file,sub,sub2);
    Input.writeFile("Encode1.txt",encodedMsg1);

    // caesar cipher
    String encodedMsg2 = encode(encodedMsg1);
    Input.writeFile("Encode2.txt",encodedMsg2);

    // reverse
    String encodedMsg3 = reverse(encodedMsg2);
    Input.writeFile("Encode3.txt",encodedMsg3);

    
    // decoding message
    //String file2 = Input.readFile("Encode1.txt");
    
    //String decodedMsg1 = reverse(file2);
    //Input.writeFile("Decode1.txt", decodedMsg1);
    
    //String decodedMsg2 = decode(decodedMsg1);
    //Input.writeFile("Decode2.txt", decodedMsg2);
    
     //String decodedMsg3 = subEncryption(decodedMsg2, sub2, sub);
    //Input.writeFile("Decode1.txt", decodedMsg3);
  
    String encoded = reverse(file);
    String newcode = encode(encoded);
    System.out.println(newcode);
    
  }
  // Level 1 reverse string
  String reverse(String txt){
    String bld = "";
    for(int i = txt.length(); i > 0; i--){
      bld += txt.substring(i, i + 1);
    }
    return bld;
  }
  
  
  //Level 2 Cipher encoding with no wrapping
  String encode(String x){
    String bld= "";
    for(int i = 0; i < x.length(); i++){
      char ch = x.charAt(i);
      if(x.length() != 100){
        int ascii = (int) ch;
        ch = (char) (ascii - 3);
        bld += ch;
      }
    }
    return bld;
  }

  
  String decode(String txt){
    String bld="";
   
    return bld;
  }

  // Level 3 Substituion encoding
  String subEncryption(String s, char[] sub, char[] sub2){
    String bld="";
   
    return bld;
  }
  
  
  int randInt(int lower, int upper){
    int range = upper - lower;
    return (int)(Math.random()*range+lower);
  }

}