class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
        String x = addNums((int)(Math.random() * 56) - 5,(int)(Math.random() * 56) - 5);
        System.out.println(x);
   
  }

  int addNums(int firstnum, int secondnum){
    int numbers = (firstnum - secondnum);
    System.out.println(numbers);
  }
  
}