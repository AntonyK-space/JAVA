class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
        String x = sentence(javac);
        System.out.println(x);
        String z = encode("word");
        System.out.println(z);
  }

  String sentence(String msg){
  int count=0;
  String bld = "";
  for(int x=0; x<=msg.length()-1; x++){
    bld = 
    if(msg.indexOf(c).equals('c')){
   	count++;
    }
  }
  return count;
}
  


String encode(String s){
  String bld = "";
  for(int i = 0; i < s.length; i++){
    char ch = s.charAt(i);
    if(ch == 'z'){
      bld += 'a';
    }
    else if(ch == 'Z'){
      bld += 'Z';
    }
    else{
      int ascii = (int) ch;
      ch = (char) (ascii+1);
      bld += ch;
    }
  }
  return bld;
}

}