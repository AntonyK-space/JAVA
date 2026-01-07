class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
    Dog dog1 = new Dog("German Shepard", 10, "Toto");
    dog1.dogname = "Toto";
    dog1.dogage = 10;
    dog1.dogbreed = "German Shepard";

    Dog dog2 = new Dog("Poodle", 12, "Snoopy");
    dog1.dogname = "Snoopy";
    dog1.dogage = 12;
    dog1.dogbreed = "Poodle";

    Dog dog3 = new Dog("Pug", 11, "Poophy");
    dog1.dogname = "Poophy";
    dog1.dogage = 11;
    dog1.dogbreed = "Pug";

    dog1.bark();
    dog2.bark();
    dog3.bark();
  }





  
  int randInt(int lower, int upper){
    int range = upper - lower;
    return (int)(Math.random()*range+lower);
  }

}