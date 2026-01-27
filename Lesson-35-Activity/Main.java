class Main {
  public static void main(String[] args)throws Exception {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init()throws Exception{

    CreateList list=new CreateList("CR101.csv");
    Student[] students = list.getStudentArray();

    int studentsPassing = 0;
    int studentsFailing = 0;
    for(int i = 0; i <= students.length - 1; i++){
      if(students.gpa <= 3.0){
        studentsPassing += 1;
      }
      else{
        studentsFailing += 1;
      }
    }

    int studentsFailingInCClass = 0;
    int studentsFailingNotInMusicClass = 0;
    int studentsFailingInMusicClass = 0;
    for(int i = 0; i <= students.length - 1; i++){
      if(students.gpa <= 3.0 && students.teachers.equal("Castro")){
        studentsFailingInCClass += 1;
      }
      else{
        studentsFailingInCClass += 0;
      }
    }

    for(int i = 0; i<= students.length - 1; i++){
      Student student = students;
      if(students.gpa <= 3.0 && student.findCourseStartingWith("UL") == True){
        studentsFailingInMusicClass += 1;
      }
      else if(students.gpa <= 3.0 && student.findCourseStartingWith("UL") == False){
        studentsFailingNotInMusicClass += 1;
      }
      else{
        studentsFailingNotInMusicClass += 0;
        studentsFailingInMusicClass += 0;
      }
    }
    
    System.out.println("The number of students passing is " + studentsPassing + "and the number of students failing is " + studentsFailing);
    System.out.println("The percentage of students failing is " + studentsFailing/(students.length - 1) + "%");
    System.out.println("The amount of students failing and are in Mr. Castro's class is " + studentsFailingInCClass);
    System.out.println("The number of students failing and not in music class is " + studentsFailingNotInMusicClass);
    System.out.println("The number of students failing and in music class is " + studentsFailingInMusicClass);
    // add your code below here

    
    
    
  }







  
  int randInt(int lower, int upper){
    int range = upper - lower;
    return (int)(Math.random()*range+lower);
  }

}