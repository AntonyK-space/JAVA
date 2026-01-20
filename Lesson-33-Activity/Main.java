class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  
  void print(Object o){System.out.println(o);}
  void printt(Object o){System.out.print(o);}

  void init(){
    CartItem item1 = new CartItem("Milk", 1, 5, true);
    CartItem item2 = new CartItem("Bread", 1.50, 3, false);
    CartItem item3 = new CartItem("Jam", 0.75, 2, true);

    double a = item1.getItemPrice();
    double b = item2.getItemPrice();
    double c = item3.getItemPrice();
    double sum = (a + b + c) * (1 - 0.08675);

    System.out.println(item1.displayName());
    System.out.println(item1.getItemPrice());
    System.out.println(item2.displayName());
    System.out.println(item2.getItemPrice());
    System.out.println(item3.displayName());
    System.out.println(item3.getItemPrice());
    System.out.println("The total sum of purchase is " + sum);
    
  }
  

  
  int randInt(int lower, int upper){
    int range = upper - lower;
    return (int)(Math.random()*range+lower);
  }


}