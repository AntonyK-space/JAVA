class Student{

  
  String firstName;
  int gradeLevel;
  double gpa;
  double[] grades;
  String[] classCourses;

  
  Student(String firstName, int gradeLevel, double gpa, 
          double[] grades, String[] classCourses){
    
    this.firstName  = firstName;
    this.gradeLevel = gradeLevel;
    this.gpa        = gpa;
    this.grades     = grades;
    this.classCourses = classCourses;
  }


  // class functions

  double calculateAvg(){
    double sum=0;
    for(int x=0; x<=this.grades.length-1;x++){
      sum+=this.grades[x];
    }
    return sum/this.grades.length;
  }

  String ifClassOrNoClass(){
    String bld = "";
    String result = "";
    for(int i = 0; i <= this.classCourses.length - 1; i++){
      bld = this.classCourses[i];
      if(bld == "EEFG7QH"){
        result += "True";
      }
      else if(bld == "FSFC3"){
        result += "True";
      }
      else if(bld == "HQFC3TH"){
        result += "True";
      }
      else if(bld == "HUF43X"){
        result += "True";
      }
      else if(bld == "SCF43QG"){
        result += "True";
      }
      else if(bld == "PGF43Q3C"){
        result += "True";
      }
      else if(bld == "MRF43"){
        result += "True";
      }
      else{
        result += "False";
      }
    }
    return result;
  }








}