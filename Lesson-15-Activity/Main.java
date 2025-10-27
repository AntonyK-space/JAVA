class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
      String n = spaces(15);
      System.out.println(n);
      double y = harmonic(20);
      System.out.println(y);
      int FIB = fib(5);
      System.out.println(FIB);
  }

  String spaces(int N){
    String result = "";
      for(int x = 0; x <= N; x++){
          result += " ";
      }
      return result;
  }

  double harmonic(int N){
    double sum = (0);
    for(int x = 1; x <= N; x++){
      sum += (1.0 / x);
    }
    return sum;
  }
  
  int fib(int N){
      int firstNum = (0);
      int nextNum = (0);
      int i = (0);
      for(int x = 0; x <= N; x += i){
          firstNum += (i);
          nextNum += (firstNum + x);
      }
      return nextNum;
    }
}