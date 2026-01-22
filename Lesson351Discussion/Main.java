class Main {
  public static void main(String[] args)throws Exception {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init()throws Exception{

    CreateList list=new CreateList("CR101.csv");
    Student[] students = list.getStudentArray();
    System.out.println(students.length + 1);
    
    double sum = 0;
    for(int x = 0; x <= students.length - 1; x++){
      Student student = students[x];
      sum += student.gpa;
    }
    System.out.println("School average GPA " + sum/students.length);

    int studentInMrCClass = 0;
    for(int x = 0; x <= students.length - 1; x++){
      Student student = students[x];
      if(student.teachers.equals("Mr.Castro")){
        studentInMrCClass += 1;
      }
    }
    System.out.println("The amount of students taking Mr. Castro's class is " + studentInMrCClass);
    
    int studentInSHF21U2C = 0;
    for(int x = 0; x <= students.length - 1; x++){
      Student student = students[x];
      if(student.courses.equals("SHF21U2C")){
        studentInSHF21U2C += 1;
      }
    }
    System.out.println("The amount of students taking the SHF21U2C class is " + studentInSHF21U2C);

    String studentId = "";
    for(int x = 0; x <= students.length - 1; x++){
      Student student = students[x];
      if(student.findCourseStartingWith("MK") && student.findTeacher("Porchetta")){
        studentId = student.id;
      }
      else{
        studentId = "";
      }
      System.out.println(studentId);
    }
  }







  
  int randInt(int lower, int upper){
    int range = upper - lower;
    return (int)(Math.random()*range+lower);
  }

}