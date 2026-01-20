class CartItem{
  String itemName;
  double itemPrice;
  int quantity;
  boolean onSale;

  //Create the constructor
  CartItem(String itemName, double itemPrice, int quantity, boolean onSale){
    this.itemName  = itemName;
    this.itemPrice = itemPrice;
    this.quantity  = quantity;
    this.onSale    = onSale;
  }

  double getItemPrice(){
    double price = 0;
    if(onSale == true){
      price = itemPrice * 0.9 * quantity;
    }
    else{
      price = itemPrice * quantity;
    }
    return price;
  }

  String displayName(){
    return itemName;
  }
  
  // write getPrice based on condition detailed in 
  // challenges.txt



}