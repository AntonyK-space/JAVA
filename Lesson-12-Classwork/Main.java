class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
   boolean x = collegeCredit("930227M");
   System.out.println(x);

    
  }
  boolean collegeCredit(String code){
    String letter = code.substring(6,7);
    if(letter == "E" || letter == "M"){
      return true;
    }
    else{
      return false;
    }
  }
  String getCounsoler(String cass){
    String initial = cass.substring(2,3);
    if(initial == "B"){
      return "Berrouet";
    }
    else if(initial == "C"){
      return "Chu";
    }
    else if(initial == "D"){
      return "Dinn";
    }
    else if(initial == "E"){
      return "Eyzengart";
    }
    else if(initial == "F"){
      return "Flores";
    }
    else if(initial == "G"){
      return "Gibson";
    }
    else if(initial == "L"){
      return "Shim Lee";
    }
    else if(initial == "M"){
      return "Meltzer";
    }
    else if(initial == "P"){
      return "Paccione";
    }
    else if(initial == "S"){
      return "Fiore";
    }
    else if(initial == "T"){
      return "Tsai";
    }
    else if(initial == "Z"){
      return "Zayes";
    }
    else{
      return "NotReal";
    }
  }
 
}