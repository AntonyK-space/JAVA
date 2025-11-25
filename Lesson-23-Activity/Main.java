class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  
  void print(Object o){System.out.println(o);}
  void printt(Object o){System.out.print(o);}

  void init(){
      double price[] = {10.75, 9.85, 20.50, 14.99, 75};
      double z = tax(price);
      System.out.println(z);

      int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
      String tf = findNum(nums);
      System.out.println(tf);
  }



  // Use these functions below for the activity

  double tax(double[] x){
    double afterTax = 0;
    double sum = 0;
    for(int y = 0; y < x.length; y++){
      afterTax = x[y] * .08525;
      sum += x[y] + afterTax ;
    }
    return sum;
  }

  String findNum(int[] x){
    int currentNum = 0;
    for(int i = 0; i < x.length; i++){
      currentNum = x[i];
      if(currentNum == 20){
        return "Found";
      }
      else{}
    }
    return "Not Found";
  }


  String convertToEmoji(String code){
    return String.valueOf(Character.toChars(
                               Integer.parseInt(code, 16)));
  }

  
  int randInt(int lower, int upper){
    int range = upper - lower;
    return (int)(Math.random()*range+lower);
  }

  boolean isPrime(int n){
    int divisor = 2;
    while(n%divisor !=0){
      divisor+=1;
    }
    if(divisor==n)
      return true;
    else
      return false;
  }
}