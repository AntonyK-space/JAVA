class Animal{

  String animalSpecies;
  double weight;
  double height;

  
  Animal(String animalSpecies, double weight, double height){
    this.animalSpecies  = animalSpecies;
    this.weight         = weight;
    this.height         = height;
  }

  String isHealthy(){
    if(weight > 30 && weight < 100){
      return "True";
    }
    else{
      return "False";
    }
  }

  double poundsToKilos(){
    return weight / 2.205;
  }

  // other class functions
  
  
  
}