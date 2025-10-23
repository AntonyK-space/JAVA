class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
          String num = creditCardType("4809968");
          System.out.println(num);
          String latin = pigLatin("pig");
          System.out.println(latin);
          String state = nycLocate("11367");
          System.out.println(state);
          String month = getMonth("10/22/25");
          System.out.println(month);
  }

  String creditCardType(String number){
    if(number.substring(0,1).equals("4")){
      return "Visa";
    }
    else if(number.substring(0,2).equals("34") || number.substring(0,2).equals("37")){
      return "America Express";
    }
    else if(number.substring(0,2).equals("36")){
      return "Dinner Club";
    }
    else if(number.substring(0,2).equals("51") || number.substring(0,2).equals("55")){
      return "Mastercard";
    }
    else if(number.substring(0,4).equals("6011") || number.substring(0,2).equals("65")){
    return "Discovery";
    }
    else{
      return "Another Card";
    }
  }
  
  String pigLatin(String sentence){
    String end = sentence.substring(1);
    String begin = sentence.substring(0,1);
    return end + begin + "ay";
  }

  String nycLocate(String zipcode){
    if(zipcode.substring(0,3).equals("100") || zipcode.substring(0,3).equals("101") || zipcode.substring(0,3).equals("102")){
      return "Manhattan";
    }
    else if(zipcode.substring(0,3).equals("103")){
      return "Staten Island";
    }
    else if(zipcode.substring(0,3).equals("104")){
      return "Bronx";
    }
    else if(zipcode.substring(0,3).equals("112")){
      return "Brooklyn";
    }
    else if(zipcode.substring(0,3).equals("113") || zipcode.substring(0,3).equals("114") || zipcode.substring(0,3).equals("111")){
      return "Queens";
    }
    else{
      return "IDK";
    }
  }

  String getMonth(String date){
    if(date.substring(0,2).equals("01")){
      return "January";
    }
    if(date.substring(0,2).equals("02")){
      return "Febuary";
    }
    if(date.substring(0,2).equals("03")){
      return "March";
    }
    if(date.substring(0,2).equals("04")){
      return "April";
    }
    if(date.substring(0,2).equals("05")){
      return "May";
    }
    if(date.substring(0,2).equals("06")){
      return "June";
    }
    if(date.substring(0,2).equals("07")){
      return "July";
    }
    if(date.substring(0,2).equals("08")){
      return "August";
    }
    if(date.substring(0,2).equals("09")){
      return "September";
    }
    if(date.substring(0,2).equals("10")){
      return "October";
    }
    if(date.substring(0,2).equals("11")){
      return "November";
    }
    if(date.substring(0,2).equals("12")){
      return "December";
    }
    else{
      return "Not A Month";
    }
  }
  
}