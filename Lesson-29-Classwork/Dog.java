class Dog{
    String dogbreed;
    int dogage;
    String dogname;

    Dog(String dogbreed, int dogage, String dogname){
        //Constructor
        this.dogbreed = dogbreed;
        this.dogage = dogage;
        this.dogname = dogname;
    }

    void bark(){
        System.out.println("Bark bark bark");
    }
}