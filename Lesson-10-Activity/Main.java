
class Main {

	public static void main(String[] args) {
    	(new Main()).init();
	}

	void init(){
			double output = gpa(93);
			System.out.println(output);
			String output1 = BMI(126.5, 68.5);
			System.out.println(output1);
			double output2 = shippingCost(6547465446876565658765646743436538598567.0);
			System.out.println(output2);
  }

  double gpa(double GPA){
	if(GPA > 90){
		return(GPA * 1.1);
	}
	else{
		return(GPA);
	}
  }

  String isGraduating(int gradelv, int credits){
	if(gradelv == 12 && credits >= 44){
		return "TRUE";
	}
	else{
		return "FALSE";
	}
  }
 
    String BMI(double weight, double height){
		BMI = weight / Math.pow(height, 2);
		if(BMI <= 18.4){
			return "Underweight";
		}
		else if(BMI >= 18.5 && BMI <= 24.9){
			return "Normal";
		}
		else if(BMI >= 25.0 && BMI <= 39.9){
			return "Overweight";
		}
		else{
			return "Obese";
		}
	}
  
    double shippingCost(double weight){
		if(weight <= 10.0){
			return (0.00);
		}
		else if(weight >= 10.0 && weight <= 15.0){
			return (5.00);
		}
		else if(weight >= 15.0 && weight <= 25.0){
			return (10.0);
		}
		else{
			return (10.0 + ((weight - 25.0) * 0.02));
		}
	}

    String blueOrViolet(int lightfreq){
		if(lightfreq >= 600 && lightfreq <= 670){
			return "True";
		}
		else if(lightfreq >= 700 && lightfreq <= 750){
			return "True";
		}
		else{
			return "False";
		}
	}

}